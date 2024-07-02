public class bubble_sort {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 9, 1, 6, 16 };
        int temp;
        System.out.print("Array befort sort");
        System.out.println();

        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Array after sort");

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}