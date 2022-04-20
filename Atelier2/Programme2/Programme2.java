import java.util.Scanner;

class Programme2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nous allons faire le produit de deux nombres !");
        System.out.println("Entrez une premiere valeur !");
        int value1 = scanner.nextInt();

        System.out.println("Entrez une seconde valeur !");
        int value2 = scanner.nextInt();

        int resultat = value2 * value1;

        System.out.println("Le produit de ces deux valeur est : " + resultat);
    }
}
