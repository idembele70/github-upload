import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String operateur = "+ - / % *";
    String operateurSansEsp = "+-/%*";

    System.out.print("Veuillez Saisir votre operation : ");

    String operation = sc.nextLine();

    Scanner tryOperation = new Scanner(operation);

    // recuperation des valeurs saisies et stockage
    int nb1 = 0;
    int nb2 = 0;
    String strOperateur;
    String OperateurN2;
    if (tryOperation.hasNextInt() == true) {
      nb1 = tryOperation.nextInt();
    //  String firstSpace = tryOperation.nextLine();
      if (tryOperation.hasNext() == true){
        OperateurN2 = tryOperation.next();
        if(tryOperation.hasNextInt() == true){
          nb2 = tryOperation.nextInt();
          if(tryOperation.hasNext() == true){
            System.out.println("Ton operation "  + nb1 + " " + OperateurN2 + " " + nb2 + tryOperation.nextLine());
            System.out.println("Navré mais je ne peux que faire des opérations à 2 entiers");
          }
          else{
            if(OperateurN2.charAt(0) == operateurSansEsp.charAt(0) ){
              int Result = nb1 + nb2;
              System.out.println("Ton opération : " + nb1 + " + " + nb2);
                System.out.println("Résultat de ton opération : " + Result);      
            }
            else if(OperateurN2.charAt(0) == operateurSansEsp.charAt(1) ){
              int Result = nb1 - nb2;
              System.out.println("Ton opération : " + nb1 + " - " + nb2);
                System.out.println("Résultat de ton opération : " + Result);      
            }
            else if(OperateurN2.charAt(0) == operateurSansEsp.charAt(2) ){
              int Result = nb1 / nb2;
              System.out.println("Ton opération : " +nb1 + " / " + nb2);
                System.out.println("Résultat de ton opération : " + Result);      
            }
            else if(OperateurN2.charAt(0) == operateurSansEsp.charAt(3) ){
              int Result = nb1 % nb2;
              System.out.println("Ton opération : " + nb1 +" % "+ nb2);
                System.out.println("Résultat de ton opération : " + Result);      
            }
            else if(OperateurN2.charAt(0) == operateurSansEsp.charAt(4) ){
              int Result = nb1 * nb2;
              System.out.println("Ton opération : " + nb1 + " * " + nb2 );
                System.out.println("Résultat de ton opération : " + Result);      
            }
          }
        }
        else{
          System.out.println("utilisez les espaces s'il vous plait !");
        }
      }

          }
      
      
      else if(tryOperation.hasNextInt() == false){
        if(tryOperation.hasNext()== true){
          String strUser = tryOperation.next() ;
          if(tryOperation.hasNext() ==true) {
            strOperateur = tryOperation.next();  
            for(int i= 0; i <=operateur.length()-1 ; i++){
              if (tryOperation.hasNextInt() == true && strOperateur.charAt(0) == operateur.charAt(i)){
                System.out.println("Ton opération : "+ strUser + " " + strOperateur + " " + tryOperation.nextInt() );
                System.out.println("Ton opération n'est pas logique !");
              }
            }
          }
          else{
            System.out.println("Ton opération : " + strUser);
            System.out.println("Utilise les espaces sinon je ne peux pas faire le calcul !");
          }
        }
      }
    tryOperation.close();
    sc.close();
  }
  }

