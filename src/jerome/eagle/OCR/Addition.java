package jerome.eagle.OCR;

public class Addition {

    /*
      Perform a simple addition between two integers
     */

    /**
     * Ask for first integer
     */
    public void displayMessageForEntier1() {
        System.out.println("Entrez le premier entier :");
    }

    /**
     * Ask for second integer
     */
    public void displayMessageForEntier2() {
        System.out.println("Entrez le deuxième entier :");
    }

    /**
     * Do addition and display result
     * @param integer1 the first number
     * @param integer2 the second number
     */

    public void performAddition(int integer1, int integer2) {
        int addition = integer1 + integer2;
        System.out.println("Le résultat est " + addition);
    }

}
