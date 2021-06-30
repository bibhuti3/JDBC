package org.example;
import java.sql.*;

public class InsertDemo {
    public static void main(String args[])
    throws SQLException
    {
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost/mySQL", "root", "Bibhu");
        PreparedStatement pstmt = connection.prepareStatement("insert into Sales_Rep values(?,?,?,?)");

        pstmt.setInt(1,23);
        pstmt.setString(2,"Bibhuti");
        pstmt.setString(3,"Guwahati");
        pstmt.setDouble(4,0.5);

        System.out.println("Record registered successfully");
        pstmt.executeUpdate();
    }


}
