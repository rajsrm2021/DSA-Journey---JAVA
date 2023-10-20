public class Solution {
    public static void nBinaryTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
               if(i%2!=0){
                   if(j%2==0){
                       System.out.print("0 ");
                   }else{
                       System.out.print("1 ");
                   }
               }else{
                   if(j%2!=0){
                       System.out.print("0 ");
                   }else{
                       System.out.print("1 ");
                   }
               }
            }
            System.out.println();
        }

    }
}