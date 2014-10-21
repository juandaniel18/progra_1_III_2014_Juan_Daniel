package interfazGrafica;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class interfazUsuario {

    JFrame tablero = new JFrame("Cuatro en línea");
    public JButton botones[][] = new JButton[6][7];
    GridLayout layout = new GridLayout(6, 7);
    JPanel panel = new JPanel();

    public void configurarTablero() {
        tablero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tablero.setSize(500, 300);
        tablero.add(panel);
        tablero.setVisible(true);
    }

    public void asignarLayout() {
        panel.setLayout(layout);
    }

    public void agregarBotones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[0].length; j++) {
                panel.add(botones[i][j] = new JButton());
            }
        }
    }
   
}