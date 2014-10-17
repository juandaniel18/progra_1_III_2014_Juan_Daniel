package interfazGrafica;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class interfazUsuario {

    JFrame tablero = new JFrame("Cuatro en línea");
    JButton botones[][] = new JButton[6][7];
    FlowLayout layout = new FlowLayout();

    public void configurarTablero() {
        tablero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tablero.setSize(500, 300);
        tablero.setVisible(true);
    }

    public void asignarLayout() {
        tablero.setLayout(layout);
    }

//    public void agregarBotones() {
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 7; j++) {
//                tablero.add(botones[i][j]);
//            }
//        }
//    }

    public static void main(String[] args) {
        interfazUsuario t = new interfazUsuario();
        t.configurarTablero();
        t.asignarLayout();
//        t.agregarBotones();

    }

}
