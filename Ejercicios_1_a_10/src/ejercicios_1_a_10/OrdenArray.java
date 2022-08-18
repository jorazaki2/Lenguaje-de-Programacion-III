package ejercicios_1_a_10;
import java.util.Scanner;
public class OrdenArray {
    public void OrdenArray() {
        Scanner teclado = new Scanner(System.in);
	int datos[],suma=0;
	datos=new int[5];
	int ind,num;
        for(ind=0;ind<datos.length;ind++) {
	    System.out.print("Introduce dato "+(ind+1)+": ");
            /* num=teclado.nextInt();
	    datos[ind]=num;*/
            datos[ind]=teclado.nextInt();
	}
	/*for(ind=0;ind<datos.length;ind++) {
	    suma+=datos[ind];
	    System.out.println("Datos["+ind+"]="+datos[ind]);
	}
	System.out.println("A suma e = "+suma);*/
	System.out.println("Orden inverso");
	for(ind=(datos.length)-1;ind>=0;ind--) {
	    System.out.println("Datos["+ind+"]="+datos[ind]);
	}
    }
}