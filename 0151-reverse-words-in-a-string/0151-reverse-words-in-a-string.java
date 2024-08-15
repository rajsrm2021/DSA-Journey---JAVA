import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreTokens()) {
            stack.push(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty()) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
