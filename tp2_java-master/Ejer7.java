package tp2_java-master;

import java.util.Scanner;

public class Ejer7 {
	private Scanner teclado;
    private int n1,n2,suma,multi,resta,div;
    public void Inicializar(){
        teclado=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        n1=teclado.nextInt();
        System.out.print("Ingrese otro numero: ");
        n2=teclado.nextInt();
    }    
    public void Suma(){
        suma=n1+n2;
    }
    public void Resta(){
        resta=n1-n2;
    }
    public void Multiplicacion(){
        multi=n1*n2;
    }
    public void Division(){
        div=n1/n2;
    }
    public void Mostrar_Calculos(){
        System.out.println("La suma es: " +suma);
        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicación es: " +multiplicacion);
        System.out.println("La división es: " +division);
    }
    public static void main (String args[]){
    	Ejer7 operacion1 = new Ejer7();
        operacion1.Inicializar();
        operacion1.Suma();
        operacion1.Resta();
        operacion1.Multiplicacion();
        operacion1.Division();
        operacion1.Mostrar_Calculos();
    }
}
