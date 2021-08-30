package lab;
import java.util.*;
import java.io.BufferedReader;    
import java.io.FileReader;    

public class wordCount_19BCE2101 {
    public static void main(String[] args) throws Exception {    
    Scanner scan = new Scanner(System.in);
     FileReader file = new FileReader("succhw.txt ");    
     BufferedReader br = new BufferedReader(file); 

    int scount = 0;
    int hcount =0;
        String line;
        while ((line = br.readLine()) != null) {
            for (String element : line.split(" ")) {
                if (element.equalsIgnoreCase("success")) {
                    scount++; 
                }
                if (element.equalsIgnoreCase("hardwork")) {
                    hcount++;  
                }
            }
        }
    
    System.out.println("Success appears " + scount + " times.");
    System.out.println("Hardwork appears " + hcount + " times.");
    }

}

