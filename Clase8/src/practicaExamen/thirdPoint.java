package practicaExamen;

public class thirdPoint {

    private double cursoA[] = new double[5];
    private double cursoB[] = new double[5];

    public void asignarNotasA(double num) {
        for (int i = 0; i < cursoA.length; i++) {
            if (cursoA[i] == 0) {
                cursoA[i] = num;
                break;
            }

        }
    }

    public void asignarNotasB(double num) {
        for (int i = 0; i < cursoB.length; i++) {
            if (cursoB[i] == 0) {
                cursoB[i] = num;
                break;
            }

        }
    }

    public double promedioA() {
        double promedioA = 0;
        double sumaA = 0;
        for (int i = 0; i < cursoA.length; i++) {
            sumaA += cursoA[i];
        }
        promedioA = sumaA / 5;
        return promedioA;
    }

    public double promedioB() {
        double promedioB = 0;
        double sumaB = 0;
        for (int i = 0; i < cursoB.length; i++) {
            sumaB += cursoB[i];
        }
        promedioB = sumaB / 5;
        return promedioB;
    }

    public String mostrarMayor() {
        String mayor = "";
        if (promedioA() > promedioB()) {
            mayor = "El curso A tiene un mayor promedio general";
        } else {
            mayor = "El curso B tiene un mayor promedio general";
        }
        return mayor;
    }
}
