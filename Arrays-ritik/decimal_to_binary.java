public class Main
{
    public static void dectobin(int dec){
        int mynum=dec;
        int pow=0;
        int binNum=0;
        
        while(dec>0){
            int rem=dec%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            dec=dec/2;
        }
        
        System.out.print("binary of "+mynum+" is "+binNum);
    }
	public static void main(String[] args) {
		dectobin(10);
	}
}
