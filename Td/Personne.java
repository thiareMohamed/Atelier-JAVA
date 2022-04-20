import java.util.Scanner;

public class Personne implements IPersonne{
    public String nom;
    public String prenom;
    public int age;
    
    public Personne() {
    }

    public void ajouter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nom ?");
        this.nom = scanner.next();

        System.out.println("Entrez votre prenom ?");
        this.prenom = scanner.next();

        System.out.println("Entrez votre age ?");
        this.age = scanner.nextInt();
    }

    public void afficher(){
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("Age : " + this.age);
    }

    public void travailler(){}
    public void manger(){}

}