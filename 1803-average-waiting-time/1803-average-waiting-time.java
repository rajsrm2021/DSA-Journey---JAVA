class Solution {
    public double averageWaitingTime(int[][] customers) {

        double total_wait_time = 0;
        int curr_time = 0;

        for(int i=0;i<customers.length;i++){

            int arival_time = customers[i][0];
            int cook_time = customers[i][1];

            if(curr_time<arival_time){
                curr_time = arival_time;
            }
            int wait_time = (curr_time + cook_time) - arival_time;
            total_wait_time += wait_time;

            curr_time += cook_time;
            
        }
        return total_wait_time/customers.length;

    }
}