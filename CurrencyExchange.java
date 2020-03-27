import java.util.Scanner;
public class CurrencyExchange {
	public static void main(String[] args) {
		System.out.print("Enter the currency code = ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(!s.equalsIgnoreCase("CAD")&& !s.equalsIgnoreCase("HKD") && !s.equalsIgnoreCase("SGD") && !s.equalsIgnoreCase("USD")) {
			System.out.println("Currency code not found");
			System.exit(0);
//		}
		}
// 		if(s!="CAD" || s!="HKD" || s!="SGD" || s!="USD") {
//		System.out.println("Currency code not found");
//			System.exit(0);
//		}
		System.out.print("Enter the amount = ");
		int num=sc.nextInt();
		sc.close();
		if(s.equalsIgnoreCase("CAD"))
			System.out.print("Canada dollar "+num+" equals to "+num*52.08+"Indian Rupees");
		else if(s.equalsIgnoreCase("HKD")) {
			System.out.print("Hong Kong dollar "+num+" equals to "+num*8.86+"Indian Rupees");
		}
		else if(s.equalsIgnoreCase("SGD"))
			System.out.print("Singapore dollar "+num+" equals to "+num*51029+"Indian Rupees");
		if(s.equalsIgnoreCase("USD"))
			System.out.print("Anerican dollar "+num+" equals to "+num*8.86+"Indian Rupees");
		
	}

}
