package firstPoint;

public class classOne {

    private int n;
    private double a;
    private char c;

    public void setN(int n) {
        this.n = n;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setC(char c) {
        this.c = c;
    }

    public char getC() {
        return this.c;
    }

    public int getN() {
        return this.n;
    }

    public double getA() {
        return this.a;
    }

    public double suma() {
        double suma;
        suma = n + a;
        return suma;
    }

    public double resta() {
        double resta;
        resta = a - n;
        return resta;
    }

}
