package logica;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int opt = 0;

        metodos logica = new metodos();
        estadisticas info = new estadisticas();
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite una opción:\n"
                    + "1. Seleccionar nombre jugador uno\n"
                    + "2. Seleccionar nombre jugador dos\n"
                    + "3. Iniciar juego\n"
                    + "4. Rendirse\n"
                    + "5. Reiniciar\n"
                    + "6. Estadísticas\n"
                    + "7. Salir");

            opt = teclado.nextInt();

            switch (opt) {
                case 1:
                    teclado = new Scanner(System.in);
                    System.out.println("Seleccionar nombre de jugador uno");
                    String nombre = teclado.nextLine();
                    logica.setJugador1(nombre);
                    break;

                case 2:
                    teclado = new Scanner(System.in);
                    System.out.println("Seleccionar nombre de jugador uno");
                    nombre = teclado.nextLine();
                    logica.setJugador2(nombre);
                    break;

                case 3:
                    logica.iniciarJuego();
                    break;
                    
                case 4:
                    char rendirse;
                    System.out.println("Si se rinde el juego se reiniciara...\n"
                            + " ¿Desea continuar?");
                    teclado = new Scanner(System.in);
                    rendirse = teclado.next().charAt(0);
                    if (rendirse == 'S' || rendirse == 's') {
                        logica.rendirse(true);
                    }
                    break;

                case 5:
                    logica.reiniciarJuego();
                    break;
                    
                case 6:
                    System.out.println("El jugador 1 tiene " + info.getGanadasJugador1() + " partidas ganadas.");
                    System.out.println("El jugador 1 tiene " + info.getPerdidasJugador1()+ " partidas perdidas.");
                    System.out.println("El jugador 2 tiene " + info.getGanadasJugador2() + " partidas ganadas.");
                    System.out.println("El jugador 2 tiene " + info.getPerdidasJugador2() + " partidas perdidas.");
            }
        } while (opt != 5);
    }
}