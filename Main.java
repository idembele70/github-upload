import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      String operateur = "+ - / % *";
      String operateurSansEsp = "+-/%*";
      String userReponse = ""; 
      
      int nb1 = 0;
      int nb2 = 0;
      String strOperateur;
      String OperateurN2;
      final String QUESTION = "\n Veux-tu effectuer une nouvelle opération ? [On] ";
      final String END_MESSAGE = "La calculatrice à bien été fermée !";

    while (!userReponse.equals("n")) {

      final String APP_TITLE = "\n" + "------------\n" + "CALCULATRICE" + "\n------------";
      try{
      System.out.println(APP_TITLE);
      System.out.print("Veuillez Saisir votre operation : ");
      String operation = sc.nextLine();

      Scanner tryOperation = new Scanner(operation);

      // MAIN CODE

      if (tryOperation.hasNextInt() == true) {
        nb1 = tryOperation.nextInt();
        // String firstSpace = tryOperation.nextLine();
        if (tryOperation.hasNext() == true) {
          OperateurN2 = tryOperation.next();
          if (tryOperation.hasNextInt() == true) {
            nb2 = tryOperation.nextInt();
            if (tryOperation.hasNext() == true) {
              System.out.println("Ton operation " + nb1 + " " + OperateurN2 + " " + nb2 + tryOperation.nextLine());
              System.out.println("Navré mais je ne peux que faire des opérations à 2 entiers");
            } else {
              if (OperateurN2.charAt(0) == operateurSansEsp.charAt(0)) {
                int Result = nb1 + nb2;
                System.out.println("Ton opération : " + nb1 + " + " + nb2);
                System.out.println("Résultat de ton opération : " + Result);
              } else if (OperateurN2.charAt(0) == operateurSansEsp.charAt(1)) {
                int Result = nb1 - nb2;
                System.out.println("Ton opération : " + nb1 + " - " + nb2);
                System.out.println("Résultat de ton opération : " + Result);
              } else if (OperateurN2.charAt(0) == operateurSansEsp.charAt(2)) {
                int Result = nb1 / nb2;
                System.out.println("Ton opération : " + nb1 + " / " + nb2);
                System.out.println("Résultat de ton opération : " + Result);
              } else if (OperateurN2.charAt(0) == operateurSansEsp.charAt(3)) {
                int Result = nb1 % nb2;
                System.out.println("Ton opération : " + nb1 + " % " + nb2);
                System.out.println("Résultat de ton opération : " + Result);
              } else if (OperateurN2.charAt(0) == operateurSansEsp.charAt(4)) {
                int Result = nb1 * nb2;
                System.out.println("Ton opération : " + nb1 + " * " + nb2);
                System.out.println("Résultat de ton opération : " + Result);
              }
            }
          } else {
            System.out.println("utilisez les espaces s'il vous plait !");
          }
        }

      }

      else if (tryOperation.hasNextInt() == false) {
        if (tryOperation.hasNext() == true) {
          String strUser = tryOperation.next();
          if (tryOperation.hasNext() == true) {
            strOperateur = tryOperation.next();
            for (int i = 0; i <= operateur.length() - 1; i++) {
              if (tryOperation.hasNextInt() == true && strOperateur.charAt(0) == operateur.charAt(i)) {
                System.out.println("Ton opération : " + strUser + " " + strOperateur + " " + tryOperation.nextInt());
                System.out.println("Ton opération n'est pas logique !");
              }
            }
          } else {
            System.out.println("Ton opération : " + strUser);
            System.out.println("Utilise les espaces sinon je ne peux pas faire le calcul !");
          }
        }
      }
      System.out.println(QUESTION);
      userReponse = sc.nextLine();
     
    tryOperation.close();
}
catch(Exception exception){
  if(sc.hasNextLine()){
    sc.nextLine();
  }
}
     } 
      sc.close();
    
    System.out.println(END_MESSAGE);
    
  }
}