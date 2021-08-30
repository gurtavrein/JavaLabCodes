package lab;
import java.util.*;
import java.io.*;
/**
 *
 * @author Gurtavrein Singh
 */
public class travelThread_19BCE2101 {
public static void main(String[] args) throws Exception {
	 	 int n;
	 	 String Passenger;
	 	 String splace;
	 	 String eplace;
	 	 Scanner in = new Scanner(System.in);
	 	 System.out.println("Enter 0 for International OR 1 for National : ");
	 	 n = in.nextInt();
	 	 System.out.println("Enter Traveller's details :");
                 System.out.println("Enter the name :");
	 	 Passenger = in.next();
                 System.out.println("Enter start place");
	 	 splace = in.next();
                 System.out.println("Enter end place :");
	 	 eplace = in.next();
	 	 if( n == 0 )
	 	 {
                     new Thread(() ->
                     {
                    try
                        {
			System.out.println("Writing to file1");
                        FileWriter fw = new FileWriter("C:\\Users\\Gurtavrein Singh\\Desktop\\file1.txt");
	 	 	fw.write("***** International Travel *****\n");
                        fw.append(Passenger +" ");
                        fw.append(splace +" ");
                        fw.append(eplace +" ");
                        fw.close();
                        System.out.println("File1 written success");
                        System.out.println("-----------------------------------------");
	 	 	}
                    catch(Exception e)
                        {
            	 	 System.out.println(e);
	 	 	 }
                    }).start();
	 	 }
	 	 if ( n == 1 )
	 	 {
	 	 	 new Thread(() ->
	 	 	 {
	 	 	  try
	 	 	 	 {
	 	 		 System.out.println("Writing to file2");
                                 FileWriter fw = new FileWriter("C:\\Users\\Gurtavrein Singh\\Desktop\\file2.txt");
	 	  	 	 fw.write("***** National Travel *****\n");
                                 fw.append(Passenger +" ");
                                 fw.append(splace +" ");
                                 fw.append(eplace +" ");
                                 fw.close();
                                 System.out.println("File2 written success");
                                 System.out.println("--------------------------------");
	 	 	 	 }catch(Exception e)
                                 {
	 	 	 	 	 System.out.println(e);
	 	 	 	 }
                        }).start();
	 	 }
		
Thread t3 = new Thread(() ->
	 	 {
	 	  try
                    {
                    System.out.println("Reading from the filee-file1,fil2");
                    Scanner i = new Scanner(new FileReader("C:\\Users\\Gurtavrein Singh\\Desktop\\file1.txt"));
	 	 	 	 ArrayList<String> IT=new ArrayList<String>();
                                 while (i.hasNext()){
                                 IT.add(i.next());
                                 }
                    i.close();
                    Iterator itr = IT.iterator();
                    while(itr.hasNext())
                 	 System.out.println(itr.next());
                         Scanner nn = new Scanner(new FileReader("C:\\Users\\Gurtavrein Singh\\Desktop\\file2.txt"));
	 	 	 ArrayList<String> NT=new ArrayList<String>();
                            while (nn.hasNext()){
                             NT.add(nn.next());
                            }
                        nn.close();
                    Iterator itr1 = NT.iterator();
                        while(itr1.hasNext())
	 	 	 	 	 System.out.println(itr1.next()); 	 	 	 	 
                    }catch(Exception e)
	 	 	 {
	 	 	 	 System.out.println(e);
	 	 	 }
			

	 	 });
		try {
	 	 Thread.sleep(2000);
	 	 }catch(Exception e)
	 	 {
	 	 System.out.println(e);
	 	 }
	 	 t3.start();	 	 
}
}

