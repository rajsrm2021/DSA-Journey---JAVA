import java.util.*;

public class insertion {
    public static void insert(int arr[], int idx, int val) {

        int arr2[] = new int[arr.length + 1];

        for (int i = 0; i < idx; i++) {
            arr2[i] = arr[i];
        }
        arr2[idx] = val;

        for (int i = idx + 1; i <= arr.length; i++) {
            arr2[i] = arr[i - 1];

        }


        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static void remove(int[] arr,int idx){

        int arr2[] = new int[arr.length-1];

        for (int i = 0; i < idx-1; i++) {
            arr2[i] = arr[i];
        }

        for(int i=idx;i<arr.length;i++){
            arr2[i-1] = arr[i];
        }

        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4 };

        remove(arr,3);

    }
}
