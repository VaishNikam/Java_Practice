/*
1. Sum of Two Numbers

Problem: Write a function that takes two integers and returns their sum.

Input:
a = 10, b = 20

Output:
30
*/
import java.util.Scanner;
class FunctionSumOfTwoNumbersQ1{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two nos to add");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println("Addition is "+addNumber(no1,no2));
	}
	public static int addNumber(int n,int m){
		return m+n;
	}
}