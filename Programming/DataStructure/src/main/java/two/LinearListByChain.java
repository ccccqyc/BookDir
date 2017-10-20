package two;

/**
 * 线性表 链式存储实现 链式表
 * 本次链表实现使用单链表.
 *
 * 公共方法中参数只能是AnyType,或者int,
 * 调用者不知道 Node实现.
 *
 * @author q
 */
public class LinearListByChain<AnyType> {
    private Node<AnyType> first;
    private Node<AnyType> end;
    private int theSize;

    public LinearListByChain() {
        doClear();
    }

    /**
     * makeEmpty()
     */
    public void clear() {
        doClear();
    }

    private void doClear() {
        first = new Node<AnyType>(null, null);
        end = new Node<AnyType>(null, null);
        first.next = end;
        theSize = 0;
    }

    public int size() {
        return theSize;
    }

    public int find(AnyType x) {
        Node<AnyType> node = first;
        int count = 1;
        while (!node.data.equals(null) && !node.data.equals(x)) {
            node = node.next;
            count++;
        }

        if (node.data.equals(x)) {
            return count;
        } else {
            return -1;
        }
    }

    public boolean insert(int idx, AnyType x) {
        return add(idx, x);
    }

    public boolean add(AnyType x) {
        return add(size(), x);
    }

    public boolean add(int idx, AnyType x) {
        return addBefore(getNode(idx, 0, size()), x);
    }

    private Node<AnyType> getNode(int idx, int low, int upper) {
        Node<AnyType> p;

        if (idx < low || idx > upper) {
            throw new IndexOutOfBoundsException();
        }

        p = first.next;
        for (int i = 0; i <= upper; i++) {
            p = p.next;
        }
        return p;
    }

    private boolean addBefore(Node<AnyType> p, AnyType x) {
        Node<AnyType> node = new Node<>(x, p);
        p.next = node;
        theSize++;
        return true;
    }

    public AnyType delete(int idx) {
        if (idx == 0) {
            return getNode(idx).data;
        }

        Node<AnyType> p = getNode(idx - 1);
        Node<AnyType> p1 = getNode(idx);
        p.next = p1.next;
        return getNode(idx).data;
    }

    private Node<AnyType> getNode(int idx) {
        return getNode(idx, 0, size() - 1);
    }


    private static class Node<AnyType> {
        public AnyType data;
        public Node<AnyType> next;

        public Node(AnyType data, Node<AnyType> next) {
            this.data = data;
            this.next = next;
        }
    }
}
