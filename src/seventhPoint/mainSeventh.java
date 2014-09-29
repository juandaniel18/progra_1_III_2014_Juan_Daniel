package seventhPoint;

import java.util.Scanner;

public class mainSeventh {

    public static void main(String[] args) {

        boolean positivo;
        boolean par;
        boolean mayor;
        boolean cinco;
        boolean diez;
        classSeven t = new classSeven();
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número:");
        int num1 = Integer.parseInt(teclado.nextLine());
        t.setC(num1);

        positivo = t.posiNega();
        if (positivo) {
            System.out.println(t.getC() + " es positivo.");
        } else {
            System.out.println(t.getC() + " es negativo.");
        }

        par = t.parImpar();
        if (par) {
            System.out.println(t.getC() + " es par.");
        } else {
            System.out.println(t.getC() + " es impar.");
        }
        
        mayor = t.mayorMenos();
        if (mayor) {
            System.out.println(t.getC() + " es mayor que 100.");
        } else {
            System.out.println(t.getC() + " es menor que 100.");
        }

        cinco = t.multiCinco();
        if (cinco) {
            System.out.println("Es multiplo de cinco.");
        } else {
            System.out.println("No es multiplo de cinco.");
        }

        diez = t.multiDiez();
        if (diez) {
            System.out.println("Es multiplo de diez.");
        } else {
            System.out.println("No es multiplo de diez.");
        }
    }
}
