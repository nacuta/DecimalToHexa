import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
   Scanner userInput = new Scanner(System.in);
    int decimal, remainder ;
    char []hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    String hexaValue = "" ;

    System.out.println("Enter decimal number:");
    decimal= userInput.nextInt();

    while(decimal > 0){
      remainder = decimal % 16;
      hexaValue = hexa[remainder]+hexaValue;
      decimal = decimal / 16;
    }
    System.out.println("Hexa Value is :"+ hexaValue);

  }
}
