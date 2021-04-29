import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc= new Scanner(System.in);
		int no = sc.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+no+" is "+fact+"");
	}
}