import java.util.Scanner;

public class Calcul
{
    public static void main(String[] args)
    {
        char operateur = ' ';
        char choix = ' ';

        do{
            Calcul calcul = new Calcul();

            System.out.println("Entrez un operateur valide Ex: add, sous, div, multi ?");
            Scanner scanner = new Scanner(System.in);
            operateur = scanner.next().charAt(0);

            System.out.println("Entrez une premiere variable ?");
            int a = scanner.nextInt();

            System.out.println("Entrez une seconde variable ?");
            int b = scanner.nextInt();


            switch(operateur){

                case 'a': 
                    additionDeDeuxNombres add = calcul. new additionDeDeuxNombres();
                    add.addition(a, b);
                break;

                case 's': 
                    soustractionDeDeuxNombres sous = calcul. new soustractionDeDeuxNombres();
                    sous.soustraction(a, b);
                break;

                case 'd': 
                    divisionDeDeuxNombres divi = calcul. new divisionDeDeuxNombres();
                    divi.division(a, b);
                break;

                case 'm': 
                    produitDeDeuxNombres multi = calcul. new produitDeDeuxNombres();
                    multi.multiplication(a, b);
                break;
                
                default:
                    System.out.println("Operateur non prise en charge");
                break;
            }
            System.out.println("Voulez vous continuer oui/non ?");
            choix= scanner.next().charAt(0);


        }while(choix == 'o');
        System.out.println("Au revoir");

       
    }

    public class additionDeDeuxNombres
    {
        public void addition( int a,int b)
        {
            int resultat = a + b;
            System.out.println("le resultat de l'addition est : " + resultat);
        }
    }

    public class soustractionDeDeuxNombres
    {
        public void soustraction( int a,int b)
        {
            int resultat = a - b;
            System.out.println("le resultat de la soustraction est : " + resultat);
        }
    }

    public class divisionDeDeuxNombres
    {
        public void division( int a,int b)
        {
            float resultat = (float) a / b;
            System.out.println("le resultat de la division est : " + resultat);
        }
    }

    public class produitDeDeuxNombres
    {
        public void multiplication( int a,int b)
        {
            float resultat = (float) a * b;
            System.out.println("le resultat de la multiplication est : " + resultat);
        }
    }

}
