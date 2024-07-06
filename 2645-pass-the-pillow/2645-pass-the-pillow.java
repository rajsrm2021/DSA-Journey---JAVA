class Solution {
    public int passThePillow(int n, int time) {

        int currentPosition = 0;

        int direction = 1;

        while(time>0){
            currentPosition += direction;

            time--;

            if(currentPosition == n-1){
                direction = -1;
            }else if(currentPosition == 0){
                direction = 1;
            }
        }


        return currentPosition + 1;
        
    }
}