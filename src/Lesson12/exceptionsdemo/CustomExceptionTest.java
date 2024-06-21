package Lesson12.exceptionsdemo;

import java.util.Scanner;

public class CustomExceptionTest {
	public static void main(String[] args) throws Below18AgeException {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter Age");
		x = sc.nextInt();
		if(x<=18)
		//	throw  // own exception related to my application
		throw new Below18AgeException("Age should be 18 or above");

	}

}
