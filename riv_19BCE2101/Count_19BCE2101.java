package lab.riv_19BCE2101;
import java.util.Vector;
public class Count_19BCE2101 extends Thread {
Vector vec;
int k, i;
public int count = 0;
public Count_19BCE2101(int k, Vector vec){
this.k = k;
this.vec = vec;
}
@Override
public void run(){
for(i = 0; i < vec.capacity(); i++){
if(vec.elementAt(i).equals(k))
count++;
}
}
}