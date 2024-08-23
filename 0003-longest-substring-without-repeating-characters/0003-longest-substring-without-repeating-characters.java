class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int max = 0;

        int l = 0;
        int r = 0;
        while (r<s.length() ){
            char ch = s.charAt(r);

            if(!set.contains(ch)){
                set.add(ch);
                max = Math.max(max,r-l+1);
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }

        return max;

    }
}