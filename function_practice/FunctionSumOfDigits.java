/*
8. Sum of Digits

Problem: Write a function that returns the sum of digits of a number.

Input:
n = 456

Output:
15
*/
import java.util.Scanner;
class FunctionSumOfDigits{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no to find sum of its digit");
		int no=sc.nextInt();
		sumOfDigits(no);
	}
	public static void sumOfDigits(int n){
		int sum=0;
		int no=n, rem=0;
		while(n!=0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
}