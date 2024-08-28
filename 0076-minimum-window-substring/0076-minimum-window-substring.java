class Solution {
    public String minWindow(String s, String t) {

        if(t.length()>s.length()){
            return "";
        }
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int req = map.size();
        int formed = 0;
        int[] window_count = new int[256];
        int min = Integer.MAX_VALUE;
        int minStart=0;
        int left =0;
        int right = 0;

        while(right<s.length()){
            char ch = s.charAt(right);
            window_count[ch]++;

            if(map.containsKey(ch) && map.get(ch)==window_count[ch]){
                formed++;
            }

            while(formed==req && left<=right){
                if(right-left+1<min){
                    min = right-left+1;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                window_count[leftChar]--;

                if(map.containsKey(leftChar) && map.get(leftChar) > window_count[leftChar]){
                    formed--;
                }
                left++;
            }
            right++;
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + min);
        
    }
}