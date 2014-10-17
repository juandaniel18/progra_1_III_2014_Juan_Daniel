package logica;

import interfazGrafica.interfazUsuario;

public class metodos {

    interfazUsuario tablero = new interfazUsuario();

    public void iniciarJuego() {
        tablero.configurarTablero();
        tablero.asignarLayout();
    }

    public void reiniciarJuego() {

        iniciarJuego();

    }

    public void rendirse(boolean continuar) {
        while (continuar) {
            iniciarJuego();
        }
    }

    public static void main(String[] args) {
        metodos t = new metodos();
        t.iniciarJuego();
    }
}
