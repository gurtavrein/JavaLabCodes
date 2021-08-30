import java.util.*;
class Students{
    String name;
    String regno;
    void getMethod(){
    Scanner rV=new Scanner(System.in);
    System.out.println("Enter the data members' value ");
    name=rV.next();
    regno=rV.next();
    }
    void printMethod(){
    System.out.println("values "+name+" "+regno);
    }
}
class Courses{
    int courseCode;
    String cName;
    String slot;
    String location;
    void getMethod(){
    Scanner rV=new Scanner(System.in);
    System.out.println("Enter the data members' value ");
    cName=rV.next();
    slot=rV.next();
    location=rV.next();
    }
    void printMethod(){
    System.out.println("values "+cName+" "+slot+" "+location);
    }
}
public class Student_19BCE2101 {
    public static void main(String args[]){
        Students s1=new Students();
        Students s2=new Students();
        Students s3=new Students();
        s1.getMethod();
        s2.getMethod();
        s3.getMethod();
        s1.printMethod();
        s2.printMethod();
        s3.printMethod();
        Courses c1=new Courses();
        Courses c2=new Courses();
        Courses c3=new Courses();
        c1.getMethod();
        c2.getMethod();
        c3.getMethod();
        c1.printMethod();
        c2.printMethod();
        c3.printMethod();
    }
}
