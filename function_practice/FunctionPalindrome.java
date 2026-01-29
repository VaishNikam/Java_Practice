/*
10. Check Palindrome Number

Problem: Write a function that checks whether a number is a palindrome.

Input:
n = 121

Output:
Palindrome
*/
import java.util.Scanner;
class FunctionPalindrome{
	static int rev=0;
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no to check it is palindrome or not");
		int no=sc.nextInt();
		boolean res=isPalindrome(no);
		System.out.println("is no palindrome ? = "+res);
	}
	public static boolean isPalindrome(int no){
		
		int n=no,rem=0;
		while(no!=0){
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(rev==n){
			return true;
		}
		return false;
	}
}

















