package clase9;

import java.util.Scanner;

public class secondPoint {

    int matriz[][] = null;

    public void asignarTamaño(int filas, int columnas) {
        matriz = new int[filas][columnas];
    }

    public void asignarValoresColumna(int n) {
        for (int j = 0; j < matriz[0].length; j++) {
            if (matriz[0][j] == 0) {
                matriz[0][j] = n;
                break;
            }
        }
    }

    public void asignarValoresFila(int n) {
        for (int j = 1; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length; i++) {
                if (matriz[j][i] == 0) {
                    matriz[j][i] = n;
                    break;
                }

            }
        }
    }

    public void intercambiar() {
        int support = 0;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length; i++) {
                support = matriz[j][i];
                matriz[j][i] = matriz[j][i];
                matriz[1][i] = 
                        }

        }

    }

    public String imprimir() {
        String imprimir = "";
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length; i++) {
                imprimir += matriz[j][i] + " ";
            }
        }
        return imprimir;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        secondPoint t = new secondPoint();
        System.out.println("Digite la cantidad de filas que desea: \n");
        int filas = teclado.nextInt();
        System.out.println("Digite la cantidad de columnas que desea: \n");
        int columnas = teclado.nextInt();
        t.asignarTamaño(filas, columnas);

        for (int j = 0; j < columnas; j++) {
            System.out.println("Digite un valor");
            int valor = teclado.nextInt();
            t.asignarValoresColumna(valor);
        }

        for (int j = 0; j < columnas; j++) {
            System.out.println("Digite un valor");
            int valor = teclado.nextInt();
            t.asignarValoresFila(valor);
        }

        t.intercambiar();
        System.out.println(t.imprimir());
    }

}
