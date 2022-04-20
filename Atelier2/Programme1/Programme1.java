import java.util.Scanner;

class Programme1 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        char choix = 'O';

        do {

            System.out.println("Nous allons faire la somme de deux nombres !");
            System.out.println("Entrez une premiere valeur !");
            int value1 = scanner.nextInt();

            System.out.println("Entrez une seconde valeur !");
            int value2 = scanner.nextInt();

            int resultat = value2 + value1;

            System.out.println("La somme de ces deux valeur est : " + resultat);
            System.out.println("Voulez vous continuer ? Oui ou Non");
            choix = scanner.next().charAt(0);
        
        }while(choix == 'O');
        System.out.println("Au revoir");

    }
}
