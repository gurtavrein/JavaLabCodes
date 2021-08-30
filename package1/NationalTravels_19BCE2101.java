package lab.package1;
import java.util.Scanner;
abstract class Traveln
{
abstract void getmethod();
abstract void printmethod();
}

public class NationalTravels_19BCE2101  extends Traveln
{
String Passengern;
String splacen;
String eplacen;
public void getmethod(){
	 	 Scanner in= new Scanner(System.in);
	 	 System.out.println("Enter the name: ");
	 	 Passengern= in.nextLine();
	 	 System.out.println("Enter the start place: ");
	 	 splacen= in.nextLine();
	 	 System.out.println("Enter the end place: ");
	 	 eplacen= in.next();
}
public void printmethod()
{
	 	 System.out.println("----TRAVEL DETAILS:----");
	 	 System.out.println("Name: " + Passengern);
	 	 System.out.println("Start place: " + splacen);
	 	 System.out.println("End place: " + eplacen);
	 	 System.out.println("/n-----------------------");
}
public static void main(String args[]){
	 	 NationalTravels_19BCE2101 o1= new NationalTravels_19BCE2101();
	 	 o1.getmethod();
	 	 o1.printmethod();
}
}