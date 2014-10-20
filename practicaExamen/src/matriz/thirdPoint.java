package matriz;

import java.util.Scanner;

public class thirdPoint {

    Scanner teclado = new Scanner(System.in);
    int matriz[][] = null;

    public void asignarTamaño(int filas, int columnas) {
        matriz = new int[filas][columnas];
    }
    
    public void cargarMatriz() {
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length; i++) {
                System.out.println("Digite un número");
                matriz[j][i] = teclado.nextInt();
            }
        }
    }
    
    public String imprimirEsquinas() {
        String esquinas = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 && j == 0) {
                    esquinas += String.valueOf(matriz[i][j]) + " \n ";
                }
                if (i == 0 && j == matriz[0].length - 1) {
                    esquinas += String.valueOf(matriz[i][j]) + " \n ";
                    
                }
                if (i == matriz.length - 1 && j == 0) {
                esquinas += String.valueOf(matriz[i][j]) + " \n ";}

                if (i == matriz.length - 1 && j == matriz[0].length - 1) {
                esquinas += String.valueOf(matriz[i][j]) + " \n ";}

            }
            
        }
        return esquinas;
    } 
}
