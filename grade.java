import java.util.Scanner;
public class grade {
	public static void main(String[] args) {
		System.out.print("Enter the grade point : ");
		Scanner sc=new Scanner(System.in);
		float n=sc.nextFloat();
		sc.close();
		
		if(n==5)
			System.out.println("Grade :O");
		
		else if(n<5&&n>=4.5)
			System.out.println("Grade :A");
		
		else if(n<4.5&&n>=4.0)
			System.out.println("Grade :B");
		
		else if(n<4.0&&n>=3.0)
			System.out.println("Grade :C");
		
		else if(n<3.0&&n>=2.0)
			System.out.println("Grade :D");
		
		else if(n<2.0&&n>=1.0)
			System.out.println("Grade :E");
		
		else 
			System.out.println("Grade :F");
		
		
		
	}

}
