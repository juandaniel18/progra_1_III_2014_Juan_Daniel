package matriz;

import java.util.Scanner;

public class firstPoint {

    Scanner teclado = new Scanner(System.in);
    int matriz[][] = new int[2][5];

    public void cargarMatriz() {
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite un número");
                matriz[j][i] = teclado.nextInt();
            }
        }
    }
    
    public String imprimir(){
    String imprimir = " ";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               imprimir+=matriz[i][j]+" ";
            }
            imprimir+="\n";
        }
        return imprimir;
    }

}
