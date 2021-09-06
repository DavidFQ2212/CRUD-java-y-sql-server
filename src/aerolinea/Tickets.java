//en esta clase se hara el metodo para los tickets
//Flores Quiñones David
package aerolinea;
import java.io.*;
import javax.swing.JOptionPane;
public class Tickets {
    //se hace el metodo
    public  void tickets(String pasajero,String nvuelo,String asiento,String destino,String hrvuelo){
        //se hace la uta con el nombre del archivo que se va a crear
        String archv = "\\"+pasajero+".txt";
        String ruta = "C:\\Users\\david\\Desktop\\tickets"+archv;
        //se crean variable spara poder hacer el documento de texto
        File f;
        FileWriter bw;
        PrintWriter wr;
        try{
            f=new File(ruta);//se crea el archivo con la ruta en el lugar que se va a crear
            bw=new FileWriter(f);
            wr=new PrintWriter(bw);
            wr.write("pasajero:"+pasajero);//para la primera linea
            wr.append("\n ******************************");//para agregar mas lineas
             wr.append("\n ******************************");
            wr.append("\n El destino es:"+destino);
            wr.append("\n ******************************");
            wr.append("\n El Numero de asiento es:"+asiento);
            wr.append("\n ******************************");
            wr.append("\n El numero de vuelo es:"+nvuelo);
            wr.append("\n ******************************");
            wr.append("\n La hora del vuelo es:"+hrvuelo);
            wr.close();//se cierran
            bw.close();
            
        }catch(Exception e){//por si algo sale mal que indique
            JOptionPane.showMessageDialog(null,e.toString());
        
    }
}
}
