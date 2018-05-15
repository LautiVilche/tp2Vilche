package tp2_java-master;

import java.util.Scanner;

public class Ejer6 {
	private Scanner teclado;
	private String nombre;
	private int sueldo;
    
    public void Inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre del trabajador: ");
        nombre = teclado.next();
        System.out.print("Ingrese sueldo: ");
        sueldo = teclado.nextInt();
    }
    public void Imprime_Datos(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Seeldo: " +sueldo);
    }
    public void Imprime_Impuestos(){
        if(sueldo>3000)
            System.out.println("Paga impuestos.");
        else
            System.out.println("No paga impuestos.");
    }
    public static void main (String args[]){     
    	Ejer6 empleado1 = new Ejer6();
        empleado1.Inicializar();
        empleado1.Imprime_Datos();
        empleado1.Imprime_Impuestos();
    }
}
