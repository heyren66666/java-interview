import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/17 23:42
 * @ClassName TCPServerB
 * @Version 1.0
 **/

public class TCPServerB {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(8888);
        Socket s = null;
        while((s = ss.accept())!=null){
            new MyThread(s).run();
        }
        ss.close();
    }
}

class MyThread extends Thread{
    private Socket socket;
    public MyThread(Socket socket){
        super();
        this.socket = socket;
    }
    public void run(){
        try {
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.print("now time ="+ new Date());
            pw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}