class Solution {
    public int numberOfSubstrings(String s) {

        int result = 0; // final count
        int valid[] = new int[3]; // checking the validity that window contains all the required string
        int left = 0; // left pointer
        int n = s.length(); // size of string

        for (int right = 0; right < n; right++) {
            // increase the count
            valid[s.charAt(right) - 'a']++;

            while (valid[0] > 0 && valid[1] > 0 && valid[2] > 0) {
                result += n - right;
                valid[s.charAt(left) - 'a']--;
                left++;
            }

        }

        return result;

    }
}