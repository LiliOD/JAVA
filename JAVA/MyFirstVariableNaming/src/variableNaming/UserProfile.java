package variableNaming;
import java.util.Scanner;

public class UserProfile {
public static void main(String[] args) {
	//Write code so that the app stores a users name, age, gender, job preference, nationality and blood type
	Scanner var = new Scanner(System.in);{
	
	System.out.println("Ingrese su nombre");
	String nombre = var.nextLine();
	
	
	System.out.println("Ingrese su género");
	String genero = var.nextLine();
	
	System.out.println("Ingrese su preferencia de trabajo");
	String trabajo = var.nextLine();
	
	System.out.println("Ingrese su nacionalidad");
	String nacionalidad = var.nextLine();
	
	System.out.println("Ingrese su tipo de sangre");
	String sangre = var.nextLine();
	
	System.out.println("Ingrese su edad");
	int edad = var.nextInt();
	
	int anon = 2022 - edad;
	
	
	System.out.println("Mi nombre es: "+nombre + " tengo "+ edad +" años, mi género es "+ genero +". Me gustaría trabajar como "+ trabajo+ ". Mi nacionalidad es "+ nacionalidad + " y mi tipo de sangre es " + sangre);
	System.out.println("Nací en el año " + anon);
	}	
}
}
