
package ejercicios_1_a_10;

import java.util.Scanner;

public class Pares {
    public void pares(){
        Scanner reader = new Scanner(System.in);
        int num=0;
        System.out.print("Hasta que numero?: ");
        num = reader.nextInt();
          
        for (int i=1;i<=num;i++){  
            if((i%2)==0)  
                System.out.println(i);  
        }
    }
    
}
