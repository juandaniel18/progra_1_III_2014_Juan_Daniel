public class firstPoint {

    public String criptografia(String palabra, int saltos) {
        String palabraCorregida = "";
        char[] numeros = new char[10];
        numeros[0] = '0';
        numeros[1] = '1';
        numeros[2] = '2';
        numeros[3] = '3';
        numeros[4] = '4';
        numeros[5] = '5';
        numeros[6] = '6';
        numeros[7] = '7';
        numeros[8] = '8';
        numeros[9] = '9';

        char[] abecedario = new char[27];
        abecedario[0] = 'a';
        abecedario[1] = 'b';
        abecedario[2] = 'c';
        abecedario[3] = 'd';
        abecedario[4] = 'e';
        abecedario[5] = 'f';
        abecedario[6] = 'g';
        abecedario[7] = 'h';
        abecedario[8] = 'i';
        abecedario[9] = 'j';
        abecedario[10] = 'k';
        abecedario[11] = 'l';
        abecedario[12] = 'm';
        abecedario[13] = 'n';
        abecedario[14] = 'ñ';
        abecedario[15] = 'o';
        abecedario[16] = 'p';
        abecedario[17] = 'q';
        abecedario[18] = 'r';
        abecedario[19] = 's';
        abecedario[20] = 't';
        abecedario[21] = 'u';
        abecedario[22] = 'v';
        abecedario[23] = 'w';
        abecedario[24] = 'x';
        abecedario[25] = 'y';
        abecedario[26] = 'z';

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.toLowerCase().charAt(i);
            for (int k = 0; k < abecedario.length; k++) {
                if (letra == abecedario[k]) {
                    int posicionDefinitiva = k + saltos;
                    if (posicionDefinitiva > 26) {
                        posicionDefinitiva = posicionDefinitiva - 27;
                        palabraCorregida += abecedario[posicionDefinitiva];
                        break;
                    } else {
                        palabraCorregida += abecedario[k + saltos];
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.toLowerCase().charAt(i);
            for (int k = 0; k < numeros.length; k++) {
                if (letra == numeros[k]) {
                    int posicionDefinitiva = k + saltos;
                    if (posicionDefinitiva > 9) {
                        posicionDefinitiva = posicionDefinitiva - 10;
                        palabraCorregida += numeros[posicionDefinitiva];
                        break;
                    } else {
                        palabraCorregida += numeros[k + saltos];
                        break;
                    }
                }
            }
        }
        return palabraCorregida;
    }
}
