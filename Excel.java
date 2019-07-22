import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/22 22:02
 * @ClassName Excel
 * @Version 1.0
 **/
public class Excel {
    public static void main(String args[]){
        try {
            String strurl = "jdbc:odbc:testExcel";
            Class.forName("com.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection(strurl);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from books");
            if (rs.next()){
                System.out.println(rs.getString("name"));
            }
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
