package strings;

import java.util.Scanner;

public class TrimMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the city name");
		String ss=scan.nextLine().toLowerCase().trim();
		if(ss.equals("hyderbad")) {
			System.out.println("hello telugu");
		}
		else if(ss.equals("bangalore"))
		{
			System.out.println("hello kannada");
		}
		else if(ss.equals("chennai"))
		{
			System.out.println("hello tamil");
		}
		else
		{
			System.out.println("enter valid city name");
		}
		
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=scan1.nextInt();
		if(x%2==0)
		{
			System.out.println("it is an even number");
		}
		else
		{
			System.out.println("it is not even number");
		}
	}

}
