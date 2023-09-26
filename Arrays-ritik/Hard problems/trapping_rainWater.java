public class Main
{
    public static int trappingWater(int height[]){
        int n=height.length;
        //leftmax boundary calculate
             //making of auxiliary array
             
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        
        //for loop for calculating leftmax 
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        
        //rightmax boundary calculate
             //making of auxiliary array
             
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        
        //for loop for calculating rightmax
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        
        //for loop for calculating trappedWater
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedWater+=waterlevel - height[i];
        }
        
        //return statement 
        return trappedWater;
    }
	public static void main(String[] args) {
	int height[]={4,2,0,6,3,2,5};
	System.out.println("Total water trapped between the bars is "+trappingWater(height));
	}
}
