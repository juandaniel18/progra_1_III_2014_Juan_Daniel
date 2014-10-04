package thirdPoint;

import java.util.Scanner;

public class mainThree {
    
    public static void main(String[] args) {
        classThree t = new classThree();
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario un número con decimales y lo recuperamos.
        System.out.println("Digite un número:");
        int num1 = Integer.parseInt(teclado.nextLine());
        t.setN(num1);
        
        System.out.println("1. Sumar setente y siete \n"
                + "2. Restar tres \n"
                + "3. Duplicar valor");
        
        int num2 = Integer.parseInt(teclado.nextLine());
        
        switch (num2) {
            case 1:                
                t.incrementar();
                System.out.println(t.getN());
                break;
            
            case 2:
                t.decrementar();
                System.out.println(t.getN());
                break;
            
            case 3:
                t.duplicar();
                System.out.println(t.getN());
                break;
        }
    }
}
