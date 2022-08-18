/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;
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
           
           objectOutputStream.writeObject(" Jorazaki");
           
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
                    
        }
}}
