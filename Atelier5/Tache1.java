import java.util.Scanner;
public class Tache1 {
    public static void main(String[] args){
        Tache1 tache = new Tache1();
        Personne thiare = tache. new Personne();
        thiare.saisirInformation();
        thiare.affichepersonne();
    }
    public class Personne implements Ipersonne{
        public String nom;
        public String prenom;
        public String adresse;
        public String date;
        public String lieu;
        public int tel;

        public Personne(){
            
        }
    
        public void affichepersonne(){
            System.out.println("Je suis " + this.prenom + " " + this.nom);
            System.out.println(" et j'habite a " + this.adresse + " mon numero de telephone est " + this.tel);
        }

        public void saisirInformation(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez votre nom ?");
            this.nom = scanner.next();
    
            System.out.println("Entrez votre prenom ?");
            this.prenom = scanner.next();
    
            System.out.println("Entrez votre adresse ?");
            this.adresse = scanner.next();
    
            System.out.println("Entrez votre date ?");
            this.date = scanner.next();
    
            System.out.println("Entrez votre lieu ?");
            this.lieu = scanner.next();
    
            System.out.println("Entrez votre telephone ?");
            this.tel = scanner.nextInt();
    
        }
    }
    
    interface Ipersonne{
        public void saisirInformation();
        public void affichepersonne();
    }
}
