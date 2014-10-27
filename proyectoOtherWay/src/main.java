import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        estadisticas estadis = new estadisticas();
        Scanner teclado = new Scanner(System.in);
        metodosOtherWay logica = new metodosOtherWay();

        int opt;

        do {

            System.out.println("Digite una opción:\n"
                    + "1. Seleccionar nombre jugador uno\n"
                    + "2. Seleccionar nombre jugador dos\n"
                    + "3. Iniciar juego\n"
                    + "4. Rendirse\n"
                    + "5. Reiniciar\n"
                    + "6. Colocar ficha\n"
                    + "7. Ganador\n"
                    + "8. Perdedor\n"
                    + "9. Estadísticas\n"
                    + "10. Salir");

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
                    System.out.println("Seleccionar nombre de jugador dos");
                    nombre = teclado.nextLine();
                    logica.setJugador2(nombre);
                    break;

                case 3:
                    System.out.println(logica.crearTablero());
                    break;

                case 4:
                    char rendirse;
                    System.out.println("Si se rinde el juego se reiniciara y usted perderá...\n"
                            + " ¿Desea continuar?");
                    teclado = new Scanner(System.in);
                    rendirse = teclado.next().charAt(0);
                    if (rendirse == 'S' || rendirse == 's') {
                        if (logica.getRonda() % 2 == 0) {
                            estadis.setGanadasJugador1();
                            estadis.setPerdidasJugador2();

                        } else {
                            estadis.setGanadasJugador2();
                            estadis.setPerdidasJugador1();
                        }
                        logica.reiniciarJuego();
                        System.out.println(logica.crearTablero());
                    }
                    break;

                case 5:
                    logica.reiniciarJuego();
                    System.out.println(logica.crearTablero());
                    break;

                case 6:
                    int y;
                    do {
                        System.out.println("Digite la columna en que desea colocar la ficha");
                        y = teclado.nextInt();
                    } while (y < 0 || y > 6);
                    logica.colocarFicha(y);
                    System.out.println(logica.crearTablero());

                    boolean validarVertical = logica.validarVertical(y);
                    if (validarVertical) {
                        System.out.println("Felicidades... Haz ganado");
                        System.out.println("¿Desea continuar jugando?(S/N)");
                        char continuar = teclado.next().charAt(0);
                        if (continuar == 'S' || continuar == 's') {
                            logica.reiniciarJuego();

                        } else {
                            System.out.println(logica.getJugador1() + "\n"
                            + estadis.getGanadasJugador1() + " partidas ganadas \n"
                            + estadis.getPerdidasJugador1() + " partidas perdidas.");
                            
                            System.out.println(logica.getJugador2() + "\n"
                            + estadis.getGanadasJugador2() + " partidas ganadas\n"
                            + estadis.getPerdidasJugador2() + " partidas perdidas.");
                            
                            System.exit(0);
                        }

                    }

                    boolean validarHorizontal = logica.validarHorizontal(logica.getFilaActual());
                    if (validarHorizontal) {
                        System.out.println("Felicidades... Haz ganado");
                    }

                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    System.out.println(logica.getJugador1() + "\n"
                            + estadis.getGanadasJugador1() + " partidas ganadas \n"
                            + estadis.getPerdidasJugador1() + " partidas perdidas.");
                    
                    System.out.println(logica.getJugador2() + "\n"
                            + estadis.getGanadasJugador2() + " partidas ganadas\n"
                            + estadis.getPerdidasJugador2() + " partidas perdidas.");

            }
        } while (opt != 10);
    }
}
