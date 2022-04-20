import java.util.Scanner;

public class Enfant extends Personne{
    public Mere nomMere;
    public Pere nomPere;
    public String classe;
    public String ecole;

    
    public Enfant(Mere nomMere, Pere nomPere) {
        this.nomMere = nomMere;
        this.nomPere = nomPere;
    }

    public void saisir(){

        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Entez les informations de l'enfant++");
        System.out.println("++++++++++++++++++++++++++++++++++++");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de votre ecole ?");
        this.ecole = scanner.next();

        System.out.println("Entrez le nom de votre classe ?");
        this.classe = scanner.next();
    }
    
    public void getEnfant(){

        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("les informations de l'enfant sont |++");
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("Ton papa est : " + nomPere.prenom + " " + nomPere.nom);
        System.out.println("Ta maman est : " + nomMere.prenom + " " + nomMere.nom);
    }
}