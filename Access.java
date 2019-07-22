import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/22 21:54
 * @ClassName Access
 * @Version 1.0
 **/
public class Access {
    public static void main(String args[]){
        try {
            String strurl = "jdbc:odbc:test";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection(strurl);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from books;");
            if (rs.next()){
                System.out.println(rs.getString("name"));
            }
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
