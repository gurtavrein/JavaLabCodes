import java.util.Scanner;
public class BMI_19BCE2101 {
    public static void main(String arg[]){
    float m,h,BMI;
    Scanner ob_scan=new Scanner(System.in);
    System.out.println("Enter mass(kg): ");
    m=ob_scan.nextFloat();
    System.out.println("Enter height(m): ");
    h=ob_scan.nextFloat();
    BMI = m/(h*h);
    System.out.println("BMI(kg/m^2) "+BMI);
    }
}
