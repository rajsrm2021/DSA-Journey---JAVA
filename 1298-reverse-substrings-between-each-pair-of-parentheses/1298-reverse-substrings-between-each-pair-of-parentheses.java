class Solution {
    private void reverseSubstring(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();

        StringBuilder res = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(res.length());
            }else if(s.charAt(i)==')'){
                int start = stack.pop();
                int end = res.length()-1;
                reverseSubstring(res, start, end);
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}