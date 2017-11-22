package two;

/**
 * Created by q on 17-11-22.
 */
public class LinkQueue<E> {
    private class Node<E> {
        E e;
        Node<E> next;

        public Node() {
        }

        public Node(E e, Node<E> next) {
            this.e = e;
            this.next = next;
        }
    }

    private Node front;
    private Node rear;
    private int size;
    private Node temp;

    public LinkQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(E e) {
        if (isEmpty()) {
            front = new Node(e, null);
            rear = front;
        } else {
            Node<E> node = new Node<>(e, null);
            rear.next = node;
            rear = node;
        }
        size++;
        return true;
    }

    public Node<E> peek() {
        if (isEmpty()) {
            throw new RuntimeException("empty");
        } else {
            return front;
        }
    }

    public Node<E> poll() {
        if (isEmpty()) {
            throw new RuntimeException("empty");
        } else {
            temp = front;
            front = temp.next;
            //
            temp.next = null;
        }
        size--;
        return temp;
    }

}
