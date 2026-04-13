// Crea un arreglo de 5 números enteros, pídeselos al usuario y luego muéstralos todos.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Porfavor, Ingresa 5 numeros");
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("Los numeros son: " + numeros[j]);
        }

    }
}