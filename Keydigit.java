import java.util.Scanner;
public class Keydigit {
	public static void main(String[] args)  {
		System.out.print("Enter the number : ");
		int key,num,c=0,temp;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		System.out.print("Enter the keydigit : ");
		key=sc.nextInt();
		sc.close();
		while(num>0) {
			if(num%10==key)
				c++;
			num=num/10;
		}
		System.out.println(key+" appears "+c+" times in "+temp);
	}

}
