package controlFlow;
import java.util.Scanner;
public class MovieDiscounts {

	public static void main(String[] args) {

		Scanner valor = new Scanner (System.in);
		System.out.println("Ingrese su edad");
		int edad = valor.nextInt();
		
		System.out.println("Ingrese la cantidad de boletos a comprar");
		int Nboletos = valor.nextInt();
		
		int boleto = 7;
		
		if (edad>5 && edad<60) {
			if (Nboletos == 1) {
			System.out.println("$" + boleto);
			}else {
				System.out.println("$"+Nboletos*boleto*0.7);
			}
		}else if (edad <=5) {
			System.out.println("$"+boleto*.4);
		}else {
			System.out.println("$" + boleto*.45);
		}
	}
}
