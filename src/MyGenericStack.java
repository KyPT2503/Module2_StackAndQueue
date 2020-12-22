import java.util.Collection;
import java.util.LinkedList;

public class MyGenericStack<E> {
    private LinkedList<E> stack;

    public MyGenericStack() {
        stack = new LinkedList<E>();
    }

    public MyGenericStack(E[] stack) {
        for (int i = 0; i < stack.length; i++) {
            this.stack.addFirst(stack[i]);
        }
    }

    public void push(E e) {
        this.stack.addFirst(e);
    }

    public E pop() {
        return stack.pop();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
