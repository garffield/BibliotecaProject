package main.java.biblioteca.util;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private static final String URL = "jdbc:mysql://localhost:3306/BibliotecaCRUD";
    private static final String USER = "root";
    private static final String pASSWORD = "root";
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER,pASSWORD);
    }
}