package lab.Roti_19BCE2101;
import lab.Roti_19BCE2101.stack_19BCE2101;
public class cons_19BCE2101 implements Runnable {
private final stack_19BCE2101<Integer> mySizedStack;
public cons_19BCE2101(stack_19BCE2101<Integer> mySizedStack) {
this.mySizedStack = mySizedStack;
}
@Override
public void run() {
while(true) {
try {
int element = getAnElementFromQueue();
System.out.println("Consumer got the element: " + element);
} catch (InterruptedException ex) {
System.out.println("There is a problem with consumer. " + ex.getMessage());
}
}
}
public int getAnElementFromQueue() throws InterruptedException {
while(mySizedStack.isEmpty()) {
synchronized (mySizedStack) {
System.out.println("Stack is empty. Consumer is waiting...");
mySizedStack.wait();
}
}
synchronized (mySizedStack) {
mySizedStack.notifyAll();
return mySizedStack.pop();
}
}
}