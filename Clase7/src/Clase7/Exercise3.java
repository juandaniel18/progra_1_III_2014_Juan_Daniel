package Clase7;

public class Exercise3 {

    private double salarioManana[] = new double[4];
    private double salarioTarde[] = new double[4];

    public void agregarSalarioMañana(double sueldo) {
        for (int i = 0; i < salarioManana.length; i++) {
            if (salarioManana[i] == 0) {
                salarioManana[i] = sueldo;
                break;
            }
        }
    }

    public void agregarSalarioTarde(double sueldo) {
        for (int i = 0; i < salarioTarde.length; i++) {
            if (salarioTarde[i] == 0) {
                salarioTarde[i] = sueldo;
                break;
            }
        }
    }

    public String imprimirSalario() {
        double sumaSalarioManana = 0;
        double sumaSalarioTarde = 0;
        for (int i = 0; i < salarioManana.length; i++) {
            sumaSalarioManana += salarioManana[i];
        }
        for (int i = 0; i < salarioTarde.length; i++) {
            sumaSalarioTarde += salarioTarde[i];
        }
        return "El salario en el turno de la mañana es " + sumaSalarioManana + "\n"
                + "El salario en el turno de la tarde es " + sumaSalarioTarde;
    }
}
