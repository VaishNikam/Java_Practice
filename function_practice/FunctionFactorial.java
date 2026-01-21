/*
4. Calculate Factorial

Problem: Write a function that calculates the factorial of a number.

Input:
n = 5

Output:
120
*/
import java.util.Scanner;
class FunctionFactorial{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no to find its factorial");
		int no=sc.nextInt();
		System.out.println("Factorial is "+factIs(no));
	}
	public static int factIs(int no){
		int fact=1;
		for(int i=no;i>0;i--){
			fact=fact*i;
		}
		return fact;
	}
}