/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import java.util.*;
/**
 *
 * @author Gurtavrein Singh
 */
class Programs{
    String name,gender;
    int age;
    float height;
    
    void get(){
        Scanner rv=new Scanner(System.in);
        System.out.println("Enter name,gender,age,height");
        name=rv.next();
        gender=rv.next();
        age =rv.nextInt();
        height=rv.nextFloat();
    }
    
    void print(){
        System.out.println("Print dunction activated ");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
    }
}

class Student_Programs extends Programs{
    String regno,stream;
    void getS(){
        get();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter regno,stream: ");
        regno=s.next();
        stream=s.next();
    }
    void printS(){
        print();
        System.out.println("regno: "+regno);
        System.out.println("stream: "+stream);
    }
}

class Faculty_Programs extends Programs{
    String facid,dept;
    void getF(){
        get();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter facid,dept: ");
        facid=s.next();
        dept=s.next();
    }
    void printF(){
        print();
        System.out.println("faculty id: "+facid);
        System.out.println("department: "+dept);
    }
}
public class CAT2_19BCE2101 {
    public static void main(String arg[]){
        Student_Programs[] arrs=new Student_Programs[3];
        Faculty_Programs[] arrf=new Faculty_Programs[3];
        for(int i=0;i<3;i++){
            arrs[i]=new Student_Programs();
            arrf[i]=new Faculty_Programs();
        }
        for(int i=0;i<3;i++){
            arrs[i].getS();
        }
        for(int i=0;i<3;i++){
            arrs[i].printS();
        }
        for(int i=0;i<3;i++){
            arrf[i].getF();
        }
        for(int i=0;i<3;i++){
            arrf[i].printF();
        }
    }
}
