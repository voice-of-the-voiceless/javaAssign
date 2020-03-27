import java.util.Scanner;
public class Rainbow {
	public static void main(String[] args) {
		
		char r,a,i,n,b,o,w;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr in upper case");
		System.out.print("Enter the first letter : ");
		r=sc.next().charAt(0);
		System.out.print("Enter the second letter : ");
		a=sc.next().charAt(0);
		System.out.print("Enter the third letter : ");
		i=sc.next().charAt(0);
		System.out.print("Enter the fourth letter : ");
		n=sc.next().charAt(0);
		System.out.print("Enter the fifth letter : ");
		b=sc.next().charAt(0);
		System.out.print("Enter the sixth letter : ");
		o=sc.next().charAt(0);
		System.out.print("Enter the seventh letter : ");
		w=sc.next().charAt(0);
		
		if(r=='R'&&a=='A'&&i=='I'||n=='N'&&b=='B'&&o=='O'&&w=='W')
			System.out.println("RAINBOW");
		else
			System.out.println("the spelling is wrong");
		
		
		
		
		
		
		
	}

}
