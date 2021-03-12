import java.util.Scanner;
public class Task5 {
	
	public static String repeatEnd(String str, int n)
	{
	String res=str.substring(str.length()-n);
	for(int i=1;i<=n;i++)
	{
		System.out.print(res);
	}
	return res;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.nextLine();
		System.out.println("Enter the value of n");
		int n=scanner.nextInt();
		repeatEnd(str,n);
	
	}

}
