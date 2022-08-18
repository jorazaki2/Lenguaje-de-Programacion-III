
package ejercicios_1_a_10;

import java.io.IOException;


public class LongitudDcadena {
    
    public void longitudDcadena() throws IOException{
    
     int c;  
        String x="";  
        String cad1;  
        int long1=0;  
// lee la primera palabra  
System.out.print("Ingrese una palabra: ");  
while( (c = System.in.read() ) != '\n' ){// '\n'=ENTER  
    x=x+(char)c;  
cad1=x.trim(); //quita los espacios en blanco al inicio y final de la palabra
long1=cad1.length();

}
System.out.print("Tamaño de la cadena: "+long1+"\n");
    }
    
}
