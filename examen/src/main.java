import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int opt;

        do {
            System.out.println("Escoja una opción:\n"
                    + "1. Primer ejercicio\n"
                    + "2. Segundo ejercicio");

            opt = teclado.nextInt();

            switch (opt) {
                case 1:
                    teclado = new Scanner(System.in);
                    firstPoint first = new firstPoint();
                    System.out.println("Digite una palabra");
                    String palabra = teclado.next();
                    System.out.println("Digite el número de saltos que desea");
                    int saltos = teclado.nextInt();
                    System.out.println(first.criptografia(palabra, saltos));
                    break;
                    
                    case 2:
                        teclado = new Scanner(System.in);
                        secondPoint second = new secondPoint();
                        System.out.println("Digite la cantidad de dinero que deasea");
                        int dinero = teclado.nextInt();
                        System.out.println(second.imprimirDesglose(dinero));
                        System.out.println(second.imprimirTotal(dinero));
                        break;
            }
        } while (opt != 3);
    }

}
