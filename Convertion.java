import java.util.Scanner;
  
  public class Main {
      
	public static void main(String[] args) {
		 Scanner myChakra = new Scanner (System.in);
		 
		 System.out.print("Enter your Name:");
		 String name = myChakra.nextLine();
		 
		 System.out.print("Enter your amount of chakra:");
		 int amountofchakra = myChakra.nextInt();
		 System.out.print("Enter your amount of chakra2:");
		 int amountofchakra2 = myChakra.nextInt();
		 
		 int totalamountofchakra = amountofchakra + amountofchakra2;
		 
		 System.out.println("Hello " + name + "\n" + "amountofchakra:" + amountofchakra + "\n" + "amountofchakra2:"  + amountofchakra2 + "\n" + "Total amountofchakra:" +  totalamountofchakra); 
	}
}