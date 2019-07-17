import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/18 0:20
 * @ClassName HttpConnTest
 * @Version 1.0
 **/
public class HttpConnTest {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.javaeye.com");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.connect();
        Map<String,List<String>> header = conn.getHeaderFields();
        for (String key:header.keySet()){
            System.out.println(key+":"+header.get(key));
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
        String str = null;
        while ((str = br.readLine())!=null){
            System.out.println(str);
        }
        conn.disconnect();
    }
}
