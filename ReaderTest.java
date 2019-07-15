import java.io.*;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/11 22:21
 * @ClassName ReaderTest
 * @Version 1.0
 **/
public class ReaderTest {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("e:/test/a.txt");
        InputStreamReader isr = new InputStreamReader(in,"GBK");
        BufferedReader br = new BufferedReader(isr);
        StringBuffer sb = new StringBuffer();
        String str = null;
        while ((str  = br.readLine())!=null){
            sb.append(str);
        }
        System.out.println("a.txt content :"+sb);
        br.close();
    }
}
