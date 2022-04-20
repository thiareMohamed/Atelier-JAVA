import java.util.Scanner;

class TestValeur {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre une premiere valeur");
        int val1 = scanner.nextInt();
        System.out.println("Entre une seconde valeur");
        int val2 = scanner.nextInt();

        System.out.println("Resultat 1 est : " + (val1 + val2));


        System.out.println("Entre une premiere valeur");
        int val3 = scanner.nextInt();
        System.out.println("Entre une seconde valeur");
        int val4 = scanner.nextInt();

        System.out.println("Resultat 2 est : " + (val3 + val4));

        System.out.println("Le plus grand resultat est : " + ((val3 + val4) >= (val1 + val2) ? (val3 + val4) : (val1 + val2)));
        
    }    
}
