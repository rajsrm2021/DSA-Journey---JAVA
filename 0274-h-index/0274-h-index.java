class Solution {
    public int hIndex(int[] citations) {

        int n = citations.length;

        Arrays.sort(citations);

        int hindex = 0;

        for(int i = n-1;i>=0;i--){
            if(citations[i] >= n-i){
                hindex = n - i;
            }
        }

        return hindex;
        
    }
}