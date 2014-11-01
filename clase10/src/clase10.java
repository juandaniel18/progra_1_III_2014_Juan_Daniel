public class clase10 {

    public static void main(String[] args) {

        seleccion sort1 = new seleccion();
        burbuja sort2 = new burbuja();
        insercion sort3 = new insercion();
        int[] size = {8, 5, 2, 6, 0};
        int[] temporal = sort1.seleccion(size, "A");
        for (int i = 0; i < temporal.length; i++) {
            System.out.print(temporal[i]);
        }
        System.out.println();

        sort2.ordenadoBurbuja(size, "A");
        int[] exercise3 = {9, 1, 6, 7, 3, 8};
        sort3.insercion(exercise3, "A");

    }
}
