// find the ith bit

public class bit {
    public static void main(String args[]) {
        int n = 7;
        int i = 3;
        int mask = 1 << i;

        // performing and operation

        if ((n & mask) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}