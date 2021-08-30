package lab.package1;
import java.util.Scanner;
abstract class Traveli
{
abstract void getmethod();
abstract void printmethod();
}
public class InternationalTravels_19BCE2101 extends Traveli {
String Passengeri;
String splacei;
String eplacei;
public void getmethod()
{
	 	 Scanner in= new Scanner(System.in);
	 	 System.out.println("Enter the name: ");
	 	 Passengeri= in.nextLine();
	 	 System.out.println("Enter start place: "); 
	 	 splacei= in.nextLine();
	 	 System.out.println("Enter the end place: ");
	 	 eplacei= in.next();
}
public void printmethod()
{
	 	 System.out.println("TRAVEL DETAILS:");
	 	 System.out.println("Name: " + Passengeri);
	 	 System.out.println("Start place: " + splacei);
	 	 System.out.println("End place: " + eplacei);
	 	 System.out.println("-----------------------");
}
public static void main(String args[]){
	 	 InternationalTravels_19BCE2101 o1= new InternationalTravels_19BCE2101();
	 	 o1.getmethod();
	 	 o1.printmethod();
}
}
