package hello;
import java.util.Scanner;

public class same_nos_or_not {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	System.out.println("Enter a number:");
	Scanner number = new Scanner(System.in);
	int a = number.nextInt();
	System.out.println("Enter a number:");
	int b = number.nextInt();
	if (a==b)
	{
		System.out.println("The given numbers are same");
	}
	else
	{
		System.out.println("The given numbers are not same");
	}

    }

}
