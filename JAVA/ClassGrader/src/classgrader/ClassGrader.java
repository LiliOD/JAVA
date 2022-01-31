package classgrader;
import java.util.Scanner;

public class ClassGrader {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Ingrese los aciertos del alumno");
		int aciertos = console.nextInt();
		
		if (aciertos>=0 && aciertos <= 10) {
			if (aciertos <=3 ) {
			System.out.println("Reprobado");
		
			}else if (aciertos >3 && aciertos <=5) {
				System.out.println("Insuficiente");
			}else if (aciertos >5 && aciertos <=8) {
				System.out.println("Bien");
			}else if(aciertos<8 && aciertos ==10){
				System.out.println("Excelente");
			}
		}else {
			System.out.println("Valor no válido");
		}
				
		
	}

}
