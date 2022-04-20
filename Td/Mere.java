import java.util.Scanner;

public class Mere extends Personne {
    public boolean indo;

    public Mere() {
    }

    public void saisir(){

        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Entez les informations de Maman++");
        System.out.println("+++++++++++++++++++++++++++++++");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Etez-vous indo ?");
        this.indo = scanner.nextBoolean();
    }

    public void getIndo(){
        System.out.println(this.indo);
    }    
}
