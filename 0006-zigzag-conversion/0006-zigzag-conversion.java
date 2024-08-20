class Solution {
    public String convert(String s, int numRows) {

        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            rows[i] = new StringBuilder();
        }

        int i=0;

        while(i<s.length()){
            // top to bottom
            for(int idx = 0; idx<numRows && i<s.length(); idx++){
                rows[idx].append(s.charAt(i++));
            }

            // bottom to top
            for(int idx = numRows - 2; idx > 0 && i<s.length(); idx--){
                rows[idx].append(s.charAt(i++));
            }
        }

        StringBuilder res = new StringBuilder();
        for(StringBuilder sb : rows){
            res.append(sb);
        }

        return res.toString();
        
    }
}