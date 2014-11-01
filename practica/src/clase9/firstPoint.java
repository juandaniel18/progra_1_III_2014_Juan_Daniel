package clase9;

import java.util.Scanner;

public class firstPoint {

    Scanner teclado = new Scanner(System.in);
    int matriz[][] = new int[2][5];

    public void asignarValores() {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                matriz[i][j] = teclado.nextInt();
            }

        }

    }

    public String imprimir() {
        String imprimir = "";
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                imprimir += matriz[i][j] + " ";
            }
        }
        return imprimir;
    }

    public static void main(String[] args) {
        firstPoint t = new firstPoint();
        t.asignarValores();
        System.out.println(t.imprimir());
    }
}
