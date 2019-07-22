import java.sql.*;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/22 21:46
 * @ClassName SQLServer
 * @Version 1.0
 **/
public class SQLServer {
    public static void main(String args[]){
        try {
            String strurl = "jdbc:mircosoft:sqlserver://localhost:1433;DatabaseName=Northwind";
            Class.forName("com.mircosoft.jdbc.sqlserver.SQLServer-Driver");
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
