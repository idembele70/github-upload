
import java.util.Scanner;
class calc_retry {
  public static void main(String[] args) {
    // DECLARATIONS
    final String APP_TITLE =  "------------\n" +
                              "CALCULATRICE" +
                              "\n------------";
    final String QUESTION = "\nVoulez-vous recommencer ?";
    final String END_MESSAGE = "Au revoir ! :)";
                              
    Scanner sc = new Scanner(System.in);
    int nb1 = 0, nb2 = 0;
    String userResponse = "";
    
    // MAIN CODE 
    while (!userResponse.equals("non")) {
      System.out.println(APP_TITLE);
  
      try {
        System.out.print("1er nombre: ");
        nb1 = sc.nextInt();
        sc.nextLine();
        
        System.out.print("2ème nombre: ");
        nb2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Résultat de l'opération: " + (nb1 + nb2));
        
        System.out.println(QUESTION);
        userResponse = sc.nextLine();
      }
      catch (Exception exception) {
        if (sc.hasNextLine()) {
          sc.nextLine();
        }
      }
    }

    // FINAL CODE
    System.out.println(END_MESSAGE);
    sc.close();
  }
}