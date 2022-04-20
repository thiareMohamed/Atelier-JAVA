import java.util.Scanner;

public class Pere extends Personne{
    public int salaire;
    public int nbrEnfant;
    public int nbrFemme;
    public String contractTravail;
    

    public Pere() {
    }
    
    public void saisir(){

        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Entez les informations de Papa++");
        System.out.println("+++++++++++++++++++++++++++++++");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le salaire ?");
        this.salaire = scanner.nextInt();

        System.out.println("Entrez le nombre d'enfant ?");
        this.nbrEnfant = scanner.nextInt();

        System.out.println("Entrez le nombre de femme ?");
        this.nbrFemme = scanner.nextInt();
        this.travailler();
    }

    public void travailler(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre type de contrat ?");
        this.contractTravail = scanner.next();
    }
}
