import java.util.Scanner;

class Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choix = ' ';

        int[] tabs = new int[4];
        int valeur = 0;

        do {

            for (int i = 0; i < 4; i++) {

                System.out.println("Entrez la valeur: " + (i+1));
                valeur = scanner.nextInt();

                while(valeur <= 0){
                    System.out.println("Entrez une valeur dufferent de zero");
                    valeur = scanner.nextInt();
                }
                tabs[i] = valeur;
            }

            int resultat = scanner.nextInt();

            for (int index = 0; index < tabs.length; index++) {

                resultat = resultat + tabs[index];
            }
            System.out.println("Le resultat est : " + (resultat/5));

            System.out.println("Voulez vous continuer ? oui ou non");
            choix = scanner.next().charAt(0);
        }while(choix == 'o');
        System.out.println("Au revoir");
    }
}
