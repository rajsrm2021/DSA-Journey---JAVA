import java.util.*;

public class insertion {
    public static void insert(int arr[]) {
        int arr2[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length] = 5; // Inserting the new element at the last index
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        insert(arr);
    }
}
