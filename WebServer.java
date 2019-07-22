import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/17 23:54
 * @ClassName WebServer
 * @Version 1.0
 **/
public class WebServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(80);
        Socket s = null;
        while ((s = ss.accept())!=null){
            new HTTPThread(s).run();
        }
        ss.close();
    }
}

class HTTPThread extends Thread{
    private Socket socket;
    public HTTPThread(Socket socket){
        super();
        this.socket = socket;
    }
    public void run(){
        try {
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.print("<html>");
            pw.print("<body>");
            pw.print("hello this is my web page");
            pw.print("</body");
            pw.print("</html>");
            pw.flush();
            pw.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}