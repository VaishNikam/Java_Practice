/*
5. Check Prime Number

Problem: Write a function that checks whether a number is prime.

Input:
n = 11

Output:
Prime
*/
import java.util.Scanner;
class FunctionToFindPrimeNo{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		boolean res=isPrime(no);
		System.out.println(res?"Prime":"Not prime");
	}
	public static boolean isPrime(int no){
		int count=0;
		if(no<=1)return false;
		for(int i=2;i<=no/2;i++){
			if(no%i==0){
				return false;
			}
		}
		 return true;
	}
}