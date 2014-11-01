public class seleccion {

    public int[] seleccion(int arreglo[], String ordenamiento) {
        int indice;
        int indice2;
        int menor;
        int posicion;
        int temporal;

        for (indice = 0; indice < arreglo.length; indice++) {
            menor = arreglo[indice];
            posicion = indice;

            for (indice2 = indice + 1; indice2 < arreglo.length; indice2++) {
                if (arreglo[indice2] < menor) {
                    menor = arreglo[indice2];
                    posicion = indice2;
                }
            }
            if (posicion != indice) {
                temporal = arreglo[indice];
                arreglo[indice] = arreglo[posicion];
                arreglo[posicion] = temporal;
            }
        }
        return arreglo;
    }
}
