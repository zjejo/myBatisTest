import java.sql.*;

public class mytest {
    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url  = "jdbc:mysql://106.54.53.167:3306/test";
            String user  = "root";
            String pwd  = "root";
            conn = DriverManager.getConnection(url,user,pwd);
            String sql = "select * from test.tb_user";
            statement = conn.prepareStatement(sql);
            // 执行查询
            rs = statement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("user_name"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getDate("birthday"));
            }
            rs.close();
            statement.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
