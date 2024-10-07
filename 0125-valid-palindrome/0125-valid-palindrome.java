class Solution {
    public boolean isPalindrome(String s) {

        String cleanedStr = s.replaceAll("[^a-zA-Z0-9]", "");

        String cleanStr = cleanedStr.toLowerCase();

        int ptr1 = 0;
        int ptr2 = cleanStr.length() - 1;

        while (ptr1 < ptr2) {
            if (cleanStr.charAt(ptr1) != cleanStr.charAt(ptr2)) {
                return false;
            }
            ptr1++;
            ptr2--;
        }

        return true;

    }
}