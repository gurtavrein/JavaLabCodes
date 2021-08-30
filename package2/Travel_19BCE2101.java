package lab.package2;

import lab.package1.InternationalTravels_19BCE2101; 
import lab.package1.NationalTravels_19BCE2101;
import java.util.Scanner;
class nextPlace_19BCE2101{
String place;
String date_of_travel;
void getmethodnp(){
	 	 Scanner in= new Scanner(System.in);
	 	 System.out.println("Place to travel: ");
	 	 place= in.nextLine();
	 	 System.out.println("Date of travel is: ");
	 	 date_of_travel= in.next();
}
void printmethodnp()
{
	 	 System.out.println(" Next Trip Details ");
	 	 System.out.println("Place: " + place);
	 	 System.out.println("Date of travel " + date_of_travel);
	 	 System.out.println("-----------------------");
	 	 }
}
public class Travel_19BCE2101 {
public static void main(String args[]){
	 	 System.out.println(" INTERNATIONAL TRAVEL DETAILS ");
	 	 InternationalTravels_19BCE2101 o1= new InternationalTravels_19BCE2101();
                 InternationalTravels_19BCE2101 o2= new InternationalTravels_19BCE2101();
                 InternationalTravels_19BCE2101 o3= new InternationalTravels_19BCE2101();
	 	 o1.getmethod();
	 	 o2.getmethod();
                 o3.getmethod();
                 
                 o1.printmethod();
	 	 o2.printmethod();
	 	 o3.printmethod();
	 	 
	 	 System.out.println(" NATIONAL TRAVEL DETAILS ");
	 	 NationalTravels_19BCE2101 o4= new NationalTravels_19BCE2101();
                 NationalTravels_19BCE2101 o5= new NationalTravels_19BCE2101();
                 NationalTravels_19BCE2101 o6= new NationalTravels_19BCE2101();
	 	 
                 o4.getmethod();
                 o5.getmethod();
                 o6.getmethod();
                 
	 	 o4.printmethod();
	 	 o5.printmethod(); 
	 	 o6.printmethod();
		

	 	 nextPlace_19BCE2101 o7= new nextPlace_19BCE2101();
	 	 o7.getmethodnp();
	 	 o7.printmethodnp();
	 	 }
}
