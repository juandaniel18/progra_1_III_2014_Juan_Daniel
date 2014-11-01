import java.util.Scanner;

public class secondPoint {

    public String imprimirDesglose(int dinero) {
        String billetes = "";
        int total = dinero;
        int cont5000 = 0;
        int cont2000 = 0;
        int cont1000 = 0;
        int cont500 = 0;
        int cont100 = 0;
        int cont50 = 0;
        int cont25 = 0;

        while (total >= 5000) {
            cont5000++;
            total = total - 5000;
        }
        while (total >= 2000) {
            cont2000++;
            total = total - 2000;
        }
        while (total >= 1000) {
            cont1000++;
            total = total - 1000;
        }
        while (total >= 500) {
            cont500++;
            total = total - 500;
        }
        while (total >= 100) {
            cont100++;
            total = total - 100;
        }
        while (total >= 50) {
            cont50++;
            total = total - 500;
        }
        while (total >= 25) {
            cont25++;
            total = total - 25;
        }

        if (cont5000 != 0) {
            billetes += cont5000 + " billetes de 5000\n";
        }
        if (cont2000 != 0) {
            billetes += cont2000 + " billetes de 2000\n";
        }
        if (cont1000 != 0) {
            billetes += cont1000 + " billetes de 1000\n";
        }
        if (cont500 != 0) {
            billetes += cont500 + " monedas de 500\n";
        }
        if (cont100 != 0) {
            billetes += cont100 + " monedas de 100\n";
        }
        if (cont50 != 0) {
            billetes += cont50 + " monedas de 50\n";
        }
        if (cont25 != 0) {
            billetes += cont25 + " monedas de 25\n";
        }

        return billetes;
    }

    public String imprimirTotal(int dinero) {
        String total = "El total es de ";
        String primerDigito = String.valueOf(dinero);
        
        
        if (primerDigito.charAt(0) == '9') {
            total += " nueve mil ";
        } if (primerDigito.charAt(0) == '8') {
            total += " ocho mil ";
        } if (primerDigito.charAt(0)  == '7') {
             total += " siete mil ";
        } if (primerDigito.charAt(0)  == '6') {
            total += " seis mil ";
        } if (primerDigito.charAt(0)  == '5') {
             total += " cinco mil ";
        } if (primerDigito.charAt(0)  == '4') {
            total += " cuatro mil ";
        } if (primerDigito.charAt(0)  == '3') {
            total += " tres mil ";
        } if (primerDigito.charAt(0)  == '2') {
            total += " dos mil ";
        }  if (primerDigito.charAt(0)  == '1') {
            total += " mil ";
        }
        
        if (primerDigito.charAt(1)  == '9') {
            total += " novecientos ";
        } if (primerDigito.charAt(1)  == '8') {
            total += " ochocientos ";
        } if (primerDigito.charAt(1) == '7') {
             total += " sietecientos ";
        } if (primerDigito.charAt(1) == '6') {
            total += " seiscientos ";
        } if (primerDigito.charAt(1) == '5') {
             total += " quinientos ";
        } if (primerDigito.charAt(1) == '4') {
            total += " cuatrocientos ";
        } if (primerDigito.charAt(1) == '3') {
            total += " trescientos ";
        } if (primerDigito.charAt(1) == '2') {
            total += " doscientos ";
        } if (primerDigito.charAt(1) == '1') {
            total += " ciento";
        }
        
        if (primerDigito.charAt(2) == '9') {
            total += " noventa ";
        } if (primerDigito.charAt(2) == '8') {
            total += " ochenta ";
        } if (primerDigito.charAt(2) == '7') {
             total += " setenta ";
        } if (primerDigito.charAt(2) == '6') {
            total += " sesenta ";
        } if (primerDigito.charAt(2) == '5') {
             total += " cincuenta ";
        } if (primerDigito.charAt(2) == '4') {
            total += " cuarenta ";
        } if (primerDigito.charAt(2) == '3') {
            total += " treinta ";
        } if (primerDigito.charAt(2) == '2') {
            total += " veinte ";
        } if (primerDigito.charAt(2) == '1') {
            total += " diez";
        }
        
        if (primerDigito.charAt(3) == '5') {
            total += " y cinco ";
        }
        
        

        return total;

    }
}
