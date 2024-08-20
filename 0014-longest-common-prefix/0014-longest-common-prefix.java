class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String start = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder res = new StringBuilder();

        int minLength = Math.min(start.length(), last.length());

        for (int i = 0; i < minLength; i++) {
            if (start.charAt(i) != last.charAt(i)) {
                return res.toString();
            } else {
                res.append(start.charAt(i));
            }
        }

        return res.toString();
    }
}