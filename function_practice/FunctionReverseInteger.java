/*
6. Reverse a Number

Problem: Write a function that reverses a given integer.

Input:
n = 1234

Output:
4321
*/
import java.util.Scanner;
class FunctionReverseInteger{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no to reverse");
		int no=sc.nextInt();
		reverseIt(no);
	}
	public static void reverseIt(int n){
		int no=n,rev=0;
		while(n!=0){
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		
		
	}
}