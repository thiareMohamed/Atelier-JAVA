import java.util.Scanner;

class ControleBoucleDoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valeur;
        do {
            System.out.println("Entrez une valeur possitif");
            valeur = scanner.nextInt();
        }while(valeur <= 0);
        System.out.println("La valeur saisie est possitif merci");
    }    
}

