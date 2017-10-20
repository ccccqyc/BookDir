package two;

/**
 * 线性表 数组实现 顺序表
 * Created by q on 17-10-18.
 */
public class LinearListByArray<AnyType> {

    /**
     * 简化 仅测试list的基本基本功能
     * 故假设 此List有容量限制
     */
    private final int MaxSize = 10;
    private int theSize;
    private AnyType[] theItems;
    private final int ERROR = -1;

    /**
     * MakeEmpty
     */
    public LinearListByArray() {
        doClear();
    }

    private void doClear() {
        theSize = 0;
    }

    /**
     * find
     */
    public int find(AnyType x) {
        int i = 0;
        while (i <= theSize - 1 && theItems[i] != x) {
            i++;
        }
        if (i > theSize - 1) {
            return ERROR;
        } else {
            return i;
        }
    }

    /**
     * 插入idx前一位
     * idx是从1开始
     */
    public boolean insert(AnyType x, int idx) {
        boolean b = false;


        //先判断是否标满.
        if (theSize == MaxSize) {
            System.out.println("表满");
            return b;
        }
        if (idx < 1 || idx > MaxSize) {
            System.out.print("位置不合法");
            return b;
        }

        for (int i = theSize - 1; i > idx - 1; i--) {
            theItems[i + 1] = theItems[i];
        }
        theItems[idx - 1] = x;
        theSize++;
        return true;
    }

    public boolean add(AnyType x) {
        return insert(x, theItems.length + 1);
    }

    /**
     * 指定special位置
     *
     * @param idx 从1开始
     * @return
     */
    public AnyType delete(int idx) {
        AnyType x = theItems[idx];
        if (idx < 1 || idx > theSize) {
            System.out.print("位置不合法");
            return null;
        }
        for (int i = idx; i < theSize; i++) {
            theItems[i] = theItems[i + 1];
        }
        theSize--;
        return x;
    }
}
