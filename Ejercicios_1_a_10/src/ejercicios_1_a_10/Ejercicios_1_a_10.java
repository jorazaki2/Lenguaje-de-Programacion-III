package ejercicios_1_a_10;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicios_1_a_10 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opc;
        
        System.out.println("LENGUAJE DE PROGRAMACION III");
        System.out.println("EJERCICIOS 1 A 10");
        System.out.println ("---------------");
         System.out.println ("1. Factorial");
         System.out.println ("2. Fibonacci ");
         /*System.out.println ("3. Longitud cadena de caracteres");
         System.out.println ("4. Mayor o Menor");
         System.out.println ("5. Ordenar Array ");
         System.out.println ("6. Numeros pares ");
         System.out.println ("7. Piedra Papel o Tijera ");
         System.out.println ("8. Promedio de 3 numeros ");
         System.out.println ("9. Tablas de Multiplicacion ");
         System.out.println ("10. Numeros del 1 al 15 ");*/
        System.out.print("Selecciona una opcion de 1 a 10: ");
        opc = teclado.nextInt();
        
        switch(opc){
            case 1: Factorial f = new Factorial();
                    f.factorial();
                    break;
        
            case 2: Fibonacci f1 = new Fibonacci("fibonacci 1",10); 
                    f1.mostrarSerie(); 
                    break;
                    
            case 3: LongitudDcadena l = new LongitudDcadena();
                    l.longitudDcadena();
                    break;
                    
            case 4: MayorMenor o = new MayorMenor();
                    o.mayormenor(); 
                    break;
                    
            case 5: OrdenArray oo = new OrdenArray();
                    oo.OrdenArray();
                    break;
                    
            case 6: Pares pp = new Pares();
                    pp.pares();
                    break;
                    
            case 7: PiedraPapelTijera ppt = new PiedraPapelTijera();
                    ppt.piedrapapeltijera();
                    break;
                    
            case 8: Promediod3 p = new Promediod3();
                    p.promediod3();
                    break;
                    
            case 9: Tablas t = new Tablas();
                    t.tablas();
                    break;
                    
            case 10:Primeroal15 a = new Primeroal15();
                    a.primeroal15();
                    break;
                    
            default: System.out.println("Numero equivocado");break;
        }
    }
}
    
    
    

