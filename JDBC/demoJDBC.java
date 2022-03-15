package com.JDBC;
import javax.swing.plaf.nimbus.State;
import java.sql.*;

/*
Import the package (java.sql.*)
Load and Register driver
Establish the connection
Create the statement
Execute the query
Process results
close

 */

public class demoJDBC {
    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/demoJava";
        String uname = "root";
        String pass = "Windows@123";
        String query = "select sname from student where rollno = 2";

      // Class.forName("com.mysql.jdbc.Driver"); //Load the driver. Different driver for the different database.
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next(); //Before fetching the values, we have to call next method so it will move to the first record. Before pointer does not at 1st record.
        String name = rs.getString("sname"); //This columnname should be column name or number.

        System.out.println(name);

        st.close();
        con.close();
    }
}
