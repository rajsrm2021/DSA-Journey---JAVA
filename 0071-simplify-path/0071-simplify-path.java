import java.util.StringTokenizer;
class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        
        StringTokenizer token = new StringTokenizer(path, "/");

        while(token.hasMoreTokens()){
            String part = token.nextToken();
            if(part.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(!part.equals(".") && !part.isEmpty()){
                st.push(part);
            }
        }

        StringBuilder res = new StringBuilder();

        for(String dir: st){
            res.append("/").append(dir);
        }
         return res.length() > 0 ? res.toString() : "/";

    }
}