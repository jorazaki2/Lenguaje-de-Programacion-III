/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_11_a_20;

import java.util.Scanner;

public class CalcularIva {
 
   public void calcularIva() {
 
       double base;
       double porcentaje;
       double total;
       double iva;
       Scanner leer = new Scanner(System.in);
       
 
       System.out.println("Ingrese base:");
       base = leer.nextDouble();
 
       System.out.println("Ingrese porcentaje de iva:");
       porcentaje = leer.nextDouble();
       
       iva =  base * porcentaje / 100;
       total = base + iva;
 
       System.err.println("Base: " + base);
       System.err.println("IVA: " + iva);
       System.err.println("Total: " + total);


    }

}