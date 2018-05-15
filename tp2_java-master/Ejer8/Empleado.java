package Ejer8;

class Empleado extends Persona {
	protected int sueldo;
    public void Cargar_Sueldo() {
        System.out.print("Ingrese su sueldo:");
        sueldo=teclado.nextInt();
    }
    
    public void Imprimir_Sueldo() {
        System.out.println("El sueldo es:"+sueldo);
    }
}
