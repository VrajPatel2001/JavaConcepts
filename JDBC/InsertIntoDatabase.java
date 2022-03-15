package com.JDBC;

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

public class InsertIntoDatabase {
    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/demoJava";
        String uname = "root";
        String pass = "Windows@123";
        String query = "insert into student values (4,'Bhavin')";
        //Instead of writing this, we can make ideal query and use it in preparedStatement

        String preQuery = "insert into student values (?,?)"; // ? will be replaced by values.

      // Class.forName("com.mysql.jdbc.Driver"); //Load the driver. Different driver for the different database.
        Connection con = DriverManager.getConnection(url,uname,pass);
//        Statement st = con.createStatement();
//        int count = st.executeUpdate(query); //this will return the total number of rows was affected.

        PreparedStatement ps = con.prepareStatement(preQuery); //This will make the preparedStatement.
        ps.setInt(1,4); //Before execute the query, we have to set the values.
        ps.setString(2,"Heet");

        int count = ps.executeUpdate(); //Here we do not have to pass query as we already passed in the preparedStatement.
        if(count == 0)
        {
            System.out.println("It was not successfully");
        }
        else
        {
            System.out.println("It was successfully and " + count + " row/s affected");
        }

        ps.close();
        con.close();
    }
}


//DAO Method:
// Data Access Object
// This pattern hides the implementation of JDBC connection and have the class for that and that class will have methods to perform certain actions.
