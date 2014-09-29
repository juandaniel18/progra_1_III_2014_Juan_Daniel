package seventhPoint;

public class classSeven {

    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean posiNega() {
        boolean positive = false;
        if (this.c >= 0) {
            positive = true;
        }
        return positive;
    }

    public boolean parImpar() {
        boolean par = false;
        int mod;
        mod = this.c % 2;
        if (mod == 0) {
            par = true;
        }
        return par;
    }

    public boolean mayorMenos() {
        boolean par = false;
        if (this.c > 100) {
            par = true;
        }
        return par;
    }

    public boolean multiCinco() {
        boolean multiplo = false;
        int acum = this.c;
        do {
            acum = acum - 5;
        } while (acum > 0);
        if (acum == 0) {
            multiplo = true;
        }
        return multiplo;
    }

    public boolean multiDiez() {
        boolean multiplo = false;
        int acum = this.c;
        do {
            acum = acum - 10;
        } while (acum > 0);
        if (acum == 0) {
            multiplo = true;
        }
        return multiplo;
    }
}
