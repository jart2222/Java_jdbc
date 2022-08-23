package org.aguzman.java.jdbc;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/java_curso?serverTimezone=America/Mexico_City";
        String username="root";
        String password="MyNewPass";

        try {
            Connection conn= DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet resultado=stmt.executeQuery("SELECT * FROM productos");
            while (resultado.next()){
                System.out.println(resultado.getString("nombre"));
            }

            resultado.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
