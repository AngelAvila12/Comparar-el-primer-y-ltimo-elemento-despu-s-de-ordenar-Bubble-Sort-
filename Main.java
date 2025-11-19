import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros deseas ingresar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        System.out.println("Ingresa los " + n + " numeros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = numeros[i];
        }

        System.out.println("\nArreglo original:");
        imprimir(original);

        bubbleSort(numeros);

        System.out.println("\nArreglo ordenado:");
        imprimir(numeros);

        int minimo = numeros[0];
        int maximo = numeros[n - 1];
        int diferencia = maximo - minimo;

        System.out.println("\nValor minimo: " + minimo);
        System.out.println("Valor maximo: " + maximo);
        System.out.println("Diferencia (max - min): " + diferencia);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}