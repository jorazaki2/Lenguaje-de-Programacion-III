/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_11_a_20;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class AreaCirculo {
    public void baseCirculo(){
    Scanner src = new Scanner(System.in);
    long radio;
    System.out.print("Introduce el radio: ");
    radio=src.nextLong();
      
    
    System.err.println("\nEl Area del Circulo es: "+Math.PI*(Math.pow(radio,2)));
    }
}
