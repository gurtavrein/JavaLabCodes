package lab;
import java.util.*;
/**
 *
 * @author Gurtavrein Singh
 */
public class Vacation_19BCE2101{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Vacation[] vacation = new Vacation[2];
for (int i = 0; i < vacation.length; i++) {
vacation[i] = new SummerVacation();
vacation[i].getMethod(scanner);
vacation[i].printMethod();
System.out.println("Total Cost: " + SummerVacation.totalCost());
}
}
}

interface Vacation {
String place = "Amritsar";
String date = "4/6/21";
String[] activities = {"Bagh", "Wagha", "Monument"};
double[] costOfActivities = {1500, 500, 2500};
void getMethod(Scanner scanner);
void printMethod();
}
class SummerVacation implements Vacation {
String courseTitle;
String onlinePlatform;
double duration;
public void getMethod(Scanner scanner) {
System.out.println("Enter Course, Platform and Duration");
courseTitle = scanner.nextLine();
onlinePlatform = scanner.nextLine();
duration = scanner.nextDouble(); scanner.nextLine();
}
public void printMethod() {
System.out.println("Course Title: " + courseTitle);
System.out.println("Online Platform: " + onlinePlatform);
System.out.println("Duration: " + duration);
}
public static double totalCost() {
double totalCost = 0;
for (double d : costOfActivities) {
totalCost += d;
}
return totalCost;
}
}
