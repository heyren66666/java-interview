import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/22 21:40
 * @ClassName MySQL
 * @Version 1.0
 **/
public class MySQL {
    public static void main(String args[]){
        try {
            String strurl = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.jdbc.Driver");
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
