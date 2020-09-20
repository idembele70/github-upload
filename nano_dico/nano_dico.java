
/**
 * nano_dico
 */
import java.util.Scanner;
import java.util.Arrays;

public class nano_dico {
    public static void main(String[] args) {
        final String APP_TITLE = "------------\n" + "NANO DICO" + "\n------------";
        final String QUESTION = "\nVoulez-vous recommencer ?";
        final String END_MESSAGE = "Au revoir ! :)";
        String userReponse = "";
        System.out.println(APP_TITLE);
        Scanner scListeSaisie = new Scanner(System.in);

        // MAIN Code
        while (!userReponse.equals("non")) {
            try {
                System.out.println("Ecrivez la liste de mot à trié");
                String text = scListeSaisie.nextLine();
                String[] userListe = text.split(" ");
                Arrays.sort(userListe);
                System.out.println(Arrays.toString(userListe));

                System.out.println(QUESTION);
                userReponse = scListeSaisie.nextLine();
            } catch (Exception exception) {
                if (scListeSaisie.hasNextLine()) {
                    scListeSaisie.nextLine();
                }
            }
        }
        System.out.println(END_MESSAGE);
        scListeSaisie.close();

    }

}