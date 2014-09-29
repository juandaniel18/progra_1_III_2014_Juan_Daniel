package firstPoint;

import java.util.Scanner;

public class mainOne {

    public static void main(String[] args) {
        // Creamos las instancias necesarias para la clase.
        classOne t = new classOne();
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número con decimales:");
        double num1 = Double.parseDouble(teclado.nextLine());

        // Asignamos el valor que el usuario digito a una variable.
        t.setA(num1);

        // Pedimos al usuario un número entero y lo recuperamos.
        System.out.println("Digite un número entero:");
        int num2 = Integer.parseInt(teclado.nextLine());

        // Asignamos el valor que el usuario digito a una variable.
        t.setN(num2);

        // Pedimos al usuario un número entero y lo recuperamos.
        System.out.println("Digite una letra :");
        char letter = teclado.nextLine().charAt(0);
        // Asignamos el valor que el usuario digito a una variable.
        t.setN(letter);

        System.out.println("Los valores que acaba de digitar son: \n"
                + t.getA() + "\n"
                + t.getN() + "\n"
                + t.getC() + "\n");

        System.out.println(t.suma() + "\n" + t.resta());
    }
}
