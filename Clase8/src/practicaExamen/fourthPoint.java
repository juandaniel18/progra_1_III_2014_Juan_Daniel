package practicaExamen;

public class fourthPoint {

    private int numeros[] = new int[10];

    public void asignarNumeros(int num) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                numeros[i] = num;
                break;
            }

        }
    }

    public boolean ordenado() {
        boolean ordenado = true;
        int numAnterior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] <= 1){
            numAnterior = numeros[i - 1];
            }
            if (numAnterior > numeros[i]) {
                ordenado = false;
            }
        }
        return ordenado;
    }
}
