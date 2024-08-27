// 2- Faça um código que leia o seu nome completo e conte quantas vogais tem no nome

package exerciciosJava01;

import java.util.Locale;
import java.util.Scanner;

public class LerVogaisNome {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine().toLowerCase();
		
		int cont = 0;
		
		for(int i = 0; i < nome.length(); i++) {
			char letra = nome.charAt(i);
			
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				cont++;
			}
		}
		
		System.out.printf("O nome: %s%npossui: %d vogais", nome, cont);
		
		
		
		
	}

}
