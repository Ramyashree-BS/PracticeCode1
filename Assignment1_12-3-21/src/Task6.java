import java.util.*;
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Enter a number");
		int n=sc.nextInt();
		String res=repeatFront(str,n);
		System.out.println("The final string is: "+res);
	}
	
	public static String repeatFront(String str, int n)
	{
		String res=str.substring(0,n);
		
		while(n>0)
		{
			res=res+str.substring(0,n-1);
			n--;
		}
		return res;
	}

}
