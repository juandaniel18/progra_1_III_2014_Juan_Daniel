// Clase que nos proporciona la lógica del juego.
public class metodosOtherWay {

    // Variables que guardara las fichas.
    private char[][] table = new char[6][7];
    // Variables que nos almacenan los nombres de los jugadores.
    private String jugador1 = "";
    private String jugador2 = "";
    // Variables que nos almacenan las estadisticas del juego
    private int ganadasJugador1 = 0;
    private int perdidasJugador1 = 0;
    private int ganadasJugador2 = 0;
    private int perdidasJugador2 = 0;
    // Variable que nos permite llevar control de la ronda en que nos encontramos.
    private int ronda = 0;
    // Variable que nos dice en qué fila se encuentra la ficha recien puesta.
    public int filaactual = 0;

    public int getGanadasJugador1() {
        return ganadasJugador1;
    }

    public void setGanadasJugador1() {
        this.ganadasJugador1++;
    }

    public int getPerdidasJugador1() {
        return perdidasJugador1;
    }

    public void setPerdidasJugador1() {
        this.perdidasJugador1++;
    }

    public int getGanadasJugador2() {
        return ganadasJugador2;
    }

    public void setGanadasJugador2() {
        this.ganadasJugador2++;
    }

    public int getPerdidasJugador2() {
        return perdidasJugador2;
    }

