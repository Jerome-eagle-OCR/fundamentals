package jerome.eagle.OCR;

public class Addition {

    /**
     * Perform a simple addition
     * @param entier1 the first number
     * @param entier2 the second number
     */

    public void displayMessageForEntier1() {
        System.out.println("Entrez le premier entier :");
    }

    public void displayMessageForEntier2() {
        System.out.println("Entrez le deuxième entier :");
    }

    public int performAddition(int entier1, int entier2) {
        int addition = entier1 + entier2;
        System.out.println("Le résultat est " + addition);
    }

}
