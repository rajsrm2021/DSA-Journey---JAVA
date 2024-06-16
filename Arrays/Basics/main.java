public class main {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 6 };
        System.out.println("Array before insertion");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int elementToInsert = 3;
        int positionToInsert = 2;

        int arr1[] = new int[arr.length + 1];

        for (int i = 0; i < positionToInsert; i++) {
            arr1[i] = arr[i];
        }

        arr1[positionToInsert] = elementToInsert;

        for (int i = positionToInsert; i < arr.length; i++) {
            arr1[i + 1] = arr[i];
        }

        System.out.println();
        System.out.println();
        System.out.println("Array after insertion");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

}