    public void setPerdidasJugador2() {
        this.perdidasJugador2++;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda() {
        this.ronda++;
    }

    public String getJugador1() {
        return jugador1;
    }

    // Método que nos imprime quién ha ganado y lleva el control de las estadísticas.
    public String ganador() {
        String ganador;
        if (this.ronda % 2 == 0) {
            ganador = getJugador2() + " ha ganado";
            setGanadasJugador2();
            setPerdidasJugador1();
        } else {
            ganador = getJugador1() + " ha ganado";
            setGanadasJugador1();
            setPerdidasJugador2();
        }
        return ganador;
    }

    // Método que nos dice cuantas veces han ganado y perdido los jugadores. 
    public String imprimirEstadisticas() {
        String imprimir = "";
        imprimir += getJugador1() + "\n" + getGanadasJugador1() + " ganadas\n"
                + getPerdidasJugador1() + " perdidas\n";
        imprimir += getJugador2() + "\n" + getGanadasJugador2() + " ganadas\n"
                + getPerdidasJugador2() + " perdidas\n";
        return imprimir;
    }

    // Método para asignar el nombre al jugador 1.
    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    // Método para asignar el nombre al jugador 2.
    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    // Método que nos permite imprimir el tablero y las fichas puestas.
    public String crearTablero() {
        String tabla = "";
        for (int i = 0; i < 6; i++) {
            tabla += "\n";
            for (int j = 0; j < 7; j++) {
                tabla += "( " + this.table[i][j] + " )";
            }
        }
        return tabla;
    }

    // Método que coloca la ficha en el tablero.
    public void colocarFicha(int columna) {
        // For que nos recorre las 5 filas.
        for (int x = 5; x >= 0; x--) {
            // Variable qué nos dice si la posición en el tablero está ocupada o no.
            char letra = table[x][columna];
            // Variable que nos dirá la primera fila desocupada, nos ayuda a hacer las validaciones en diagonal.
            this.filaactual = x;
            if (letra != 'X' && letra != 'O') {
                // Guarda la X o la O en el tablero.
                this.table[x][columna] = determinarFicha();
                // Aumenta la ronda en qué nos encontramos.
                setRonda();
                break;
            }
        }

    }

    // Método que deja en blanco la matriz que guarda las fichas.
    public void reiniciarJuego() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                this.table[i][j] = ' ';
                this.ronda = 0;
            }
        }
    }

    // Método que nos permite determinar si es el turno del jugador uno (X) o dos (O).
    public char determinarFicha() {
        if (this.ronda % 2 == 0) {
            return 'X';
        } else {
            return 'O';
        }
    }

    // Método que recorre todo el tablero verticalmente y nos dice si algun jugador ha colocado las 4 fichas.
    public boolean validarVertical(int columna) {
        // Matriz para guardar todas las fichas que se encuentra verticalmente.
        char[] ocupado = new char[6];
        boolean ganar = false;
        // For que recorre la matriz verticalmente y nos guarda las fichas que se encuentran puestas.
        for (int x = 5; x >= 0; x--) {
            if (table[x][columna] == 'X' || table[x][columna] == 'O') {
                ocupado[x] = table[x][columna];
            }
        }

        // Validaciones que nos dicen si algun jugador ha puesto 4 de sus fichas verticalmente.
        if (ocupado[5] == 'X' && ocupado[4] == 'X' && ocupado[3] == 'X' && ocupado[2] == 'X') {
            ganar = true;
        } else if (ocupado[4] == 'X' && ocupado[3] == 'X' && ocupado[2] == 'X' && ocupado[1] == 'X') {
            ganar = true;
        } else if (ocupado[3] == 'X' && ocupado[2] == 'X' && ocupado[1] == 'X' && ocupado[0] == 'X') {
            ganar = true;

        } else if (ocupado[5] == 'O' && ocupado[4] == 'O' && ocupado[3] == 'O' && ocupado[2] == 'O') {
            ganar = true;
        } else if (ocupado[4] == 'O' && ocupado[3] == 'O' && ocupado[2] == 'O' && ocupado[1] == 'O') {
            ganar = true;

        } else if (ocupado[3] == 'O' && ocupado[2] == 'O' && ocupado[1] == 'O' && ocupado[0] == 'O') {
            ganar = true;

        }

        return ganar;
    }

    // Método que recorre todo el tablero horizontalmente y nos dice si algun jugador ha colocado las 4 fichas.
    public boolean validarHorizontal(int fila) {
        // Matriz para guardar todas las fichas que se encuentra horizontalmente.
        char[] ocupado = new char[7];
        boolean ganar = false;
        // For que recorre la matriz horizontalmente y nos guarda las fichas que se encuentran puestas.
        for (int x = 0; x < ocupado.length; x++) {
            if (table[fila][x] == 'X' || table[fila][x] == 'O') {
                ocupado[x] = table[fila][x];
            }
        }
        
        // Validaciones que nos dicen si algun jugador ha puesto 4 de sus fichas horizontalmente.
        if (ocupado[0] == 'X' && ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[3] == 'X') {
            ganar = true;
        } else if (ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[3] == 'X' && ocupado[4] == 'X') {
            ganar = true;
        } else if (ocupado[2] == 'X' && ocupado[3] == 'X' && ocupado[4] == 'X' && ocupado[5] == 'X') {
            ganar = true;
        } else if (ocupado[3] == 'X' && ocupado[4] == 'X' && ocupado[5] == 'X' && ocupado[6] == 'X') {
            ganar = true;

        } else if (ocupado[0] == 'O' && ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O') {
            ganar = true;
        } else if (ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O' && ocupado[4] == 'O') {
            ganar = true;
        } else if (ocupado[2] == 'O' && ocupado[3] == 'O' && ocupado[4] == 'O' && ocupado[5] == 'O') {
            ganar = true;
        } else if (ocupado[3] == 'O' && ocupado[4] == 'O' && ocupado[5] == 'O' && ocupado[6] == 'O') {
            ganar = true;
        }
        return ganar;
    }

    // Método que recorre todo el tablero diagonalmente y nos dice si algun jugador ha colocado las 4 fichas.
    public boolean validarIzqArriba(int fila, int columna) {
        // Matriz para guardar todas las fichas que se encuentra diagonalmente.
        char[] ocupado = new char[6];
        boolean ganar = false;
        // For que recorre la matriz diagonalmente y nos guarda las fichas que se encuentran puestas.
        for (int x = fila, j = columna, cont = 0; x >= 0 && j >= 0; x--, j--, cont++) {
            if (table[x][j] == 'X' || table[x][j] == 'O') {
                ocupado[cont] = table[x][j];
            }
        }
        
        // Validaciones que nos dicen si algun jugador ha puesto 4 de sus fichas diagonalmente.
        if (ocupado[0] == 'X' && ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[3] == 'X') {
            ganar = true;
        } else if (ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[3] == 'X' && ocupado[4] == 'X') {
            ganar = true;
        } else if (ocupado[2] == 'X' && ocupado[3] == 'X' && ocupado[4] == 'X' && ocupado[5] == 'X') {
            ganar = true;

        } else if (ocupado[0] == 'O' && ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O') {
            ganar = true;
        } else if (ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O' && ocupado[4] == 'O') {
            ganar = true;
        } else if (ocupado[2] == 'O' && ocupado[3] == 'O' && ocupado[4] == 'O' && ocupado[5] == 'O') {
            ganar = true;
        }
        return ganar;
    }

    public boolean validarIzqAbajo(int fila, int columna) {
        // Matriz para guardar todas las fichas que se encuentra diagonalmente.
        char[] ocupado = new char[6];
        boolean ganar = false;
        // For que recorre la matriz diagonalmente y nos guarda las fichas que se encuentran puestas.
        for (int x = fila, j = columna, cont = 0; x < 6 && j >= 0; x++, j--, cont++) {
            if (table[x][j] == 'X' || table[x][j] == 'O') {
                ocupado[cont] = table[x][j];
            }
        }
        
        // Validaciones que nos dicen si algun jugador ha puesto 4 de sus fichas diagonalmente.
        if (ocupado[0] == 'X' && ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[3] == 'X') {
            ganar = true;
        } else if (ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[3] == 'X' && ocupado[4] == 'X') {
            ganar = true;
        } else if (ocupado[2] == 'X' && ocupado[3] == 'X' && ocupado[4] == 'X' && ocupado[5] == 'X') {
            ganar = true;

        } else if (ocupado[0] == 'O' && ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O') {
            ganar = true;
        } else if (ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O' && ocupado[4] == 'O') {
            ganar = true;
        } else if (ocupado[2] == 'O' && ocupado[3] == 'O' && ocupado[4] == 'O' && ocupado[5] == 'O') {
            ganar = true;
        }
        return ganar;
    }

    public boolean validarDerechaAbajo(int fila, int columna) {
        // Matriz para guardar todas las fichas que se encuentra diagonalmente.
        char[] ocupado = new char[6];
        boolean ganar = false;
        // For que recorre la matriz diagonalmente y nos guarda las fichas que se encuentran puestas.
        for (int x = fila, j = columna, cont = 0; x < 6 && j < 7; x++, j++, cont++) {
            if (table[x][j] == 'X' || table[x][j] == 'O') {
                ocupado[cont] = table[x][j];
            }
        }
        
        // Validaciones que nos dicen si algun jugador ha puesto 4 de sus fichas diagonalmente.
        if (ocupado[0] == 'X' && ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[3] == 'X') {
            ganar = true;
        } else if (ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[3] == 'X' && ocupado[4] == 'X') {
            ganar = true;
        } else if (ocupado[2] == 'X' && ocupado[3] == 'X' && ocupado[4] == 'X' && ocupado[5] == 'X') {
            ganar = true;

        } else if (ocupado[0] == 'O' && ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O') {
            ganar = true;
        } else if (ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O' && ocupado[4] == 'O') {
            ganar = true;
        } else if (ocupado[2] == 'O' && ocupado[3] == 'O' && ocupado[4] == 'O' && ocupado[5] == 'O') {
            ganar = true;
        }
        return ganar;
    }

    public boolean validarDerechaArriba(int fila, int columna) {
        // Matriz para guardar todas las fichas que se encuentra diagonalmente.
        char[] ocupado = new char[6];
        boolean ganar = false;
        // For que recorre la matriz diagonalmente y nos guarda las fichas que se encuentran puestas.
        for (int x = fila, j = columna, cont = 0; x >= 0 && j < 7; x--, j++, cont++) {
            if (table[x][j] == 'X' || table[x][j] == 'O') {
                ocupado[cont] = table[x][j];
            }
        }
        
        // Validaciones que nos dicen si algun jugador ha puesto 4 de sus fichas diagonalmente.
        if (ocupado[0] == 'X' && ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[4] == 'X') {
            ganar = true;
        } else if (ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[3] == 'X' && ocupado[4] == 'X') {
            ganar = true;
        } else if (ocupado[2] == 'X' && ocupado[3] == 'X' && ocupado[4] == 'X' && ocupado[5] == 'X') {
            ganar = true;

        } else if (ocupado[0] == 'O' && ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O') {
            ganar = true;
        } else if (ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O' && ocupado[4] == 'O') {
            ganar = true;
        } else if (ocupado[2] == 'O' && ocupado[3] == 'O' && ocupado[4] == 'O' && ocupado[5] == 'O') {
            ganar = true;
        }
        return ganar;
    }
}
