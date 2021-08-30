package lab;
import java.util.*;
/**
 *
 * @author Gurtavrein Singh
 */
public class intern_19BCE2101 {
public static void main(String[] args) {
Participants p[]=new Participants[3];
for (int i=0;i<3;i++)
{
p[i]=new Participants();
p[i].gets();
}
Participants.display(p);
}
}
class Participants{
String name,branch,university,trc;
String phno;
Scanner obj= new Scanner(System.in);
void gets()
{
System.out.println("Enter Name: ");
name=obj.nextLine();
System.out.println("Enter Branch: ");
branch=obj.nextLine();
System.out.println("Enter University: ");
university=obj.nextLine();
System.out.println("Enter Phone Number: ");
phno=obj.nextLine();
System.out.println("Enter TestResult Classification[L1,L2,L3,L4,L5]: ");
trc=obj.nextLine();
}
static void display(Participants p[])
{
int len=p.length;
for (int i=0;i<len;i++)
{
switch(p[i].trc)
{
case "L1":
System.out.println("Congrulation you has been selected for both Full time intership as well as Full time job");
break;
case("L2"):
System.out.println("Congrilation you has been selected for Full time intership and Job may be offered based on intership Performance.");
break;
case("L3"):
System.out.println("Congrilation you has been selected for Full time intership and Job may be offered based on intership Performance.");
break;
case("L4"):
System.out.println("Congrulation you has been selected for Intenship for 21 days");
break;
case("L5"):
System.out.println("Congrulation you has been selected for Intenship for 21 days");
break;
default:
System.out.println("You Entered something Wrong!!!");
}
}
}
}
