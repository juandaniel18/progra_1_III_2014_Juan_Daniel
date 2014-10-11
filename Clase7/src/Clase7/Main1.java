package Clase7;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        {
            int opt = 0;
            Scanner teclado = new Scanner(System.in);

            do {
                System.out.println("Digite la opción del ejercicio a evaluar\n"
                        + "1. Ejercicio 1\n"
                        + "2. Ejercicio 2\n"
                        + "3. Ejercicio 3\n"
                        + "4. Salir");
                opt = teclado.nextInt();
                switch (opt) {
                    case 1:
                        Exercise1 t1 = new Exercise1();
                        for (int i = 0; i < 5; i++) {
                            teclado = new Scanner(System.in);
                            System.out.println("Digite el salario del trabajador $ " + (i + 1));
                            t1.agregarSalario(teclado.nextDouble());
                            t1.imprimirSalarios();
                        }
                        System.out.println(t1.imprimirSalarios());
                        break;

                    case 2:
                        Exercise2 t2 = new Exercise2();
                        for (int i = 0; i < 5; i++) {
                            teclado = new Scanner(System.in);
                            System.out.println("Digite la altura de la persona # " + (i + 1));
                            t2.agregarAltura(teclado.nextFloat());
                            break;
                        }

                    case 3:
                        Exercise3 t3 = new Exercise3();
                        for (int i = 0; i < 4; i++) {
                            teclado = new Scanner(System.in);
                            System.out.println("Digite el salario del empleado de la mañana # " + (i + 1));
                            t3.agregarSalarioMañana(teclado.nextFloat());
                        }
                        for (int i = 0; i < 4; i++) {
                            teclado = new Scanner(System.in);
                            System.out.println("Digite el salario del empleado de la tarde # " + (i + 1));
                            t3.agregarSalarioTarde(teclado.nextFloat());
                        }
                        System.out.println(t3.imprimirSalario());
                        ;
                }
            } while (opt < 5);
        }
    }
}
