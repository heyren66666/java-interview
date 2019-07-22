import java.sql.*;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/22 21:30
 * @ClassName Oracle
 * @Version 1.0
 **/
public class Oracle {
    public static void main(String[] args){
        try {
            String strurl = "jdbc:oracle:thin:@localhost:1521:tiger";
            Class.forName("oracle.jdbc.driver.OracleDriver");
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
