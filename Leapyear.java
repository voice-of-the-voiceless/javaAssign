import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args) {
		System.out.println("Enter the year");
		
		Scanner sc=new Scanner(System.in);
		int y,n=0,temp;
		y=sc.nextInt();
		temp=y;
		sc.close();
		if(y>0) {
			while(temp>0) {
				temp=temp/10;
				n++;
			}
			if(n==4) {
				if(y%4==0)
					System.out.println("Leap year");
		
				else 
					System.out.println("Not a Leap year");
			}
		
		else
			System.out.println("invalid input");
		
	}
		else
			System.out.println("invalid input");
  }
}

