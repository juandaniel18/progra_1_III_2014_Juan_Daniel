package Clase7;

public class Exercise2 {

    private float alturas[] = new float[5];

    public void agregarAltura(float altura) {
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] == 0) {
                alturas[i] = altura;
                break;
            }
        }
    }

    public float promedio() {
        float sumaPromedio = 0;
        float promedio = 0;
        for (int i = 0; i < alturas.length; i++) {
            sumaPromedio += alturas[i];
        }
        promedio = sumaPromedio / alturas.length;
        return promedio;
    }

    public String contarPersonas() {
        String personasBajas = "";
        String personasAltas = "";
        String retorno = "";
        float promedio = this.promedio();
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > promedio) {
                personasAltas += "La persona # " + (i + 1) + " es alta\n";
            } else {
                personasBajas += "La persona # " + (i + 1) + " es baja\n";
            }
        }
        retorno = personasAltas + "\n" + personasBajas;
        return retorno;
    }
}
