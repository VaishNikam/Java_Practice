/*
3. Find Maximum of Two Numbers

Problem: Write a function that returns the greater of two numbers.

Input:
a = 15, b = 25

Output:
25
*/
import java.util.Scanner;
class FunctionFindMaxFromTwoNos{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two nos");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("This is max "+maxIs(n1,n2));
	}
	public static int maxIs(int no1,int no2){
		if(no1>no2){
			return no1;
		}else{
			return no2;
		}
	}
}