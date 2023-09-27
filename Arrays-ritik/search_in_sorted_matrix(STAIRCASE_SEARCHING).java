public class Main
{
    public static boolean staircaseSearch(int matrix[][],int key){
        int row=0;int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("key is at index ("+row+","+col+")");
                return true;
            }
            
            else if(key<matrix[row][col]){
                col--;
            }
            
            else if(key>matrix[row][col]){
                row++;
            }
        }
        System.out.println(" key not found");
        return false;
    }
	public static void main(String[] args) {
		int matrix[][]={{10,20,30,40},
		                {15,25,35,45},
		                {27,29,37,48},
		                {32,33,39,50}};
		                
	    staircaseSearch(matrix,31);	            
		                
	}
}
