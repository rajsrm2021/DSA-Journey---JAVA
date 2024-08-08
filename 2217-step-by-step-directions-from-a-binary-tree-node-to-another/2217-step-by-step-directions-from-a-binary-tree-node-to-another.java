
class Solution {
    public String getDirections(TreeNode root, int startValue, int destValue) {

        StringBuilder pathToStart = new StringBuilder();
        StringBuilder pathToEnd = new StringBuilder();

        getPath(root, startValue, pathToStart);
        getPath(root, destValue, pathToEnd);

        int minLength = Math.min(pathToStart.length(), pathToEnd.length());
        int i = 0;

        while (i < minLength && pathToStart.charAt(i) == pathToEnd.charAt(i)) {
            i++;
        }

        StringBuilder result = new StringBuilder();

        for (int j = i; j < pathToStart.length(); j++) {
            result.append('U');
        }

        result.append(pathToEnd.substring(i));

        return result.toString();

    }

    public boolean getPath(TreeNode root, int value, StringBuilder path) {

        if (root == null)
            return false;
        if (root.val == value)
            return true;

        
        path.append('L');
        if (getPath(root.left, value, path))
            return true;
        path.setLength(path.length() - 1); // Backtrack


        path.append('R');
        if (getPath(root.right, value, path)) return true;
        path.setLength(path.length() - 1); // Backtrack
        return false;
    }
}