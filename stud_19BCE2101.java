package lab;
import java.util.*;
/**
 *
 * @author Gurtavrein Singh
 */
public class stud_19BCE2101 {
public static void main(String[] args){
String name,regno;
Scanner obj = new Scanner(System.in);
courses c[]=new courses[4];
for (int i=0;i<4;i++)
{
c[i]=new courses();
}
for (int i=0;i<4;i++)
{
c[i].get();
}
for (int i=0;i<4;i++)
{
c[i].print();
}
System.out.println("All of the above courses are present");
student s1=new student();
System.out.println("Enter 1st Subject:");
c[0].get();
System.out.println("Enter 2nd Subject:");
c[1].get();
while(true)
{
if (c[0].slot.equals(c[1].slot))
{
System.out.println("Slots Clashed enter 2nd Subject once again:");
c[1].get();
}
else
{
break;
}
}
s1.print(s1);
c[0].print();
c[1].print();
Scanner o = new Scanner(System.in);
System.out.println("Enter Name:");
name=o.nextLine();
System.out.println("Enter Regno:");
regno=o.nextLine();
student s2=new student(name,regno);
System.out.println("Enter 1st Subject:");
c[0].get();
System.out.println("Enter 2nd Subject:");
c[1].get();
while(true)
{
if (c[0].slot.equals(c[1].slot))
{
System.out.println("Slots Clashed enter 2nd Subject once again:");
c[1].get();
}
else
{
break;
}
}
s2.print(s2);
c[0].print();
c[1].print();
}
}
class student{
Scanner o = new Scanner(System.in);
String regno,name;
static String university="VIT";
static int c=0;
student()
{
System.out.println("Enter Name:");
name=o.nextLine();
System.out.println("Enter Regno:");
regno=o.nextLine();
}
student(String name,String regno)
{
this.name=name;
this.regno=regno;
}
void print(student s)
{
System.out.println("Student Name: "+ name);
System.out.println("Student Name: "+ regno);
System.out.println("Student Name: "+ s.university);
}
}
class courses{
String corcode,corname,venue,slot;
Scanner o = new Scanner(System.in);
void get()
{
System.out.println("Enter the Course Name:");
corname=o.nextLine();
System.out.println("Enter the Course Code:");
corcode=o.nextLine();
System.out.println("Enter the Venue:");
venue=o.nextLine();
System.out.println("Enter the Slot:");
slot=o.nextLine();
}
void print()
{
System.out.print("Course Name: "+corname);
System.out.println();
System.out.print("Course Code: "+corcode);
System.out.println();
System.out.print("Slot: "+slot);
System.out.println();
System.out.print("Venue: "+venue);
System.out.println();
}
}
