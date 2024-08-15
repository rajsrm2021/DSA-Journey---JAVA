class Solution {
    public int strStr(String haystack, String needle) {

        int ptr1 = 0;
        int ptr2 = 0;

        while(ptr1 < haystack.length()){
            if(haystack.charAt(ptr1) == needle.charAt(ptr2)){
                ptr1++;
                ptr2++;

                if (ptr2 == needle.length()) {  // if we found entire needle
                    return ptr1 - needle.length();
                }
            }else{  // missmatch
                ptr1 = ptr1 - ptr2 + 1;
                ptr2 = 0;
            }
        }
        return -1;
    }
}