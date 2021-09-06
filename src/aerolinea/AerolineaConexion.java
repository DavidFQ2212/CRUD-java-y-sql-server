//en esta clase se estara realizando la conexion a la base de datos con sql server 2012
//David Flores Quiñones

package aerolinea;
//aqui se importan las librerias 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//se habre la clase 
public class AerolineaConexion {
//se hace la conexion y se importa el ej jdbc42.jar
     Connection conexion = null;
Integer resultado = 0;
//se pone la url que se pone el puerto  mas el nombre de la db y el usuario y la contraseña
    String url = "jdbc:sqlserver://WIN7:1433;" + "database=app;" + "user=sa;" + "password=perrogato2;" ;
    //se hace el  metodo de conectar
public void conectar() throws SQLException{
    //se realiza el try por la conexion
    try{
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conexion = DriverManager.getConnection(url);
        
    }catch(Exception e){
        //para que marque el error en la conexion
        JOptionPane.showMessageDialog(null, e);
         
    }
}
}

