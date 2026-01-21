/*
2. Check Even or Odd

Problem: Write a function that checks whether a given number is even or odd.

Input:
n = 7

Output:
Odd
*/
import java.util.Scanner;
class FunctionCheckEvenOrOdd{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no to check odd or even");
		int no=sc.nextInt();
		System.out.println("number is "+checkEvenOdd(no));
		
	}
	public static String checkEvenOdd(int no){
		if(no%2==0){
			return "Even";
		}
		else{
			return "Odd";
		}
	}
}