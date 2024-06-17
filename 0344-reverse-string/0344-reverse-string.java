class Solution {
    public void reverseString(char[] s) {

        int ptr1 = 0;
        int ptr2 = s.length-1;

        while(ptr1<=ptr2){
            char a = s[ptr1];
            char b = s[ptr2];

            s[ptr1] = b;
            s[ptr2] = a;

            ptr1++;
            ptr2--;
        }
        
    }
}