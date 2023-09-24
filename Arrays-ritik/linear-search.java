public class Main
{
    public static void linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.print("key is at index "+i);
            }
        }
    }
    
    public static void main(String[] args) {
	    int arr[]={2,5,4,6,7,8};
	    linearSearch(arr,6);
	}
}