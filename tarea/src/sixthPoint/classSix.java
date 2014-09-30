package sixthPoint;

public class classSix {

    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean posiNega(int n) {
        boolean positive = false;
        if (n >= 0) {
            positive = true;
        }
        return positive;
    }
}
