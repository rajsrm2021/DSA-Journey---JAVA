// import java.util.*;

public class bit {
    public static void main(String args[]) {
        int a = 11;
        int b = a >> 1; // right shift
        int c = a << 1; // left sift
        System.out.println(b);
        System.out.println(c);

        if ((a & 1) == 0) { // bit masking concept
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // swapping using bit method i.e. using XOR operation

        int r = 10;
        int m = 11;

        r = r ^ m; // XOR Operations
        m = r ^ m;
        r = r ^ m;

            System.out.println(r);
        System.out.println(m);
    }
}       