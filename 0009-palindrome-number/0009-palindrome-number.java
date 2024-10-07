class Solution {
    public boolean isPalindrome(int x) {

        if(x<0) return false;

        if(x>=0 && x<=9) return true;

        int rev = 0;

        int num = x;

        while(num>0){
            int last = num%10;
            rev = rev*10+last;
            num/=10;
        }

        return rev == x;
        
    }
}