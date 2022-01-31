package controlFlow;

import java.util.Scanner;

public class ComissionCalculator {
	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		System.out.println("Ingrese la venta para calcular la comisión");
		int venta = valor.nextInt();
		
		if (venta >0 && venta < 1000) {
			System.out.println("No hay comisión");
		}else if (venta >1000 && venta <5000) {
			System.out.println("Su comisión es de: $" + venta*0.1);
		}else if (venta > 5000 && venta < 10000) {
			System.out.println("Su comisión es de: $" +  venta*0.2);
		}else{
			System.out.println("Su comisión es de: $" + venta*0.3);
		}
		
		
	}
		
		

}
