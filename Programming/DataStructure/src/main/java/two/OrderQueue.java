package two;

/**
 * Created by q on 17-11-22.
 */
public class OrderQueue<ElementTyepe> {
    /**
     * Number of elements in the queue
     */
    int maxSize;
    /**
     * items index for next put , offer , add
     */
    int rear;
    /**
     * items index for next remove ,delete ,poll
     */
    int front;
    /**
     * the queued items
     */
    Object[] items;

    public OrderQueue(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("the capacity should be 大于 0" + capacity);
        } else {
            this.maxSize = capacity;
            this.items = new Object[capacity];
            front = rear = 0;
        }
    }

    public boolean isFullQueue() {
        return rear == front;
    }


    public OrderQueue createQueue(int maxSize) {
        return new OrderQueue(maxSize);
    }

    public void addQ(ElementTyepe e) {
        if (rear == maxSize - 1) {
            throw new RuntimeException("queue was full");
        } else {
            items[rear++] = e;
        }
    }

    public ElementTyepe deleteQ() {
        if (isFullQueue()) {
            throw new RuntimeException("空队列");
        } else {
            return (ElementTyepe) items[front];
        }
    }


}