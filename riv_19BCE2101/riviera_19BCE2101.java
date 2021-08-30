package lab.riv_19BCE2101;
import lab.riv_19BCE2101.Register_19BCE2101;
import lab.riv_19BCE2101.Count_19BCE2101;
import java.util.Vector;

public class riviera_19BCE2101 {
public static void main(String[] args) {
Vector votevec = new Vector(1000);
Register_19BCE2101 e1 = new Register_19BCE2101(1, votevec);
e1.start();
Register_19BCE2101 e2 = new Register_19BCE2101(2, votevec);
e2.start();
Register_19BCE2101 e3 = new Register_19BCE2101(3, votevec);
e3.start();
Register_19BCE2101 e4 = new Register_19BCE2101(4, votevec);
e4.start();
Register_19BCE2101 e5 = new Register_19BCE2101(5, votevec);
e5.start();
try{
e1.join();
e2.join();
e3.join();
e4.join();
e5.join();
System.out.println("Registration has ended!");
}catch(Exception exc){System.out.println(exc);}
Count_19BCE2101 e1c = new Count_19BCE2101(1, votevec);
Count_19BCE2101 e2c = new Count_19BCE2101(2, votevec);
Count_19BCE2101 e3c = new Count_19BCE2101(3, votevec);
Count_19BCE2101 e4c = new Count_19BCE2101(4, votevec);
Count_19BCE2101 e5c = new Count_19BCE2101(5, votevec);
e1c.start();
e2c.start();
e3c.start();
e4c.start();
e5c.start();
try{
e1c.join();
e2c.join();
e3c.join();
e4c.join();
e5c.join();
System.out.println("Counting has ended!");
}catch(Exception exc){System.out.println(exc);}
int e1v = e1c.count;
int e2v = e2c.count;
int e3v = e3c.count;
int e4v = e4c.count;
int e5v = e5c.count;
System.out.println("Registration Vector:" + "\n" + votevec);
System.out.println(e1v + " registered for event e1");
System.out.println(e2v + " registered for event e2");
System.out.println(e3v + " registered for event e3");
System.out.println(e4v + " registered for event e4");
System.out.println(e5v + " registered for event e5");
}
}
