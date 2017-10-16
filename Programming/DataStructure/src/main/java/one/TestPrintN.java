package one;

/**
 * Created by q on 17-10-16.
 */
public class TestPrintN {
    public static void main(String[] args) {
        double begin0, begin1, end0, end1;

        int[] ints = {10, 100, 1000};

        System.out.println(("Loop") + " : " + ("Recursion"));
        for (int n : ints) {
            begin0 = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                printNByloop(n);
            }
            end0 = System.currentTimeMillis();

            begin1 = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                printNByrecursion(n);
            }
            end1 = System.currentTimeMillis();

            System.out.println((end0 - begin0) + " : " + (end1 - begin1));
        }
    }

    private static void printNByloop(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            count++;
        }
    }

    private static void printNByrecursion(int N) {
        int count = 0;
        if (N != 0) {
            printNByrecursion(N - 1);
                count++;
        }
    }
}
