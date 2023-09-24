public class Main
{
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int previdx=i-1;
            
            while(previdx>=0 && arr[previdx]>temp){
                arr[previdx+1]=arr[previdx];
                previdx--;
            }
            
            arr[previdx+1]=temp;
        }
    }
    
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
		int arr[]={5,4,1,3,2};
		InsertionSort(arr);
		printarr(arr);
	}
}
