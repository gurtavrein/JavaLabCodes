package lab;
import java.util.Random;
class cars extends Thread {
    int count,count1;
    cars(){
        count=6;
    }
    synchronized void city_to_outer(int c){
        if(count<c){
            System.out.println("Car can pass from city to outer");
        }
        else{
            System.out.println("Wait for more cars from city");
            try{
                Thread.sleep(5);
                wait();
                count =15;
            }
            catch (Exception e){
                System.out.println("There is an exception:"+e);
            }
        }
    }
    synchronized void outer_to_city(int c2){
        if(count<c2){
            System.out.println("Car can pass from outer to city");
        }
        else{
            System.out.println("wait");
            try{
                System.out.println("waiting for cars from outer!");
                wait();
                count1=11;
                }
            catch (Exception e){
                System.out.println("There is an exception: "+e);
            }
        }
    }

}
public class city_19BCE2101 {
    public static void main(String args[]){
        cars c1=new cars();
        Random rand = new Random(); 
        int upperbound = 15;
        int c= rand.nextInt(upperbound);
        new Thread(() -> {
            c1.city_to_outer(c);
            if(c>=10) {
                System.out.println("All cars can pass to outer");
            }
            else{
                    System.out.println("Wait for more cars!!!");
            }
        }).start();

    }
}
