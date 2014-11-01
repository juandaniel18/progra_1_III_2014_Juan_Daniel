public class insercion {

    public int[] insercion(int arreglo[], String ordenamiento) {

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i - 1] > arreglo[i]) {
                for (int j = i; j >= 1; j--) {
                    int numero = arreglo[j - 1];
                    if (numero > arreglo[j]) {
                        int auxiliar = arreglo[j];
                        arreglo[j] = numero;
                        arreglo[j - 1] = auxiliar;
                    }
                }
            }
        }
        return arreglo;
    }
}
