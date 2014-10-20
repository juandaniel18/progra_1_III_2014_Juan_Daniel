package matriz;

import java.util.Scanner;

public class secondPoint {

    Scanner teclado = new Scanner(System.in);
    int matriz[][] = null;

    public void asignarTamaño(int filas, int columnas) {
        matriz = new int[filas][columnas];
    }

    public void intercambiar() {
        int support = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            support = matriz[0][j];
            matriz[0][j] = matriz[1][j];
            matriz[1][j] = support;

        }
    }

    public void cargarMatriz() {
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length; i++) {
                System.out.println("Digite un número");
                matriz[j][i] = teclado.nextInt();
            }
        }
    }

    public String imprimir() {
        String imprimir = " ";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                imprimir += matriz[i][j] + " ";
            }
            imprimir += "\n";
        }
        return imprimir;
    }
}
