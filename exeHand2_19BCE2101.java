package lab;
import java.util.*;
class InvalidException extends Exception
{
    public InvalidException(String s)
    {
        super(s);
    }
}
public class exeHand2_19BCE2101 {

        void noCheck(int no) throws InvalidException{
            if(no<0){
		throw new InvalidException("Number is Invalid -cannot be negative.");
            }
            if((no<25)&&(no>0)){
		throw new InvalidException("Number is Invalid -cannot be between 0,25.");
            }
        }
    
public static void main(String args[]){
	int a;
        while(true){
        System.out.println("Enter number: ");
        Scanner rv=new Scanner(System.in);
        a=rv.nextInt();
        exeHand2_19BCE2101 obj = new exeHand2_19BCE2101();
        try
        {
            obj.noCheck(a);
        }
        catch (InvalidException e)
        {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
        }

   }
}
