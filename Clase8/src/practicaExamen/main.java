package practicaExamen;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int opt = 0;
        Scanner teclado = new Scanner(System.in);
        firstPoint first = new firstPoint();
        secondPoint second = new secondPoint();
        thirdPoint third = new thirdPoint();
        fourthPoint fourth = new fourthPoint();
        do {
            System.out.println("Digite una opción: \n"
                    + "1. Primer ejercicio\n"
                    + "2. Segundo ejercicio\n"
                    + "3. Tercero ejercicio \n"
                    + "4. Cuarto ejercicio \n"
                    + "5. Salir \n");

            opt = teclado.nextInt();

            switch (opt) {
                case 1:
                    for (int i = 0; i < 8; i++) {
                        System.out.println("Digite un número");
                        opt = teclado.nextInt();
                        first.asignarNumero(opt);
                    }
                    System.out.println("La suma de los números es " + first.suma());
                    System.out.println("La suma de los números " + first.mayor36() + " dan mayor a 36");
                    System.out.println(first.mayor50() + " números digitados son mayores que 50");
                    break;
                case 2:
                    int cont = 0;
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Digite los números para el primer vector");
                        opt = teclado.nextInt();
                        second.asignarNumero1(opt);
                    }
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Digite los números para el segundo vector");
                        opt = teclado.nextInt();
                        second.asignarNumero2(opt);
                    }
                    System.out.println(second.suma());
                    break;

                case 3:
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Digite las notas del grupo A:");
                        opt = teclado.nextInt();
                        third.asignarNotasA(opt);
                    }

                    for (int i = 0; i < 4; i++) {
                        System.out.println("Digite las notas del grupo B:");
                        opt = teclado.nextInt();
                        third.asignarNotasB(opt);
                    }
                    System.out.println(third.mostrarMayor());
                    break;

                case 4:
                    
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Digite un número:");
                        opt = teclado.nextInt();
                        fourth.asignarNumeros(opt);
                    }
                    boolean ordenado = fourth.ordenado();
                    if (ordenado) {
                        System.out.println("Los números están ordenados");
                    } else {
                        System.out.println("Los números no están ordenados");
                    }
                    break;
            }
        } while (opt != 5);

    }

}
