package vit.xyz.emp;
import java.util.Scanner;
public class control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter the age : ");
    int m=sc.nextInt();
    if (m>18) {
     System.out.println("elgible for vote");
    }
    else {
    	System.out.println("Not elgible for vote");	
    }
    
   
	}

}
