package practicaExamen;

public class secondPoint {

    private int firstArray[] = new int[4];
    private int secondArray[] = new int[4];
    private int thirdArray[] = new int[4];

    

    ;

    public void asignarNumero1(int num) {
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == 0) {
                firstArray[i] = num;
                break;
            }
            
        }
    }

    public void asignarNumero2(int num) {
        for (int i = 0; i < secondArray.length; i++) {
            if (secondArray[i] == 0) {
                secondArray[i] = num;
                 break;
            }
           

        }
    }

    public String suma() {
        String tabla = " ";
        for (int i = 0; i < firstArray.length; i++) {
            int suma = firstArray[i] + secondArray[i];
            thirdArray[i] = suma;
            tabla += String.valueOf(suma) + "\n";
        }
    return tabla;
    }
}
