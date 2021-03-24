package jerome.eagle.OCR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       int integer1 = 0;
       int integer2 = 0;
       boolean condition;

        Addition addition = new Addition();

        do {
            try {
                addition.displayMessageForEntier1();
                Scanner sc1 = new Scanner(System.in);
                integer1 = sc1.nextInt();
                condition = false;
            } catch (Exception InputMismatchException) {
                System.out.println("Vous devez entrer un entier");
                condition = true;
            }
        } while (condition);

        do {
            try {
                addition.displayMessageForEntier2();
                Scanner sc2 = new Scanner(System.in);
                integer2 = sc2.nextInt();
                condition = false;
            } catch (Exception InputMismatchException) {
                System.out.println("Vous devez entrer un entier");
                condition = true;
            }
        } while (condition);

        addition.performAddition(integer1, integer2);
    }
}
