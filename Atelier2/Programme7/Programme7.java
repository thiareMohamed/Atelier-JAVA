import java.util.Scanner;

class Programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choix = ' ';

        do {
            System.out.println("Entrez une valeur");
            int valeur = scanner.nextInt();

           if(valeur == 0){
                System.out.println("Null");
           }
           else if (valeur >= 0){
                System.out.println("Possitif");
            }else{
                System.out.println("Negatif");
            }
            

            System.out.println("Voulez vous continuer ? oui ou non");
            choix = scanner.next().charAt(0);
        }while(choix == 'o');
        System.out.println("Au revoir");
    }
}
