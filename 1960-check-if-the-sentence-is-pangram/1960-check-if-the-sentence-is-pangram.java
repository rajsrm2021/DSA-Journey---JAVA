class Solution {
    public boolean checkIfPangram(String sentence) {

        if(sentence.length()<26) return false;

        boolean arr[] = new boolean[26];

        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)>='a' && sentence.charAt(i) <= 'z'){
                arr[sentence.charAt(i) - 'a'] = true;
            }
            else if(sentence.charAt(i)>='A' && sentence.charAt(i)<= 'Z'){
                arr[sentence.charAt(i) - 'A'] = true;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] != true) return false;
        }

        return true;
        
    }
}