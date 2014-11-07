import java.util.Scanner;

// Clase que nos permite comunicarnos con el usuario y con la lógica del juego.
public class main {

    public static void main(String[] args) {

        // Instancias necesarios para el desarrollo del juego.
        metodosOtherWay logica = new metodosOtherWay();

        int opt = 0;

        do {
            try {
                Scanner teclado = new Scanner(System.in);
                // Menú que muestra las opciones del juego al usuario.
                System.out.println("Digite una opción:\n"
                        + "1. Seleccionar nombre jugador uno\n"
                        + "2. Seleccionar nombre jugador dos\n"
                        + "3. Iniciar juego\n"
                        + "4. Rendirse\n"
                        + "5. Reiniciar\n"
                        + "6. Colocar ficha\n"
                        + "7. Estadísticas\n"
                        + "8. Salir");

                // Recupera lo que el usuario ha digitado.
                opt = teclado.nextInt();

                switch (opt) {

                    case 1:
                        // Asigna el nombre del primer jugador.
                        teclado = new Scanner(System.in);
                        System.out.println("Seleccionar nombre de jugador uno");
                        String nombre = teclado.nextLine();
                        logica.setJugador1(nombre);
                        break;

                    case 2:
                        // Asigna el nombre del segundo jugador.
                        teclado = new Scanner(System.in);
                        System.out.println("Seleccionar nombre de jugador dos");
                        nombre = teclado.nextLine();
                        logica.setJugador2(nombre);
                        break;

                    case 3:
                        // Imprime el tablero.
                        System.out.println(logica.crearTablero());
                        break;

                    case 4:
                        char rendirse;
                        System.out.println("Si se rinde el juego se reiniciara y usted perderá...\n"
                                + " ¿Desea continuar(S/N)?");
                        teclado = new Scanner(System.in);
                        rendirse = teclado.next().charAt(0);
                        if (rendirse == 'S' || rendirse == 's') {
                            System.out.println(logica.ganador());
                            logica.reiniciarJuego();
                            System.out.println(logica.crearTablero());
                        } else {
                            System.out.println(logica.imprimirEstadisticas());
                            System.exit(0);
                        }
                        break;

                    case 5:
                        logica.reiniciarJuego();
                        System.out.println(logica.crearTablero());
                        break;

                    case 6:
                        int y = 0;

                        do {
                            System.out.println("Digite la columna en que desea colocar la ficha (0 - 6) ");
                            y = teclado.nextInt();
                        } while (y < 0 || y > 6);

                        logica.colocarFicha(y);
                        System.out.println(logica.crearTablero());

                        boolean empate = logica.empate();
                        if (empate) {
                            logica.reiniciarJuego();
                        }

                        boolean validarHorizontal = false;
                        // For que nos permite decirle a validarHorizontal que recorra todo el tablero.
                        for (int i = 5; i >= 0; i--) {
                            validarHorizontal = logica.validarHorizontal(i);
                            // If para cortar el for cuando el jugador haya puesto 4 de sus fichas en el tablero.
                            if (validarHorizontal) {
                                break;
                            }
                        }

                        boolean validarVertical = logica.validarVertical(y);
                        boolean validarIzqArriba = logica.validarIzqArriba(logica.filaactual, y);
                        boolean validarIzqAbajo = logica.validarIzqAbajo(logica.filaactual, y);
                        boolean validarDerechaArriba = logica.validarDerechaArriba(logica.filaactual, y);
                        boolean validarDerechaAbajo = logica.validarDerechaAbajo(logica.filaactual, y);
                        if (validarVertical || validarHorizontal || validarIzqArriba || validarIzqAbajo || validarDerechaAbajo || validarDerechaArriba) {
                            System.out.println(logica.ganador());
                            System.out.println("¿Desea continuar jugando?(S/N)");
                            char continuar = teclado.next().charAt(0);
                            if (continuar == 'S' || continuar == 's') {
                                logica.reiniciarJuego();
                            } else {
                                System.out.println(logica.imprimirEstadisticas());
                                System.exit(0);
                            }
                        }
                        break;
                    case 7:
                        System.out.println(logica.imprimirEstadisticas());
                        break;
                }
            } catch (RuntimeException e) {
                System.out.println("Debe digitar un nùmero");
            }
        } while (opt != 8);

    }
}
