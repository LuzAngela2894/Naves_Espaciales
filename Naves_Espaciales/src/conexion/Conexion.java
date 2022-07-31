/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Luz Angela Melo
 */
public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/bd_naves_espaciales";
    public static final String USER = "root";
    public static final String CLAVE = "rZcqL)438WS{)g-kA";

    protected Connection enlace;

    protected void getConexion() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            enlace = DriverManager.getConnection(URL, USER, CLAVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    protected void closeConexion() {
        try {
            enlace.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
