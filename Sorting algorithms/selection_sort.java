public class selection_sort {

    public static void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            // find min element in unsorted array

            int min_idx = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                }
                // SWAPPING
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;

            }
        }
    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 22, 3, 11, 44, 2, 4, 1 };

        sort(arr);
        print(arr);

    }
}
