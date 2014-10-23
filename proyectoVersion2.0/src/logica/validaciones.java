package logica;

public class validaciones {

    public boolean validarHorizontal(char ocupado) {
        boolean ganar = false;
        char ficha[] = new char[4];
        for (int i = 0; i < ficha.length; i++) {
            if (ficha[i] != ' ') {
                ficha[i] = ocupado;
                break;
            }
        }
        if (ficha[0] == 'X' && ficha[1] == 'X' && ficha[2] == 'X' && ficha[3] == 'X') {
            ganar = true;
        } else if (ficha[0] == 'X' && ficha[1] == 'X' && ficha[2] == 'X' && ficha[3] == 'X') {
            ganar = true;
        }

        return ganar;
    }
}