package practiceOnGit;

import java.util.Scanner;

public class GitPractice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		int resultAddition = addition(num1,num2);
		System.out.println("The addition = "+resultAddition);
		
		int resultMultiplication =multiplication(num1,num2);
		System.out.println("The addition = "+resultMultiplication);
		
	}
	
	static int addition(int a, int b){
		return a + b;
	}
	
	static int multiplication(int a, int b){
		return a*b;
	}
	

}
