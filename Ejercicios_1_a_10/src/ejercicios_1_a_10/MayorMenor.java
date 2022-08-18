package ejercicios_1_a_10;

import java.util.Scanner;

public class MayorMenor {
    
    public void mayormenor(){
        Scanner reader = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        
        System.out.println("Introduce el número 1:");
        numero1 = reader.nextInt();
        System.out.println("Introduce el número 2:");
        numero2 = reader.nextInt();
        
        if (numero1 >numero2){System.out.println("Número 1: "+numero1+ " es mayor que Número 2: "+numero2);}
        else if (numero1==numero2){System.out.println("El número 1 es igual al número 2");}
        else {System.out.println("El número 2: "+numero2+", es mayor que el número 1: "+numero1);}
    }
    }
    
