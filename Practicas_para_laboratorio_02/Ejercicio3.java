// Crea un arreglo de 5 números, pídeselos al usuario y encuentra cuál es el mayor y cuál es el menor.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        int[] numeros = new int[5]; // Creando un arreglo para guardar 5 numeros

        int mayor = 0; // Declarando variable para el numero mayor con valor inicial 0
        int menor = Integer.MAX_VALUE; // Declarando variable para el numero menor con el maximo valor de java


        System.out.println("Ingresa 5 numeros para darte el mayor y el menor");

        for (int i = 0; i < 5; i++) {
            System.out.println("Numero " +(i + 1) + ":");
            numeros[i] = teclado.nextInt();

            // Primer if para sacar el numero mayor
            if (numeros[i] > mayor) { // Si el numero ingresa es mayor que nuestra variable con valor 0
                mayor = numeros[i]; // Entonces la variable mayor pasa a tener el valor de ese numero
            }

            if (numeros[i] < menor){ // Si el numero ingresado es menor a nuestra variable menor
                menor = numeros[i]; // Entonces la variable menor va ir guardando todo el rato
            }                       // El numero menor una y otra vez hasta tener el valor mas pequeño
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

    }
}
