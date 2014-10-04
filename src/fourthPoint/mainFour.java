package fourthPoint;

import java.util.Scanner;

public class mainFour {

    public static void main(String[] args) {
        classFour t = new classFour();
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número:");
        int num1 = Integer.parseInt(teclado.nextLine());
        t.setA(num1);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número:");
        int num2 = Integer.parseInt(teclado.nextLine());
        t.setB(num2);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número:");
        int num3 = Integer.parseInt(teclado.nextLine());
        t.setC(num3);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número:");
        int num4 = Integer.parseInt(teclado.nextLine());
        t.setD(num4);

        System.out.println(t.interchange());
    }
}
