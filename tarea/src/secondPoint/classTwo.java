package secondPoint;

public class classTwo {

    private int x;
    private int y;
    private double n;
    private double m;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setN(double n) {
        this.n = n;
    }

    public void setM(double m) {
        this.m = m;
    }

    public String resta() {
        String resta;
        double res = x - y;
        double res2 = n - m;
        resta = x + " - " + y + " = " + res + "\n" + n + " - " + m + " = " + res2 + "\n";
        return resta;
    }

    public String suma() {
        String suma;
        double sum = x + y;
        double sum2 = n + m;
        suma = x + " + " + y + " = " + sum + "\n" + n + " + " + m + " = " + sum2 + "\n";
        return suma;
    }

    public String division() {
        String divi;
        double div = x / y;
        double div2 = n / m;
        divi = x + " / " + y + " = " + div + "\n" + n + " / " + m + " = " + div2 + "\n";
        return divi;
    }

    public String multiplicacion() {
        String multipli;
        double multi = x * y;
        double multi2 = n * m;
        multipli = x + " * " + y + " = " + multi + "\n" + n + " * " + m + " = " + multi2 + "\n";
        return multipli;
    }

}
