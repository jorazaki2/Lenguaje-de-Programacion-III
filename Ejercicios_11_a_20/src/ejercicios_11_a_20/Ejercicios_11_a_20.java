/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_11_a_20;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicios_11_a_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
        int opc, x;
        do{
        System.out.println("LENGUAJE DE PROGRAMACION III");
        System.out.println("EJERCICIOS 1 A 10");
        System.out.println ("---------------");
         System.out.println ("1. Area de un Triangulo");
         System.out.println ("2. Area de un Circulo");
         System.out.println ("3. Area de un Rectangulo");
         System.out.println ("4. Area de un Cuadrado");
         System.out.println ("5. IVA ");
         System.out.print("Selecciona una opcion de 1 a 10: ");
         opc = leer.nextInt();
         
        
        switch(opc){
            case 1: AreaTriangulo at = new AreaTriangulo();
                    at.baseTriangulo();
                    break;
            case 2: AreaCirculo ac = new AreaCirculo();
                    ac.baseCirculo();
                    break;
            case 3: AreaRectangulo ar = new AreaRectangulo();
                    ar.baseRectangulo();
                    break;
            case 4: AreaCuadrado acc = new AreaCuadrado();
                    acc.baseCuadrado();
                    break;
            case 5: CalcularIva i = new CalcularIva();
                    i.calcularIva();
                    break;
            
                    
            default: System.out.println("Numero equivocado");break;
        }
        System.err.println("\nRepetir Menu? 1-Si   2-No");
        x=leer.nextInt();
        }while(x!=2);
    }
    
}
