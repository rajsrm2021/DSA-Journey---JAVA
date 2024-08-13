class Solution {
    private Map<Integer, Long> dp = new HashMap<>();

    // Calculate Fibonacci number using memoization with HashMap
    public long findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (dp.containsKey(n)) {
            return dp.get(n);
        }

        long result = findFibonacci(n - 1) + findFibonacci(n - 2);
        dp.put(n, result);
        return result;
    }

    public int binarySearch(List<Long> list, long k) {
        int left = 0;
        int right = list.size() - 1;
        long floorValue = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == k) {
                return list.get(mid).intValue(); // Exact match found, return it
            } else if (list.get(mid) < k) {
                floorValue = list.get(mid); // Potential floor value found
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return (int) floorValue;
    }

    public int findMinFibonacciNumbers(int k) {
        List<Long> list = new ArrayList<>();
        int i = 1;
        long fibNumber = 0;

        // Generate Fibonacci numbers until the largest number exceeds k
        while (fibNumber <= k) {
            fibNumber = findFibonacci(i);
            list.add(fibNumber);
            i++;
        }

        int count = 0;
        while (k > 0) {
            // Find the largest Fibonacci number less than or equal to k
            long largestFib = binarySearch(list, k);

            // Subtract it from k
            k -= largestFib;

            // Increment the count
            count++;
        }

        return count;
    }

    
}
