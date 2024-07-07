class Solution {

    public class Pair implements Comparable<Pair>{
        int diff;
        int val;

        Pair(int diff, int val){
            this.diff = diff;
            this.val = val;
        }

      
       public int compareTo(Pair p2){
    return this.diff==p2.diff ? p2.val-this.val : p2.diff-this.diff;
}

    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            pq.offer(new Pair(Math.abs(x-arr[i]),arr[i]));

            if(pq.size()>k){
                pq.poll();
            }
        }

        List<Integer> l = new ArrayList<>();

        while(!pq.isEmpty()){
            l.add(pq.poll().val);
        }

        Collections.sort(l);

        return l;
        
    }
}