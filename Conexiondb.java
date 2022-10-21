
package AH5;

import conexionConsola.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexiondb {

//colocar driver y libreria
Connection con; //
    String url="jdbc:mysql://localhost:3306/test";
    String user="root";
    String pass="1234";
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
           
        } catch (Exception e) {
            System.out.println("Error en la conexion!");
            System.out.println(e);
        }      
        return con; 
    }

public static void main(String []args){
    Conexiondb test = new Conexiondb();
    System.out.println(test.Conectar()+" Conectado a MySQL!!");
}

    
}

