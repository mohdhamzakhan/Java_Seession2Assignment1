package Session2;

import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args)
	{
	int age=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	age=sc.nextInt();
	if(age>17)
		System.out.println("You are eligle to vote");
}
}
