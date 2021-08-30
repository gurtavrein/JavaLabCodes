package lab;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class File_19BCE2101 {
     public static void main(String[] args) {
    try {
      File myObj = new File("succhw.txt");
      Scanner rv = new Scanner(myObj);
      while (rv.hasNextLine()) {
        String data = rv.nextLine();
        System.out.println(data);
      }
      rv.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
