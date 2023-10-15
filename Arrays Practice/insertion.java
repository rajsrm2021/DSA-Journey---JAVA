import java.util.*;

public class insertion {
    public static void insert(int arr[],int idx, int val) {

        int arr2[] = new int[arr.length + 1];
        
        for(int i=0;i<idx;i++){
            arr2[i]=arr[i];
        }
        arr2[idx] = val;

        for (int i = idx+1; i <= arr.length; i++) {
            arr2[i]=arr[i-1];
            
        }


        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3};
        insert(arr,1,0);
        System.out.println();
        System.out.println(arr.length);

    }
}
