
public class sorting
{
	public static void main(String[] args) {
	    
	    int arr[]= {1,1,0,1,0,1,0,0};
	    
	    int pointer=0;
	    
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==0){
	           // swap
	           int temp=arr[i];
	           arr[i]=arr[pointer];
	           arr[pointer]=temp;
	            pointer++;
	        }
	       
	    }
	    
	   // printing the array
	   for(int i=0;i<arr.length;i++){
	       System.out.print(arr[i]+" ");
	   }
	}
}
