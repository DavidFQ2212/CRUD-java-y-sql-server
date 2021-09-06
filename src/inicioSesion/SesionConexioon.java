//en esta clase se hara la conexion para iniciar la secion
package inicioSesion;
//Flores Quiñones David

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SesionConexioon {
//se realiza la conexion
    Connection conexion = null;
    Integer resultado = 0;
    String url = "jdbc:sqlserver://WIN7:1433;" + "database=app;" + "user=sa;" + "password=hola;";
//se haace el metodo conectar para sql server
    public void conectar() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(url);

        } catch (Exception e) {//por si algo sale mal que se inique 
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public int login(String user, String contr) {//se hace el metodo para ingresar neduabre el usuario y la contraseña

        

        try {//el try es por la consulta
            PreparedStatement ps;
            ResultSet rs;
            //se prepara la consulta
            ps = conexion.prepareStatement("SELECT usuario ,contraseña FROM usuarios WHERE usuario = ? and contraseña = ?");
            ps.setString(1, user);
            ps.setString(2, contr);
            
            rs = ps.executeQuery();//se realiza la consulta

            //si se conecta realiza un mensaje  y si no son correctos imprime mensaje y si es correcto deja pasar la otra pestaña
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "bienvenido");
                resultado = 1;
            } else {
                JOptionPane.showMessageDialog(null, "Amigo lamento  informarte que este perfil no coencide con el tuyo verifique el usuario Y/O contraseña sean correctos :)");
                resultado = 0;
            }
        } catch (Exception e) {//por si algo sale mal que indique 
            JOptionPane.showMessageDialog(null, e);
        }
        return resultado;// que retonerne el valor resultado para verificar que el inicio de secion 

    }
}
