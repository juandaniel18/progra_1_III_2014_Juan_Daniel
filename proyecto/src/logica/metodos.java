package logica;

import interfazGrafica.interfazUsuario;
import java.awt.event.ActionEvent;
//import eventos.eventos;
import java.awt.event.ActionListener;

public class metodos implements ActionListener {

    interfazUsuario tablero = new interfazUsuario();
//    eventos eventos = new eventos();

//    public String jugador1 = "";
//    public String jugador2 = "";
    int ronda = 0;
//    public String getJugador1() {
//        return jugador1;
//    }
//
//    public void setJugador1(String jugador1) {
//        this.jugador1 = jugador1;
//    }
//
//    public String getJugador2() {
//        return jugador2;
//    }
//
//    public void setJugador2(String jugador2) {
//        this.jugador2 = jugador2;
//    }
//
    public int getRonda() {
        return ronda;
    }
//
    public void setRonda() {
        this.ronda++;
    }
    public char colocarFicha() {
        if (ronda == 0) {
            return 'X';
        }
        if (ronda % 2 == 0) {
            return 'X';
        } else {
            return 'O';
        }
    }
    public void agregarListener() {
        for (int i = 0; i < tablero.botones.length; i++) {
            for (int j = 0; j < tablero.botones[0].length; j++) {
                tablero.botones[i][j].addActionListener(this);
            }
        }

    }
    
    public void iniciarJuego() {
        tablero.configurarTablero();
        tablero.asignarLayout();
        tablero.agregarBotones();
        agregarListener();
    }

    public void reiniciarJuego() {
        iniciarJuego();

    }

    public void rendirse(boolean continuar) {
        if (continuar) {
            iniciarJuego();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.equals(e));
        
        tablero.botones[0][0].setText(String.valueOf(colocarFicha()));
        setRonda();
        
    }

    public static void main(String[] args) {
        metodos logica = new metodos();
        logica.iniciarJuego();
        
    }

}