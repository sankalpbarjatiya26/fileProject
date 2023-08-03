package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection;
    public static Connection getConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fileProject?useSSL=false","root","sankalp");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("connection done !!");
        return connection;
    }
    public static void closeConnection(){
        if(connection!=null){
            try{
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }


}
