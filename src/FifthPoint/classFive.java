package FifthPoint;

public class classFive {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public boolean parImpar() {
        boolean par = false;
        int mod;
        mod = this.a % 2;
        if (mod == 0) {
            par = true;
        }
        return par;
    }
}
