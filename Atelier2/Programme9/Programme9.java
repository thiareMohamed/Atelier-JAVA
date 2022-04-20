import java.util.Scanner;

class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un entier");
        int entier = scanner.nextInt();

        System.out.println("Entrez un reel");
        Double reel = scanner.nextDouble();

        System.out.println("Entrez une chaine de caractere");
        String chaine = scanner.next();

        System.out.println("Les valeur saisies sont : Caracteres = " + chaine + ", Entier = " + entier + " et Reel = " + reel);
    }
}
