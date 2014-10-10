package Clase7;

public class Exercise1 {

    double[] salarios = new double[5];

    public void agregarSalario(double salario) {
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] == 0) {
                salarios[i] = salario;
                break;
            }
        }

    }

    public String imprimirSalarios() {
        String imprimir = " ";
        for (int i = 0; i < salarios.length; i++) {
            imprimir += "El salario del trabajador # " + (i + 1) + " es de " + salarios[i] + "\n";
        }
        return imprimir;
    }
}
