package OperadoresLogicos;
import java.util.Scanner;

public class ContraseñaCompare {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	
	System.out.println("Ingresa tu usuario");
	String usuario = console.nextLine();
	
	System.out.println("Bienvenido, " + usuario + " ingresa tu contraseña");
	String pass = console.nextLine();
	
	System.out.println("Confirma tu contraseña");
	String conf = console.nextLine();
	
	//Comparación de las contraseñas
	
	if (pass.equals(conf)) {

		
		System.out.println("Ingresa tu calificación");
		double grade = console.nextDouble();
		int cali = (int)grade;
		
		System.out.println("Tu calificación final es: "+ cali);
	}else {
		System.out.println("Error en la validación");
	}
	
	
	
	
}
}
