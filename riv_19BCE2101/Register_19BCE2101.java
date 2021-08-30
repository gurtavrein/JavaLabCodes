package lab.riv_19BCE2101;
import java.util.Random;
import java.util.*;
public class Register_19BCE2101 extends Thread {
Random r = new Random();
int max = 600;
int min = 200;
int v, s;
Vector vec;
public Register_19BCE2101(int v, Vector vec)
{
this.v = v;
this.vec = vec;
}
@Override
public void run() {
try{
while(vec.size() < 1000) {
System.out.println(this.getName() + " is registering.");
vec.add(v);
s = r.nextInt((max - min) + 1) + min;
System.out.println(this.getName() + " is sleeping for " + s);
Thread.sleep(s);
}
}
catch(InterruptedException e)
{
System.out.println("Not registered due to " + e);
}
}
}