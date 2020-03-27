import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the Numbers");
		int a,b,count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		if(b<a||b<0||a<0)
			System.out.print("Provide valid input ");
		for(int i=a;i<=b;i++) {
			count=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
					count++;
					break;
				}
			}		
			if(count==0) {
				System.out.print(i+" ");
				
			}
		}
		
	}
}
