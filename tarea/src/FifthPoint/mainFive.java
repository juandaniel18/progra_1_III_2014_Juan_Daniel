package FifthPoint;

import java.util.Scanner;

public class mainFive {

    public static void main(String[] args) {

        boolean par;
        classFive t = new classFive();
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número:");
        int num1 = Integer.parseInt(teclado.nextLine());
        t.setA(num1);

        par = t.parImpar();
        if (par) {
            System.out.println("El número " + t.getA() + " es par");
        } else {
            System.out.println("El número " + t.getA() + " es impar");
        }

    }
}
