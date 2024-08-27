// Escreva  um  programa  que  leia  um  número  de  1  a  9  e  imprima  sua  respectiva tabuada

package exerciciosJava01;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for(int i = 1 ; i <= 10; i++) {

          int resultado = numero * i;

            System.out.println(numero + "X" + i + "=" + resultado);

        }

    }
}
