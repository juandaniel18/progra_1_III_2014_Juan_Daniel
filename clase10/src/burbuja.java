public class burbuja {

    public int[] ordenadoBurbuja(int[] arreglo, String ordenamiento) {
        int indice;
        int indice2;
        int aux;

        for (indice = 0; indice < arreglo.length - 1; indice++) {
            for (indice2 = 0; indice2 < ((arreglo.length - indice) - 1); indice2++) {
                if (arreglo[indice2 + 1] < arreglo[indice2]) {
                    aux = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = aux;
                }
            }
        }
        return arreglo;
    }
}
