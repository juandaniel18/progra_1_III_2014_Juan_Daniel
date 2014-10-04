package secondPoint;

import java.util.Scanner;

class mainTwo {

    public static void main(String[] args) {
        classTwo t = new classTwo();
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número entero:");
        int num1 = Integer.parseInt(teclado.nextLine());

        // Asignamos el valor del usuario a una variable.
        t.setX(num1);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número entero:");
        int num2 = Integer.parseInt(teclado.nextLine());

        // Asignamos el valor del usuario a una variable.
        t.setY(num2);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número entero:");
        double num3 = Double.parseDouble(teclado.nextLine());

        // Asignamos el valor del usuario a una variable.
        t.setM(num3);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número entero:");
        double num4 = Double.parseDouble(teclado.nextLine() + "\n");

        // Asignamos el valor del usuario a una variable.
        t.setN(num4);

        System.out.println(t.suma());
        System.out.println(t.resta());
        System.out.println(t.division());
        System.out.println(t.multiplicacion());
    }
}
