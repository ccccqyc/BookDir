package two;

import java.util.Arrays;

/**
 * Created by q on 17-11-22.
 */
public class LoopQueue<E> {
    Object[] data = null;
    int front;
    int rear;
    int maxsize;
    int lenght;
    E valueTemp;

    public LoopQueue(int capacity) {
        if (capacity > 0) {
            this.maxsize = capacity;
            data = new Object[capacity];
            front = 0;
            rear = 0;
        } else {
            throw new RuntimeException("初始化不小于0");
        }
    }

    public boolean isEmpty() {
        return lenght == 0;
    }

    public void add(E e) {
        if (lenght == maxsize) {
            throw new RuntimeException("队满");
        } else {
            data[rear] = e;
            rear = (rear + 1) % maxsize;
            lenght++;
        }
    }

    /**
     * 返回队首元素而不删除
     *
     * @return
     */
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("the queue has null element");
        } else {
            return (E) data[front];
        }
    }

    /**
     * poll
     */
    public E poll() {
        if (isEmpty()) {
            throw new RuntimeException("the queue has null element");
        } else {
            valueTemp = (E) data[front];
            front = (front + 1) % maxsize;
            lenght--;
            return (E) valueTemp;
        }
    }

    public int size() {
        return lenght;
    }

    public void clear() {
        Arrays.fill(data, null);
        front = 0;
        rear = 0;
        lenght = 0;

    }
}
