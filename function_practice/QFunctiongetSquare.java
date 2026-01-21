/*
 WAP to create a function name as int getSquare(int no)
*/
import java.util.Scanner;
class QFunctiongetSquare{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no to find square of it");
		int no = sc.nextInt();
		System.out.println("Square is "+getSquare(no));
	}
	public static int getSquare(int no){
		return no*no;
	}
}