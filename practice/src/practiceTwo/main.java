package practiceTwo;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        firstPoint first = new firstPoint();
        secondPoint second = new secondPoint();
        thirdPoint third = new thirdPoint();
        fourthPoint fourth = new fourthPoint();
        fifthPoint fifth = new fifthPoint();
        sixthPoint sixth = new sixthPoint();
        seventhPoint seventh = new seventhPoint();
        eightPoint eight = new eightPoint();
        int opt = 0;
        do {
            System.out.println("1. Reportar mes\n"
                    + "2. Calcular número\n"
                    + "3. Calcular letra\n"
                    + "4. Calcular cantidad de días del mes\n"
                    + "5. Calcular número romano\n"
                    + "6. Calcular día anterior\n"
                    + "7. Mostrar día\n"
                    + "8. Reportar día actual");
            opt = Integer.parseInt(teclado.nextLine());

            switch (opt) {
                case 1:
                    String month = "";
                    do {
                        System.out.println("Digite un número");
                        opt = Integer.parseInt(teclado.nextLine());
                        first.setMonth(opt);
                        month = first.showMonth();

                    } while (opt > 12);
                    System.out.println(month);
                    break;

                case 2:
                    double squareRoot = 0;
                    double times = 0;
                    System.out.println("Digite un número");
                    opt = Integer.parseInt(teclado.nextLine());
                    second.setNum(opt);
                    double lastNum = second.lastNum();
                    if (lastNum == 2 || lastNum == 5 || lastNum == 8) {
                        squareRoot = second.squareRoot();
                        System.out.println(squareRoot);
                        break;
                    }
                    if (lastNum == 4 || lastNum == 7 || lastNum == 9) {
                        times = second.multiply();
                        System.out.println(times);
                        break;
                    }
                    System.out.println(second.getNum());
                    break;

                case 3:
                    char letter = ' ';
                    do {
                        System.out.println("Digite una letra");
                        letter = teclado.nextLine().charAt(0);
                        third.setLetter(letter);
                    } while (third.getLetter() != 'a' && third.getLetter() != 'b' && third.getLetter() != 'c' && third.getLetter() != 'd' && third.getLetter() != 'e');
                    switch (letter) {
                        case 'a':
                            System.out.println("Excelente");
                            break;
                        case 'b':
                            System.out.println("Bueno");
                            break;
                        case 'c':
                            System.out.println("Regular");
                            break;
                        case 'd':
                            System.out.println("Malo");
                            break;
                        case 'e':
                            System.out.println("Pesimo");
                            break;
                    }
                    break;
                case 4:
                    int mes = 0;
                    do {
                        System.out.println("Digite el mes actual");
                        mes = Integer.parseInt(teclado.nextLine());
                        fourth.setMonth(opt);
                    } while (opt > 12);

                    do {
                        System.out.println("Digite el año actual");
                        opt = Integer.parseInt(teclado.nextLine());
                        fourth.setYear(opt);
                    } while (opt < 0);

                    switch (mes) {
                        case 1:
                            System.out.println("Enero tiene 31 días");
                            break;
                        case 2:
                            System.out.println("Febrero tiene 28 días");
                            break;
                        case 3:
                            System.out.println("Marzo tiene 31 días");
                            break;
                        case 4:
                            System.out.println("Abril tiene 31 días");
                            break;
                        case 5:
                            System.out.println("Mayo tiene 31 días");
                            break;

                        case 6:
                            System.out.println("Junio tiene 30 días");
                            break;

                        case 7:
                            System.out.println("Julio tiene 31 días");
                            break;

                        case 8:
                            System.out.println("Agosto tiene 31 días");
                            break;
                        case 9:
                            System.out.println("Setiembre tiene 30 días");
                            break;
                        case 10:
                            System.out.println("Octubre tiene 31 días");
                            break;
                        case 11:
                            System.out.println("Noviembre tiene 30 días");
                            break;
                        case 12:
                            System.out.println("Diciembre tiene 31 días");
                            break;
                    }
                    break;
                case 5:
                    System.out.println(fifth.randomNum);
                    System.out.println("El número equivalente en romano es:\n"
                            + fifth.romanNumber());
                    break;
                case 6:
                    String fechaAnterior = "";
                    do {
                        System.out.println("Digite el día actual");
                        opt = Integer.parseInt(teclado.nextLine());
                        sixth.setDay(opt);
                    } while (opt < 0 || opt > 31);

                    do {
                        System.out.println("Digite el mes actual");
                        opt = Integer.parseInt(teclado.nextLine());
                        sixth.setMonth(opt);
                    } while (opt > 12 || opt < 1);

                    do {
                        System.out.println("Digite el año actual");
                        opt = Integer.parseInt(teclado.nextLine());
                        sixth.setYear(opt);
                    } while (opt < 0);
                    fechaAnterior = sixth.fechaAnterior();
                    System.out.println(fechaAnterior);
                    break;

                case 7:

                    do {
                        System.out.println("Digite el día");
                        opt = Integer.parseInt(teclado.nextLine());
                        seventh.setDay(opt);
                    } while (opt < 0 || opt > 31);

                    System.out.println("El día " + seventh.getDay()
                            + " corresponde al " + seventh.printDay());
                    break;

                case 8:
                    do {
                        System.out.println("Digite el día inicial\n"
                                + "1. Lunes\n"
                                + "2. Martes\n"
                                + "3. Miercoles\n"
                                + "4. Jueves\n"
                                + "5. Viernes\n"
                                + "6. Sabado\n"
                                + "7. Domingo\n");
                        opt = Integer.parseInt(teclado.nextLine());
                        eight.setIniDay(opt);
                    } while (opt < 0 || opt > 7);

                    System.out.println("El día " + seventh.getDay()
                            + " corresponde al " + seventh.printDay());
                    break;

            }
        } while (opt != 9);
    }
}
