// Escreva  um  programa  que  leia  15  valores  reais  e  encontre  o  maior  e  o  menor
//deles, mostrando o resultado

package exerciciosJava01;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valor = new int[15];
        int maior = 0;
        int menor = 0;

        for(int i = 0; i < valor.length; i++) {
            System.out.println("Digite um número:");
            valor[i] =  sc.nextInt();
        }

        for (int i = 1; i < valor.length; i++) {
            if (valor[i] > maior) {
                maior = valor[i];
            }
            if (valor[i] < menor) {
                menor = valor[i];
            }

        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);














    }
}