// Crea un arreglo de 6 números, pídeselos al usuario, luego pregúntale qué número quiere buscar y dile si está o no está en el arreglo.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int[] numeros = new int[6];

        boolean encontrado = false; // Creando variable para usar si esque esta el numero que buscas

        System.out.println("Ingresa 6 numeros");
        for (int i = 0; i < 6; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            numeros[i] = teclado.nextInt();
        }

        // Preguntando el numero que quiere buscar y guardandolo en int buscar
        System.out.println("Que numero quieres buscar: ");
        int buscar = teclado.nextInt();

        // Implementando otro for para recorrer los numeros 
        for (int j = 0; j < 6; j++) {
            if (numeros[j] == buscar) { // Si el numero que hay en la lista de numero es igual a la que buscamos 
                encontrado = true; // Entonces el valor de encontrado va cambiar a true
                break; // y va terminar de buscar el for
            }
        }

        if (encontrado) { // Si el encontrado es verdad (Caso unico sin comparaciones por booleano)
            System.out.println("El numero si esta"); // Vamos a decir que el numero si esta
        } else { // En caso contrario
            System.out.println("El numero no esta"); // Vamos a decir que el numero no esta
        }

    }
}
