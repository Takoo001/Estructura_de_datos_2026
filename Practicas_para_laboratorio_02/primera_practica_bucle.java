// Crea un programa que:
// Tenga un número secreto fijo (por ejemplo, el 42) guardado en una variable
// Le pida al usuario que adivine el número
// Si el número ingresado es menor al secreto, muestra "El número es mayor"
// Si es mayor, muestra "El número es menor"
// Si adivinó, muestra "¡Correcto!" y termina el programa
// El programa debe seguir pidiendo números hasta que el usuario adivine

import java.util.Scanner;

public class primera_practica_bucle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int numeroadivinar = 42;

        int numero;
        while(true) {
            System.out.print("Adivina el numero: ");
            numero = teclado.nextInt();
            if (numero < numeroadivinar)
                System.out.println("El numero es mayor");
            else if (numero > numeroadivinar)
                System.out.println("El numero es menor");
            else {
                System.out.println("Correcto");
                break;
            }
        }








































    }
    
}
