import java.util.Scanner;
public class LuckyNumber {
	public static void main(String[] args) {
		System.out.print("Enter the car number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int rem,sum=0,i=0;
		if(num<=0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			i++;
		}
		if(i==4) {
		if(sum%3==0||sum%5==0||sum%7==0)
			System.out.println("Luckey Number");
		else
			System.out.println("Sorry it's not lucky number");
		}
		else
			System.out.println("Invalid input");
	}

}
