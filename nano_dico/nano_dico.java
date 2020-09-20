/**
 * nano_dico
 */
import java.util.Scanner;
import java.util.Arrays;
public class nano_dico {
    public static void main(String[] args) {

        Scanner scListeSaisie = new Scanner(System.in) ;
        System.out.println("Ecrivez la liste de mot à trié");
        String text = scListeSaisie.nextLine();
        
        String[] userListe = text.split(" "); 
        Arrays.sort(userListe);
        System.out.println(Arrays.toString(userListe)); 

        scListeSaisie.close();
  



    
}

    
}