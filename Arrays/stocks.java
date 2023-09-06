// best time to buy and sell stock

class stocks {
    public static int maxProfit(int[] prices) {

        int maxprofit = 0;
        int minSoFar = prices[0];

        for(int i=0;i<prices.length;i++){
            minSoFar = Math.min(minSoFar,prices[i]);
            int profit = prices[i]-minSoFar;
            maxprofit=Math.max(maxprofit,profit);

        }
        return maxprofit;
    }

    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};

        System.out.println(maxProfit(price));

    }
}