import sun.security.jgss.spnego.SpNegoContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.Buffer;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/18 0:03
 * @ClassName Chat
 * @Version 1.0
 **/
public class Chat {
    public static void main(String[] args){
        new ReceiveThread(Integer.parseInt(args[0])).start();
        new SendThread(Integer.parseInt(args[1]),Integer.parseInt(args[2])).start();
    }
}

class ReceiveThread extends Thread{
    private DatagramSocket ds;
    public ReceiveThread(int port){
        super();
        try {
            this.ds = new DatagramSocket(port);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
        try {
            byte[] buff = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buff,1024);
            while (true){
                ds.receive(dp);
                String str = new String(dp.getData(),0,dp.getLength());
                System.out.println("receive:"+str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ds.close();
        }
    }
}

class SendThread extends Thread{
    private DatagramSocket ds;
    private int sendPort;
    public SendThread(int port,int sendPort){
        super();
        this.sendPort = sendPort;
        try {
            this.ds = new DatagramSocket(port);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = null;
            while ((str = br.readLine())!=null){
                DatagramPacket dp = new DatagramPacket(str.getBytes(),0,str.length(),InetAddress.getByName("localhost"),sendPort);
                ds.send(dp);
                System.out.println("send"+str);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ds.close();
        }
    }
}
