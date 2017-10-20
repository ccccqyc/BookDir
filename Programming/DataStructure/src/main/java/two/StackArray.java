package two;

/**
 * 使用array 实现堆栈.
 * Created by q on 17-10-19.
 */
public class StackArray<T> {

    private T[] theItems;
    private int theSize;
    private int top;
    private int maxSize;

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        theItems = (T[]) new Object[maxSize];
        top = -1;
    }

    public int size() {
        return theSize;
    }

    public boolean push(Object o) {
        boolean b = false;
        if (!isFull()) {
            theItems[++top] = (T) o;
            theSize++;
        }
        return b;
    }


    public T pop() {
        if (isEmpty()) {
            throw new NullPointerException();
        }
        theSize--;
        return theItems[top--];
    }

    public boolean isFull() {
        boolean b = false;
        if (theSize == maxSize) {
            b = true;
        }
        return b;
    }

    public boolean isEmpty() {
        boolean b = false;
        if (theSize == 0) {
            b = true;
        }
        return b;
    }

}
