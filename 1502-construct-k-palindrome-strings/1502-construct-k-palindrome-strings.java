class Solution {
    public boolean canConstruct(String s, int k) {

        char[] freq = new char[26];
        int oddCount = 0;

        if (s.length() < k)
            return false;
        if (s.length() == k)
            return true;

        for (char S : s.toCharArray()) {
            freq[S - 'a']++;
        }


        for(int count: freq){
            if(count % 2 == 1){
                oddCount++;
            }
        }



        return oddCount <= k;

    }
}