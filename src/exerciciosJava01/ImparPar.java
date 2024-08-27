// 4- Faça um algoritmo que leia dois numero inteiros e faça a soma dos dois, informe se o resultado é par ou impar.

package exerciciosJava01;

import java.util.Locale;
import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		String resultado = (numero %2 == 0) ? "par" : "impar";
		
		//System.out.println(resultado);
		
			
		
		
		
		
		
		
		/* 
		if (numero %2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
	}
*/
	}
}
