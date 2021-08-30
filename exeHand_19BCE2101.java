package lab;
import java.util.*;
public class exeHand_19BCE2101 {
     public static void main(String[] args) 
    {
        int i;
        while(true){
        System.out.println("Enter 1/2/3 ");
        Scanner rv=new Scanner(System.in);
        i=rv.nextInt();
        if(i==1){
          try 
            {
            int a = 10/0;
            } catch (Exception e)
            {
            System.out.println(e);
            }  
        }
        if(i==2){
            try
            {
                String a=null;
                System.out.println(a.length());
            } catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(i==3){
            try{
                int ar[] = {1, 2};
                for (int j=0; j<=ar.length; j++){
                System.out.println(ar[i]);
                }
            } catch(Exception e)
            {
                System.out.println(e);
            }
        }
        }
        
}
}
