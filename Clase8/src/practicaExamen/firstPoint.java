package practicaExamen;

public class firstPoint {

    private double vector[] = new double[8];

    public void asignarNumero(double num) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                vector[i] = num;
                break;
            }
        }

    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma;
    }

    public int mayor50() {
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 50) {
                cont++;
            }
        }
        return cont;
    }

    public String mayor36() {
        String mayor = "";
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
            mayor += String.valueOf(vector[i]) + "," ;
            if (suma > 36) {
                break;
            }
        }
        return mayor;
    }
}
