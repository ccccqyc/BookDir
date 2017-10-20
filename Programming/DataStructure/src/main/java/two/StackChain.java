package two;

/**
 * Created by q on 17-10-19.
 */
public class StackChain<T> {

    private Node<T> firstNode;
    private Node<T> endNode;
    private int theSize;

    public StackChain() {
        doClear();
    }

    private void doClear() {
        firstNode = new Node<>(null, null, null);
        endNode = new Node<>(firstNode, null, null);
        firstNode.next = endNode;
        theSize = 0;
    }


    public boolean isFull() {
        return false;
    }


    public boolean isEmpty() {
        return theSize == 0;
    }

    public boolean push(Object o) {
        return false;
    }

    public void push(Node<T> node) {
        firstNode.next = node;
        node.pre = firstNode;
        node.next = endNode;
        endNode.pre = node;
        theSize++;
    }


    public Node<T> pop() {
        if (isEmpty()) {
            return null;
        }
        Node<T> p = endNode.pre;
        p.pre.next = endNode;
        endNode.pre = p.pre;
        return p;
    }

    private class Node<T> {
        private Node<T> pre;
        private Node<T> next;
        private T data;

        public Node(Node<T> pre, Node<T> next, T data) {
            this.pre = pre;
            this.next = next;
            this.data = data;
        }
    }
}
