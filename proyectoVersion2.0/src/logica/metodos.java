package logica;

import interfazGrafica.interfazUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class metodos implements ActionListener {

    interfazUsuario tablero = new interfazUsuario();
    validaciones vali = new validaciones();
    public String jugador1 = "";
    public String jugador2 = "";
    int ronda = 0;

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public void setRonda() {
        this.ronda++;
    }

    public char colocarFicha() {
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
        this.ronda = 0;
    }

    public void rendirse(boolean continuar) {
        if (continuar) {
            iniciarJuego();
            this.ronda = 0;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        for (int i = 0; i < tablero.botones.length; i++) {
            for (int j = 0; j < tablero.botones[0].length; j++) {
                if (boton == tablero.botones[i][j]) {
                    for (int x = 5; x >= 0; x--) {
                        String texto = tablero.botones[x][j].getText();
                        if (texto == "") {
                            tablero.botones[x][j].setText(String.valueOf(colocarFicha()));
                            tablero.botones[x][j].setEnabled(false);
                            setRonda();
                            
                            break;
                        }
//                     boolean ganar = vali.validarHorizontal(texto.charAt(0));
//                     if(ganar){
//                     System.exit(0);
//                     }
                    }
                   
                }
            }
        }
    }

    public static void main(String[] args) {
        metodos logica = new metodos();
        logica.iniciarJuego();

    }

}