import org.omg.CORBA.INITIALIZE;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/11 23:41
 * @ClassName Store
 * @Version 1.0
 **/
public class Store {
    private final int MAX_SIZE;
    private int count;
    public Store(int n){
        MAX_SIZE=n;
        count=0;
    }
    public synchronized void add(){
        while (count>=MAX_SIZE){
            System.out.println("已经满了");
            try{
                this.wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(Thread.currentThread().toString()+"put"+count);
        this.notifyAll();
    }
    public synchronized void remove(){
        while (count<=0){
            System.out.println("空了");
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().toString()+"get"+count);
        count--;
        this.notify();
    }
    public static void main(String[] args){
        Store s = new Store(5);
        Thread pro = new Producer(s);
        Thread con = new Consumer(s);
        Thread pro2 = new Producer(s);
        Thread con2 = new Consumer(s);
        pro.setName("producer");
        con.setName("consumer");
        pro2.setName("consumer");
        con2.setName("consumer2");
        pro.start();
        pro2.start();
        con.start();
        con2.start();
    }
}
    class Producer extends Thread{
        private Store s;
        public Producer(Store s){
            this.s=s;
        }
        public void run(){
            while (true){
                s.add();
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
    class Consumer extends Thread{
        private Store s;
        public Consumer(Store s){
            this.s=s;
        }
        public void run(){
            while (true){
                s.remove();;
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

