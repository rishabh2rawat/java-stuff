import java.util.Scanner;
class test
{
	public static void main(String[]args)
	{
		 Scanner scan=new Scanner(System.in);
		 int fact=1;
		 System.out.println("enter the no whose factorial is to be found");
		 int n=scan.nextInt();
		 for(int i=1;i<=n;i++)
		 {
		 	fact=fact*n;
		 }
		 System.out.println("the factorialof a no is"+fact);

	}
}