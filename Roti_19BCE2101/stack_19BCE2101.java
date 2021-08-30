package lab.Roti_19BCE2101;
import java.util.Stack;
public class stack_19BCE2101<T> extends Stack<T>{
private int maxSize;
public stack_19BCE2101(int size) {
super();
this.maxSize = size;
}
@Override
public Object push(Object object) {
while (this.size() >= maxSize) {
this.remove(0);
}
return super.push((T) object);
}
}