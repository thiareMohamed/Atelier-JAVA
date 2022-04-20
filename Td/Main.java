public class Main {
    public static void main(String[] args) {
        Pere youssouf = new Pere();
        Mere maimouna = new Mere();

        System.out.println("Entrez les information du papa ?");
        youssouf.ajouter();
        youssouf.saisir();

        System.out.println("Entrez les information de la maman ?");
        maimouna.ajouter();
        maimouna.saisir();

        youssouf.afficher();
        maimouna.afficher();

        System.out.println("Entrez les information de l'enfant ?");
        Enfant thierno = new Enfant(maimouna, youssouf);
        thierno.ajouter();
        thierno.saisir();
        thierno.afficher();
        thierno.getEnfant();
    }
}
