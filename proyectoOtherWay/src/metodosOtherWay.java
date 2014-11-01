public class metodosOtherWay {

    private char[][] table = new char[6][7];
    private String jugador1 = "";
    private String jugador2 = "";
    private int ronda = 0;
    public int filaactual = 0;

    public int getRonda() {
        return ronda;
    }

    
    public int asignarFila() {
        int fila = 5;
        if (this.ronda > 7) {
            fila--;
        }
        return fila;
    }

    public void setRonda() {
        this.ronda++;
    }

    public String getJugador1() {
        return jugador1;
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

    public void colocarFicha(int columna) {
        for (int x = 5; x >= 0; x--) {
            char letra = table[x][columna];
            this.filaactual = x;
            if (letra != 'X' && letra != 'O') {
                this.table[x][columna] = determinarFicha();
                setRonda();
                break;
            }
        }
    }

    public void reiniciarJuego() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                this.table[i][j] = ' ';
                this.ronda = 0;
            }
        }
    }

    public char determinarFicha() {
        if (this.ronda % 2 == 0) {
            return 'X';
        } else {
            return 'O';
        }
    }

    public boolean validarVertical(int columna) {
        char[] ocupado = new char[6];
        boolean ganar = false;
        for (int x = 5; x >= 0; x--) {
            if (table[x][columna] == 'X' || table[x][columna] == 'O') {
                ocupado[x] = table[x][columna];
            }
        }

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

    public boolean validarHorizontal(int fila) {
        char[] ocupado = new char[7];
        boolean ganar = false;
        for (int x = 0; x < ocupado.length; x++) {
            if (table[fila][x] == 'X' || table[fila][x] == 'O') {
                ocupado[x] = table[fila][x];
            }
        }

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

    public boolean validarIzqArriba(int fila, int columna) {
        char[] ocupado = new char[6];
        boolean ganar = false;
        for (int x = fila, j = columna, cont = 0; x >= 0 && j >= 0; x--, j--, cont++) {
            if (table[x][j] == 'X' || table[x][j] == 'O') {
                ocupado[cont] = table[x][j];
            }
        }
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
        char[] ocupado = new char[6];
        boolean ganar = false;
        for (int x = fila, j = columna, cont = 0; x < 6 && j >= 0; x++, j--, cont++) {
            if (table[x][j] == 'X' || table[x][j] == 'O') {
                ocupado[cont] = table[x][j];
            }
        }
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
        char[] ocupado = new char[6];
        boolean ganar = false;
        for (int x = fila, j = columna, cont = 0; x < 6 && j < 7; x++, j++, cont++) {
            if (table[x][j] == 'X' || table[x][j] == 'O') {
                ocupado[cont] = table[x][j];
            }
        }
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
        char[] ocupado = new char[6];
        boolean ganar = false;
        for (int x = fila, j = columna, cont = 0; x >= 0 && j < 7; x--, j++, cont++) {
            if (table[x][j] == 'X' || table[x][j] == 'O') {
                ocupado[cont] = table[x][j];
            }
        }
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
