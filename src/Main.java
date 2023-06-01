import java.util.Scanner;

// Definición de la interfaz que contiene una variable global "notas"
interface variablesGlobales{
    int [] notas = new int[5];
}

// Clase principal que implementa la interfaz "variablesGlobales"
public class Main implements variablesGlobales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        char calificacion;
        double suma = 0;

        System.out.println("Ingrese nombre del alumno: ");
        nombre = teclado.nextLine();

        for (int i=0; i<= 4; i++){
            System.out.println("Inserte la calificacion: ");
            notas[i] = teclado.nextInt();
        }

        imprimirResultados(nombre);
    }

    // Método para calcular el promedio de las calificaciones
    public static double calcularPromedio() {
        double suma = 0;

        for (double calificacion : notas) {
            suma += calificacion;
        }

        return suma / notas.length;
    }

    // Método para obtener la calificación final según el promedio
    public static char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método para imprimir los resultados
    public static void imprimirResultados(String nombre) {
        System.out.println("Nombre del estudiante: " + nombre);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + notas[i]);
        }

        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }
}
