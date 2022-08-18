
package ejercicios_1_a_10;
    import java.util.Scanner;

public class Tablas {
    

	public void tablas() 
	{
		Scanner teclado = new Scanner( System.in );
		int tabla,i;
		 for (tabla=1; tabla<=9; tabla++)
		 {
			 System.out.println ("\n\nTabla del " +tabla);
			 System.out.println ("---------------");
			 for (i=1;i<=10;i++)
			 	{
				 System.out.println (tabla + " x " + i + " = " + tabla*i);
				}
		 }
	}

}
    
