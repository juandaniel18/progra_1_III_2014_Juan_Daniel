package classSix;

public class exerciseTwo {

    public String cadena;

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String halfString() {
        String halfSting = "";
        for (int i = 0; i < getCadena().length() / 2; i++) {
            halfSting += getCadena().charAt(i);
        }
        return halfSting;
    }

    public String lastValue() {
        return getCadena().charAt(getCadena().length() - 1) + " ";
    }

    public String revertString() {
        String revert = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            revert += getCadena().charAt(i);
        }
        return revert;
    }
}
