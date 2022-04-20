import java.util.Scanner;

class Programme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choix = ' ';

        do {
            String resultat = "1";
            
            System.out.println("Entrez une valeur");
            int valeur = scanner.nextInt();

            while(valeur <= 1){
                System.out.println("Entrez une valeur superieur a 1");
                valeur = scanner.nextInt();
            }

            for(int i = 2; i <= valeur; i++){
                resultat = resultat + ", " + i;
            }

            System.out.println(resultat);

            System.out.println("Voulez vous continuer ? oui ou non");
            choix = scanner.next().charAt(0);
        }while(choix == 'o');
        System.out.println("Au revoir");
    }
}
