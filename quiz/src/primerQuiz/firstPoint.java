package primerQuiz;

import java.util.Scanner;

//Diseñe un programa que le solicite al usuario digitar cinco palabras 
//con mayúscula y minúscula(estas pueden tomar cualquier orden).
//Se deben ordenar estas 5 palabras en orden alfabético y ascendente, 
//tomando en cuenta que las mayúsculas van después de las minúsculas
//pero solo con respecto a la misma letra.Un espacio en blanco va antes de cualquier letra
//Por ejemplo:
//casa Casa cosa cOsa Cosa;Estas 5 palabras están ordenadas correctamente.
public class firstPoint {

    char abecedarioMin[] = new char[54];

    public void defineMin() {
        abecedarioMin[0] = 'a';
        abecedarioMin[1] = 'b';
        abecedarioMin[2] = 'c';
        abecedarioMin[3] = 'd';
        abecedarioMin[4] = 'e';
        abecedarioMin[5] = 'f';
        abecedarioMin[6] = 'g';
        abecedarioMin[7] = 'h';
        abecedarioMin[8] = 'i';
        abecedarioMin[9] = 'j';
        abecedarioMin[10] = 'k';
        abecedarioMin[11] = 'l';
        abecedarioMin[12] = 'm';
        abecedarioMin[13] = 'n';
        abecedarioMin[14] = 'ñ';
        abecedarioMin[15] = 'o';
        abecedarioMin[16] = 'p';
        abecedarioMin[17] = 'q';
        abecedarioMin[18] = 'r';
        abecedarioMin[19] = 's';
        abecedarioMin[20] = 't';
        abecedarioMin[21] = 'u';
        abecedarioMin[22] = 'v';
        abecedarioMin[23] = 'w';
        abecedarioMin[24] = 'x';
        abecedarioMin[25] = 'y';
        abecedarioMin[26] = 'z';

        abecedarioMin[27] = 'A';
        abecedarioMin[28] = 'B';
        abecedarioMin[29] = 'C';
        abecedarioMin[30] = 'D';
        abecedarioMin[31] = 'E';
        abecedarioMin[32] = 'F';
        abecedarioMin[33] = 'G';
        abecedarioMin[34] = 'H';
        abecedarioMin[35] = 'I';
        abecedarioMin[36] = 'J';
        abecedarioMin[37] = 'K';
        abecedarioMin[38] = 'L';
        abecedarioMin[39] = 'M';
        abecedarioMin[40] = 'N';
        abecedarioMin[41] = 'Ñ';
        abecedarioMin[42] = 'O';
        abecedarioMin[43] = 'P';
        abecedarioMin[44] = 'Q';
        abecedarioMin[45] = 'R';
        abecedarioMin[46] = 'S';
        abecedarioMin[47] = 'T';
        abecedarioMin[48] = 'U';
        abecedarioMin[49] = 'V';
        abecedarioMin[50] = 'W';
        abecedarioMin[51] = 'X';
        abecedarioMin[52] = 'Y';
        abecedarioMin[53] = 'Z';
    }

    public int[] insercion(int[] arreglo, String[] words) {

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i - 1] > arreglo[i]) {
                for (int j = i; j >= 1; j--) {
                    int numero = arreglo[j - 1];
                    String lastWord = words[j - 1];
                    if (numero > arreglo[j]) {
                        String supp = words[j];
                        words[j] = lastWord;
                        words[j - 1] = supp;
                        int auxiliar = arreglo[j];
                        arreglo[j] = numero;
                        arreglo[j - 1] = auxiliar;
                    }
                }
            }
        }
        return arreglo;
    }

    public int addPositions(String word) {
        int additionPositions = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < abecedarioMin.length; j++) {
                if (word.charAt(i) == abecedarioMin[j]) {
                    additionPositions += j;
                    break;
                }
            }
        }
        return additionPositions;
    }

    public static void main(String[] args) {
        firstPoint t = new firstPoint();
        Scanner teclado = new Scanner(System.in);
        t.defineMin();
        int[] addPositions = new int[5];
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite una palabra");
            String word = teclado.next();
            addPositions[i] = t.addPositions(word);
            words[i] = word;
        }
        addPositions = t.insercion(addPositions, words);
        
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + "\n");
        }

    }
}
