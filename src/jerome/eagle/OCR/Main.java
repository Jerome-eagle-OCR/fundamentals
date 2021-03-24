package jerome.eagle.OCR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int integer1 = 0;
        int integer2 = 0;
        boolean condition;

        Choice choice = new Choice();
        choice.displayPossibleOperations();
        Scanner sc = new Scanner(System.in);
        int operationChosen = sc.nextInt();

        if (operationChosen == 1) {
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
        if (operationChosen == 2) {
            Substraction substraction = new Substraction();

            do {
                try {
                    substraction.displayMessageForEntier1();
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
                    substraction.displayMessageForEntier2();
                    Scanner sc2 = new Scanner(System.in);
                    integer2 = sc2.nextInt();
                    condition = false;
                } catch (Exception InputMismatchException) {
                    System.out.println("Vous devez entrer un entier");
                    condition = true;
                }
            } while (condition);

            substraction.performSubstraction(integer1, integer2);
        } else {
            System.out.println("Mauvais choix, relancez l'application");}
    }
}
