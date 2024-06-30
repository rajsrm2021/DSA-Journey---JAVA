class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               int key = i+j;
               List<Integer> list = map.getOrDefault(key,new ArrayList<>());
               list.add(mat[i][j]);
               map.put(key,list);
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i=0;i<m+n-1;i++){
            List<Integer> temp = map.get(i);
            if(i%2==0){
                Collections.reverse(temp);
            }

            res.addAll(temp);
        }
        // Convert List to array
        int[] resultArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resultArray[i] = res.get(i);
        }
        
        return resultArray;
        
    }
}