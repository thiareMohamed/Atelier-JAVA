import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Personne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String matricule;
        String nom;
        String prenom;
        String adresse;
        String dateNaissance;
        String lieuNaissance;
        int telephone;

        System.out.println("Entrez un matricule ?");
        matricule = scanner.nextLine();
        
        System.out.println("Entrez un nom ?");
        nom = scanner.nextLine();

        System.out.println("Entrez un prenom ?");
        prenom = scanner.nextLine();

        System.out.println("Entrez une adresse ?");
        adresse = scanner.nextLine();

        System.out.println("Entrez une date de naissance ?");
        dateNaissance = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateNaissance, DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println("Entrez un lieuNaissance ?");
        lieuNaissance = scanner.nextLine();

        System.out.println("Entrez un telephone ?");
        telephone = scanner.nextInt();

        System.out.println("Matricule : " + matricule);
        System.out.println("Numero de telephone : " + telephone);

        System.out.println("Matricule        Prenom        nom        adresse        Date de naissance        Lieu de naissance        Telephone");

        System.out.println(matricule + "        " + prenom + "        " + nom + "        " + adresse + "        " + dateNaissance + "        " + lieuNaissance +"        " + telephone);
    }
    

}

