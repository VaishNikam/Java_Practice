/*
7. Count Digits

Problem: Write a function that counts the number of digits in a given number.

Input:
n = 98765

Output:
5
*/
import java.util.Scanner;
class functionCountDigits{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no to count its digit");
		int no= sc.nextInt();
		int digit=countDigit(no);
		System.out.println("Digit count is "+digit);
	}
	public static int countDigit(int n){
		int count=0, no=n;
		while(no!=0){
		  no=no/10;
		count++;
		}
		return count;
	}
}