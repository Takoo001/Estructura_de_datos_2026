import java.util.Scanner;

public class Lab_02_original {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Arreglos para almacenar notas de laboratorios y pruebas
        double[] laboratorio = new double[3];
        double[] pruebas = new double[3];
        
        double sumaLaboratorio = 0;
        double sumaPruebas = 0;

        // Creando ponderaciones
        double PONDERACION_LABORATORIO = 0.30;
        double PONDERACION_PRUEBAS = 0.70;


        // Ingresando las notas de laboratorio y guardandolas
        System.out.println("Ingresa sus notas de laboratorio");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i +1) + ":");
            laboratorio[i] = teclado.nextDouble();
            sumaLaboratorio = sumaLaboratorio + laboratorio[i];
        }
        
        // Creando la variable promedio para guardar el promedio de las notas de laboratorio
        double promedioLaboratorio = (double)sumaLaboratorio / 3;
        // Mostrando al usuario su promedio de notas de laboratorio
        System.out.println("Su promedio de notas de laboratorio es: " + promedioLaboratorio);

        // Espacio para que todo no quede muy compacto
        System.out.println("");

        // Creando el if 
        // Si el promedio de notas de laboratorio es menor que 4.0 automaticamente queda reprobado
        // En caso contrario el codigo sigue y calcula el promedio de notas de pruebas y la nota final ponderada 
        // Luego muestra si con esas notas esta aprobado o reprobado del modulo completa
        if (promedioLaboratorio < 4.0) {
            System.out.println("Ya que su promedio de laboratorio es menor que 4.0, Usted esta reprobado");
        } else {

            System.out.println("Ingrese sus notas de prueba");
            for (int j = 0; j < 3; j++) {
                System.out.println("Nota " + (j +1) + ":");
                pruebas[j] = teclado.nextDouble();
                sumaPruebas = sumaPruebas + pruebas[j];            
            }
            double promedioPruebas = (double)sumaPruebas / 3;

            System.out.println("Su promedio de notas de pruebas es: " + promedioPruebas);

            double notaFinal = PONDERACION_LABORATORIO * (promedioLaboratorio) + PONDERACION_PRUEBAS * (promedioPruebas);

            if (notaFinal > 4.0) {
                System.out.println("Usted aprobo el modulo con un promedio total ponderado de: " + notaFinal);
            } else {
                System.out.println("Usted reprueba el modulo con un promedio total ponderado de: " + notaFinal);
            }

        }

    }

}
