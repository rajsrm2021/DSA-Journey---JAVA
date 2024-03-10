
public class bubble_sort {

    public static void sort(int arr[]) {

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    // swap using xor
                    arr[i] ^= arr[i + 1];
                    arr[i + 1] ^= arr[i];
                    arr[i] ^= arr[i + 1];

                }

            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 4, 55, 2, 66, 3, 1, 6 };

        sort(arr);

        printArr(arr);

    }
}
