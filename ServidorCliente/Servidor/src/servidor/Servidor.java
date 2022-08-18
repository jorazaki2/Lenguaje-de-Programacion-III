package servidor;

//import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrador
 */

public class Servidor {

    public static void main(String[] args) throws Exception {
        //Creacion de variables?? asignacion de valor Null
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        Socket socket = null;
        
        //Se utilizar para esperar y escuchar la llegada de los clientes
        ServerSocket serverSocket;
        serverSocket = new ServerSocket(5432);//Instancia un objeto nuevo
        
        //System.out.println("prueba1");
        
        //Ciclo while
        while(true){
            //Try
            try{
                //System.out.println("prueba2");
                socket = serverSocket.accept();//Asigna a Socket el atributo accept de Server Socket
                System.out.println("\n Se conectaron desde la IP: "+ socket.getInetAddress());//obtiene la ip 
                objectInputStream = new ObjectInputStream (socket.getInputStream());//Instancia un objeto nuevo
                objectOutputStream = new ObjectOutputStream (socket.getOutputStream());//Instancia un objeto nuevo
                
                String nombre;
                nombre = (String) objectInputStream.readObject();
                String saludo = "Hola" + nombre + " " + System.currentTimeMillis();
                
                objectOutputStream.writeObject(saludo);
                System.out.println("\n Saludo viajando...");
                //System.out.println("prueba3");
            
            }
            catch (Exception ex){
                ex.printStackTrace();
                //System.out.println("prueba4");
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
        }
    }    
}
