package sixthPoint;

import java.util.Scanner;

public class mainSix {

    public static void main(String[] args) {

        boolean positivo;
        classSix t = new classSix();
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número:");
        int num1 = Integer.parseInt(teclado.nextLine());
        t.setB(num1);

        positivo = t.posiNega(num1);
        if (positivo) {
            System.out.println("El número " + t.getB() + " es positivo");
        } else {
            System.out.println("El número " + t.getB() + " es negativo");
        }

    }
}
