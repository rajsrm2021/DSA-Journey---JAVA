import java.util.*;

public class codevita {

    public static int isSmallest(int num[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSastify(int num[], int prime, int q) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] != q && prime % num[i] != q) {
                return false;
            }
        }
        return true;
    }

    private static int findSmallestPrime(Set<Integer> numbers, int q) {
    int num = q + 1;
    int limit = 10000000; // 10^10
    while (true) {
        if (num >= limit) {
            return -1; // If num exceeds the limit, return -1
        }
        if (isPrime(num) && isSatisfyCondition(numbers, num, q)) {
            return num;
        }
        num++;
    }
      
    

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numStrings = input.split(" ");
        int num[] = new int[numStrings.length];

        for (int i = 0; i < numStrings.length; i++) {
            num[i] = Integer.parseInt(numStrings[i]);
        }

        int result = findSmallestPrime(num, isSmallest(num));
        // if (result == -1) {
        //     System.out.println("None");
        // } else {
        //     System.out.println(result);
        // }

        System.out.println(result);
    }
}
