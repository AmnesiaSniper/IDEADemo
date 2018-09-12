package jdbc;

import java.sql.*;
import java.sql.ResultSet;

/**
 * Created by w18805 on 2018/07/13.
 */
public class jdbcMysql {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");


            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=UTF-8",
                    "root", "root");
            Statement st = conn.createStatement();
            String sql = "select * from student";

            st.execute(sql);
            ResultSet rs = st.getResultSet();

            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
