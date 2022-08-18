
package ejercicios_1_a_10;

   import java.util.Scanner;
public class PiedraPapelTijera {
   

    public  void piedrapapeltijera() {
        Scanner teclado = new Scanner(System.in);
        String resp1, resp2;
        boolean correcto;
        do{
            System.out.println("****PIEDRA PAPEL TIJERA****\n");
            System.out.println("INTRODUCE OPCION JUGADOR 1: P/L/T");
            resp1=teclado.next();
            System.out.println("\nINTRODUCE OPCION JUGADOR 2: P/L/T");
            resp2=teclado.next();
            correcto=true;
            if(resp1.equals("P") && resp2.equals("P")) {
                System.out.println("\nEMPATE\n");
                correcto=false;
            }
            if(resp1.equals("P") && resp2.equals("L")) {
                System.out.println("\nGANA JUGADOR 2\n");
                correcto=false;
            }
            if(resp1.equals("P") && resp2.equals("T")) {
                System.out.println("\nGANA JUGADOR 1\n");
                correcto=false;
            }
            if(resp1.equals("L") && resp2.equals("P")) {
                System.out.println("\nGANA JUGADOR 1\n");
                correcto=false;
            }
            if(resp1.equals("L") && resp2.equals("L")) {
                System.out.println("\nEMPATE\n");
                correcto=false;
            }
            if(resp1.equals("L") && resp2.equals("T")) {
                System.out.println("\nGANA JUGADOR 2\n");
                correcto=false;
            }
            if(resp1.equals("T") && resp2.equals("P")) {
                System.out.println("\nGANA JUGADOR 2\n");
                correcto=false;
            }
            if(resp1.equals("T") && resp2.equals("L")) {
                System.out.println("\nGANA JUGADOR 1\n");
                correcto=false;
            }
            if(resp1.equals("T") && resp2.equals("T")) {
                System.out.println("\nEMPATE\n");
                correcto=false;
            }
        }while(correcto==false);		
    } 
}
    

