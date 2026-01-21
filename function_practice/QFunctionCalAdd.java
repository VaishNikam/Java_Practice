/*
 WAP to create function name as void calAdd(int x,int y):
*/
import java.util.Scanner;
class QFunctionCalAdd{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		calAdd(2,3);
	}
	public static void calAdd(int x, int y){
		System.out.println("Addition is "+(x+y));
	}
}