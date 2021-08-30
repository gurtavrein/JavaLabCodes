package lab.Roti_19BCE2101;
import lab.Roti_19BCE2101.stack_19BCE2101;
public class prod_19BCE2101 implements Runnable {
private final stack_19BCE2101<Integer> mySizedStack;
public prod_19BCE2101(stack_19BCE2101<Integer> mySizedStack) {
this.mySizedStack = mySizedStack;
}
@Override
public void run() {
try {
for(int i = 1 ; i < 11 ; i++) {
insertAnElement(i);
}
} catch (InterruptedException ex) {
}
}
public void insertAnElement(int number) throws InterruptedException {
while(mySizedStack.size() == 5) {
synchronized (mySizedStack) {
System.out.println("Stack is full. Producer is waiting...");
mySizedStack.wait();
}
}
synchronized (mySizedStack) {
mySizedStack.push(number);
mySizedStack.notifyAll();
System.out.println("Producer thread inserted number: " + number + " to queue.");
}
}
}
