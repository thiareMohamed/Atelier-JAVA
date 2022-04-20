import java.util.Scanner;

class Programme4 {
    public static void main(String[] args){
         
        Scanner scanner = new Scanner(System.in);
        char choix = ' ';

        do {

            System.out.println("Nous allons faire le quotient de deux nombres !");
            System.out.println("Entrez une premiere valeur !");
            int value1 = scanner.nextInt();

            System.out.println("Entrez une seconde valeur !");
            int value2 = scanner.nextInt();

            int resultat = value1 / value2;

            System.out.println("Le quotient de ces deux valeur est : " + resultat);
            System.out.println("Voulez vous continuer ? oui ou non");
            choix = scanner.next().charAt(0);
        
        }while(choix == 'o');
        System.out.println("Au revoir");

    }
}
