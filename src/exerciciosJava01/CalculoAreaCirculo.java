package exerciciosJava01;

import java.util.Locale;
import java.util.Scanner;

import utilidades.CalcularRaio;

public class CalculoAreaCirculo {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
		
			System.out.println("Digite o valor do raio: ");
			double raio = sc.nextDouble();
			
			double resultado = CalcularRaio.area(raio);
			
			System.out.printf("Valor do PI: %.2f%nA área de um círculo é %.2f", CalcularRaio.PI, resultado);
			
			

	}

}

