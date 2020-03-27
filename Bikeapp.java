import java.util.Scanner;
public class Bikeapp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance travelled = ");
		int num=sc.nextInt();
		sc.close();
		if(num<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		int o=1,e=1,rem;
		for(int i=0;num>0;i++) {
			rem=num%10;
				if(i%2==0)
					e=e*rem;
				else
					o=o*rem;
			num=num/10;		
			}
		if(e>o)
			System.out.println("your binous point is "+e);
		else if(e==o)
			System.out.println("your binous point is "+2*e);
		
		
		else
			System.out.println("your binous point is "+o);
		
		}
		
		
	}


