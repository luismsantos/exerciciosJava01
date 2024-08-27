// Faça um algoritmo que leia dois números. Peça ao usuário selecionar a operação matemática que deseja fazer, execute a operação e mostre o resultado

package exerciciosJava01;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double n1 = 0.0;
        Double n2 = 0.0;
        int operacao = 0;
        Double resultado = 0.0;

        System.out.println("Escreva dois números: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        System.out.println("1 - soma ,2 - subtraçao, 3 - divisão, 4 - multiplicação");
        operacao = sc.nextInt();

        switch (operacao) {
            case 1: {
                System.out.println("Soma");
                resultado = n1 + n2;
                System.out.println(resultado);
                break;
            }

            case 2: {
                System.out.println("Subtracao");
                resultado = n1 - n2;
                System.out.println(resultado);
                break;
            }

            case 3: {
                System.out.println("Divisao");
                resultado = n1 / n2;
                System.out.println(resultado);
                break;
            }

            case 4: {
                System.out.println("Multiplicacao");
                resultado = n1 * n2;
                System.out.println(resultado);
                break;
            }
            default: {
                System.out.println("operação invalida");
            }
        }




    };
}

