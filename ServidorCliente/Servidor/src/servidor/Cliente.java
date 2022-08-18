package servidor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Administrador
 */
public class Cliente {
    public static void main(String[] args) throws Exception {
    
    ObjectInputStream objectInputStream = null;
    ObjectOutputStream objectOutputStream = null;
    Socket socket = null;
    
    try{
    
           socket = new Socket("127.0.0.1", 5432);
           objectOutputStream = new ObjectOutputStream (socket.getOutputStream());
           objectInputStream = new ObjectInputStream (socket.getInputStream());
           
           objectOutputStream.writeObject("Jose");
           
           String ret = (String) objectInputStream.readObject();
            System.out.println("\n" + ret);

    }
    catch(Exception ex){
        ex.printStackTrace();
    }
    finally {
        if(objectOutputStream != null)
           objectOutputStream.close();
                
        if(objectInputStream != null)
           objectInputStream.close();
                    
        if(socket != null)
           socket.close();
                
        System.out.println("\nConexion cerrada");
                    
        }
}}
