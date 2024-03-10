
public class insertion_sort {

    public static void insertion(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j = j - 1;

            }

            arr[j + 1] = key;

        }
    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 22, 3, 11, 44, 2, 4, 1 };

        insertion(arr);
        print(arr);
    }
}