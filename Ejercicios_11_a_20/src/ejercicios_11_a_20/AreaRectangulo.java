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
public class AreaRectangulo {
    public void baseRectangulo(){
    Scanner src = new Scanner(System.in);
    long base, altura;
    System.out.print("Introduce la base: ");
    base=src.nextLong();
    System.out.print("Introduce la Altura: ");
    altura=src.nextLong();
    
    
    System.err.println("\nEl area del Rectangulo es: "+(base*altura));
    }
}
