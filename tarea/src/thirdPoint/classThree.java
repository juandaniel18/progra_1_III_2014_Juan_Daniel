package thirdPoint;

public class classThree {

    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void incrementar() {
        this.n = this.n + 77;
    }

    public void decrementar() {
        this.n = this.n - 3;
    }

    public void duplicar() {
        this.n = this.n + this.n;
    }
}
