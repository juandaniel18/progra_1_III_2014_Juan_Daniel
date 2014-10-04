package classSix;

import java.util.Scanner;

public class mainOne {

    public static void main(String[] args) {
        exerciseTwo two = new exerciseTwo();
        int opt;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite la opcion que desea:\n"
                    + "1. Ejercicio 1\n"
                    + "2. Ejercicio 2\n"
                    + "3. Imprimir mitad");

            opt = Integer.parseInt(teclado.nextLine());

            switch (opt) {

                case 1:
                    String email;
                    System.out.println("Digite el correo a evaluar");
                    email = teclado.nextLine();
                    exerciseOne t = new exerciseOne(email);
                    System.out.println(t.validarCorreo());
                    break;

                case 2:
                    String revert;
                    System.out.println("Digite un nombre:\n");
                    revert = teclado.nextLine();
                    two.setCadena(revert);
                    revert = two.revertString();
                    System.out.println(revert);
                    break;

                case 3:
                    System.out.println("Digite un nombre:\n");
                    revert = teclado.nextLine();
                    two.setCadena(revert);
                    String half = two.halfString();
                    System.out.println(half);
                    break;
            }
        } while (opt != 4);
    }
}
