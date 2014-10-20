package matriz;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int opt = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite un número\n"
                    + "1. Primer punto\n"
                    + "2. Segundo punto\n"
                    + "3. Tercer punto\n"
                    + "4. Cuarto punto\n"
                    + "5. Salir ");
            opt = teclado.nextInt();

            switch (opt) {
                case 1:
                    firstPoint first = new firstPoint();
                    first.cargarMatriz();
                    System.out.println(first.imprimir());
                    break;

                case 2:
                    secondPoint second = new secondPoint();
                    System.out.println("Digite la cantidad de filas que desea en la matriz");
                    int filas = teclado.nextInt();
                    System.out.println("Digite la cantidad de filas que desea en la matriz");
                    int columnas = teclado.nextInt();
                    second.asignarTamaño(filas, columnas);
                    second.cargarMatriz();
                    second.intercambiar();
                    System.out.println(second.imprimir());
                    break;
                case 3:
                    thirdPoint t = new thirdPoint();
                    System.out.println("Digite la cantidad de filas que desea en la matriz");
                    filas = teclado.nextInt();
                    System.out.println("Digite la cantidad de columnas que desea en la matriz");
                    columnas = teclado.nextInt();
                    t.asignarTamaño(filas, columnas);
                    t.cargarMatriz();
                    System.out.println(t.imprimirEsquinas());
                    break;
                case 4:
                    fourthPoint fourth = new fourthPoint();
                    System.out.println("Digite la cantidad de filas que desea en la matriz");
                    filas = teclado.nextInt();
                    System.out.println("Digite la cantidad de columnas que desea en la matriz");
                    columnas = teclado.nextInt();
                    fourth.asignarTamaño(filas, columnas);
                    fourth.cargarMatriz();
                    System.out.println(fourth.mayor());
                    break;
            }
        } while (opt != 5);
    }
}
