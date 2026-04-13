// Crea un arreglo de 6 números enteros, pídeselos al usuario y calcula la suma total y el promedio.
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Esto es como decir 
        // Creo un arreglo de numeros enteros llamado notas
        // Que esto va pasar a ser un nuevo arreglo con 6 espacios
        int[] notas = new int[6]; 

        // Creando un acumulador para usarlo con las sumas (esencial siempre en estos casos)
        int suma = 0;


        // for esencial para registrar una serie de numeros 
        System.out.println("Ingrese 6 numeros: ");
        // Diciendole que el contador i va ser de enteros
        // Va recorrer desde la posicion 0 
        // Esto va llegar hasta que sea menor que 6 
        // Despues el contador va pasar al siguiente numero con (i++)
        for (int i = 0; i < 6; i++) {
            System.out.println("Numero " +(i + 1) + ":"); // Se va a repetir mostrando en que numero registrado vamos
            notas[i] = teclado.nextInt(); // Leemos el numero registrado con el notas[i] asi guardando en la respectiva ubicacion
            suma = suma + notas[i]; // A la vez haciendo la suma total de los numeros registrados

        }

        // El segundo (double) es para decirle a java que interprete (suma) como decimal
        double promedio = (double) suma / 6; 

        System.out.println("La suma total de sus numeros es: " + suma);
        System.out.println("El promedio de los numeros ingresados es: " + promedio);

    }
}
