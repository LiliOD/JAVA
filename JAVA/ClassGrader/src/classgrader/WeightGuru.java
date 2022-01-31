package classgrader;
import java.util.Scanner;

public class WeightGuru {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Ingresa tu altura en m");
		double altura = console.nextDouble();
		
		System.out.println("Ingresa tu peso en kg");
		double peso = console.nextDouble();
		
		double imc = peso/(altura*altura);
		
		if (imc<18.5) {
			System.out.println("Bajo peso");
		}else if (imc>=18.5 && imc<=24.9) {
			System.out.println("IMC normal");
		}else if (imc>=25 && imc<=29.9) {
			System.out.println("Preobesidad");
	
		}else if (imc>=30 && imc <= 40) {
			System.out.println("Obesidad");
		}else {
			System.out.println("Estas fuera de rango, cuídate");
		}
}

}
