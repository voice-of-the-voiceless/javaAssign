import java.util.Scanner;
import java.lang.Math;
public class Factors {
	public static void main(String[] args) {
		System.out.print("Enter rhe number : ");
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num==0) {
			System.out.println("No Factors");
		    System.exit(0);
		 }
		if(num<0) {
			num=Math.abs(num);
		 }
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				System.out.print(i+" ");
		}
	}	
		
	}


