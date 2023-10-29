import java.util.*;

public class Hashing {

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,1,2,3,11,1,1,1,1};

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            } else {
                // Get the current count associated with the key and increment it by 1
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        // Print the occurrences of each element in the array
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
