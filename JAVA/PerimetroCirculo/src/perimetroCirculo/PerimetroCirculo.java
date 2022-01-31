package perimetroCirculo;
import java.util.Scanner;

public class PerimetroCirculo {
public static void main(String[] args) {
	
	Scanner num = new Scanner(System.in);
	
	System.out.println("Ingrese el diámetro del círculo");
	int diametro = num.nextInt();
	
	double perimetro = Math.PI * diametro;
	double area = (Math.PI *(diametro*diametro))/4;
	
	System.out.println("El área del círculo es: " + area);
	System.out.println("El perímetro del círculo es: " + perimetro);
}
}
