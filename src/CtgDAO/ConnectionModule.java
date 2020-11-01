package CtgDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionModule {
//?useTimezone=true&serverTimezone=UTC
    public static Connection getConexao() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ctg", "root", "");
            System.out.println("conectado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

}
