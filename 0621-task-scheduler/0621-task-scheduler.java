class Solution {
    public int leastInterval(char[] tasks, int n) {

        Map<Character,Integer> map = new HashMap<>();

        for(char ch : tasks){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int count:map.values()){
            pq.offer(count);
        }
        
        int interval = 0;

        while(!pq.isEmpty()){
            List<Integer> temp = new ArrayList<>();

            int cycle = n+1;

            for(int i=0;i<cycle;i++){
                if(!pq.isEmpty()){
                    temp.add(pq.poll());
                }
            }

            for(int count : temp){
                if(--count>0){
                    pq.add(count);
                }
            }

            interval += pq.isEmpty() ? temp.size() : cycle;
        }

        return interval;

    }
}