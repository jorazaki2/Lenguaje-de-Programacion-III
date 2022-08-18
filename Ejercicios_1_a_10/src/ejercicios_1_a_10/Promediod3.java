
package ejercicios_1_a_10;

import java.util.Scanner;


public class Promediod3 {
    
    public void promediod3(){
    float nota1, nota2, nota3, promedio;
    Scanner reader = new Scanner(System.in);

        System.out.print("Introduce la nota número 1:");
        nota1 = reader.nextInt();
        System.out.print("Introduce la nota número 2:");
        nota2 = reader.nextInt();
        System.out.print("Introduce la nota número 3:");
        nota3 = reader.nextInt();
        
        promedio = (nota1+nota2+nota3)/3;
        
        System.out.print("Promedio: "+promedio);
    }
    
}
