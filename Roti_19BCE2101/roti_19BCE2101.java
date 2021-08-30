package lab.Roti_19BCE2101;
import lab.Roti_19BCE2101.stack_19BCE2101;
public class roti_19BCE2101 {
public static void main(String args[]) {
stack_19BCE2101<Integer> mySizedStack = new stack_19BCE2101<Integer>(10);
Thread threadProducer = new Thread(new prod_19BCE2101(mySizedStack));
Thread threadConsumer = new Thread(new cons_19BCE2101(mySizedStack));
threadProducer.start();
threadConsumer.start();
}
}
