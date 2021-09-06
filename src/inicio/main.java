//se hace la clase con el metodo main
//David Flores Quiñones
package inicio;


import inicioSesion.login;

public class main {
    public static void main(String[] args) {
        //se manda a llamar como primero la pestaña para inicar secion
        login primero = new login();
        primero.setVisible(true);
    }
}
