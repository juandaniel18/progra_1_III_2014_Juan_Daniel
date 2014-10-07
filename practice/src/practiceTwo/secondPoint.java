package practiceTwo;

public class secondPoint {

    private double num;

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    // Method to determinate the last digit of the number that the user inserts.
    public double lastNum() {
        // Variable of support.
        double supp = this.num;
        while (supp > 10) {
            supp = supp - 10;
        }
        return supp;
    }

    public double squareRoot() {
        return this.num * this.num;
    }

    public double multiply() {
        return this.num * 5;
    }
}