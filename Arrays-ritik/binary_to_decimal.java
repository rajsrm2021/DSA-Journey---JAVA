import java.util.*;
public class Main
{ public static void bintodec(int binNum){
    int mynum=binNum;
    int pow=0;
    int dec=0;
    
    while(binNum>0){
        int lastdigit=binNum%10;
        dec=dec+(lastdigit*(int)Math.pow(2,pow));
        pow++;
        binNum=binNum/10;
    }
    System.out.print("decimal of "+mynum+" is "+dec);
    
}
	public static void main(String[] args) {
	    bintodec(101);
	}
}
