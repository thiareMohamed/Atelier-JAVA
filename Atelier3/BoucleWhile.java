class BoucleWhile {
    public static void main(String[] args){
        String valeur = "";
        int i = 0; 

        while(i < 5){
            i++;
            valeur = valeur + " " + i;
        }
        System.out.println(valeur);
    }    
}
