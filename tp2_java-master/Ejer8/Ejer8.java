package Ejer8;

public class Ejer8 {
	public static void main(String[] ar) {
        Persona persona1=new Persona();
        persona1.Cargar_Datos();
        Empleado empleado1=new Empleado();
        empleado1.Cargar_Datos();
        empleado1.Cargar_Sueldo();
        persona1.Imprimir_Datos();        
        empleado1.Imprimir_Datos();
        empleado1.Imprimir_Sueldo();
    }
}
