package matriz;

import java.util.Scanner;

public class fourthPoint {

    Scanner teclado = new Scanner(System.in);
    int matriz[][] = null;

    public void asignarTamaño(int filas, int columnas) {
        matriz = new int[filas][columnas];
    }
    
    public void cargarMatriz() {
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length; i++) {
                System.out.println("Digite un número");
                matriz[j][i] = teclado.nextInt();
            }
        }
    }
    
    public String mayor(){
        int numeroAnterior = 0;
        int mayor = 0;
        int coordenadasX = 0;
        int coordenadasY = 0;
        String imprimir = " ";
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length; i++) {
                numeroAnterior = matriz[j][i];
                if (numeroAnterior > mayor) {
                    mayor = numeroAnterior;
                    coordenadasY = j ;
                    coordenadasX = i;
                }
            }
        }
        imprimir = String.valueOf(mayor + "\n" + coordenadasY + " , " + coordenadasX);
                
        return imprimir;
    }
    
 public static void main(String[] args) {
       
    }
}
    

 