import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.Serializable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/12 0:04
 * @ClassName TestThreadPool
 * @Version 1.0
 **/
public class TestThreadPool {
    private static int produceTaskSleepTime = 2000;
    public static void main(String[] args){
        ThreadPoolExecutor producerPool = new ThreadPoolExecutor(1,1,0,TimeUnit.SECONDS,new ArrayBlockingQueue(3),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        int i= 1;
        while (true){
            try {
                Thread.sleep(produceTaskSleepTime);
                String task = "task@" + i;
                System.out.println("put" + task);
                producerPool.execute(new ThreadPoolTask(task));
                i++;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class ThreadPoolTask implements Runnable,Serializable{
    private static final long serialVersionUID=0;
    private static int consumeTaskSleepTime =2000;
    private String threadPoolTaskData;
    ThreadPoolTask(String tasks){
        this.threadPoolTaskData=tasks;
    }
    public void run(){
        System.out.println("start .."+threadPoolTaskData);
        try {
            Thread.sleep(consumeTaskSleepTime);
        }catch (Exception e){
            e.printStackTrace();
        }
        threadPoolTaskData = null;
    }
}