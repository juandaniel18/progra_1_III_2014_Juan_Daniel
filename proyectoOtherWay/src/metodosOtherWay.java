public class metodosOtherWay {

    estadisticas estadis = new estadisticas();
    private int filaActual = 5;
    private char[][] table = new char[6][7];
    private String jugador1 = "";
    private String jugador2 = "";
    private int ronda = 0;

    public int getRonda() {
        return ronda;
    }

    
    public void setFilaActual() {
        this.filaActual--;
    }

    public int getFilaActual() {
        return filaActual;
    }

    public void asignarFila() {
        int support = this.ronda;
        while (support > 7) {
            support = support - 7;
            setFilaActual();
        }

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
            if (letra != 'X' && letra != 'O') {
                this.table[x][columna] = determinarFicha();
                asignarFila();
                break;
            }
        }
        setRonda();
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
            estadis.setGanadasJugador1();
            estadis.setPerdidasJugador2();

        }
        if (ocupado[5] == 'O' && ocupado[4] == 'O' && ocupado[3] == 'O' && ocupado[2] == 'O') {
            ganar = true;
            estadis.setGanadasJugador2();
            estadis.setPerdidasJugador1();
        }
        return ganar;
    }

    public boolean validarHorizontal(int fila) {
        char[] ocupado = new char[5];
        boolean ganar = false;
        for (int x = 0; x < 5; x++) {
            if (table[fila][x] == 'X' || table[fila][x] == 'O') {
                ocupado[x] = table[fila][x];
            }
        }
        if (ocupado[0] == 'X' && ocupado[1] == 'X' && ocupado[2] == 'X' && ocupado[3] == 'X') {
            ganar = true;
            estadis.setGanadasJugador1();
            estadis.setPerdidasJugador2();
        }
        if (ocupado[0] == 'O' && ocupado[1] == 'O' && ocupado[2] == 'O' && ocupado[3] == 'O') {
            ganar = true;
            estadis.setGanadasJugador2();
            estadis.setPerdidasJugador1();
        }
        return ganar;
    }
}
