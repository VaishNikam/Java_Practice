/*
Q.7 Write a java program to enter temperature in Fahrenheit and convert to celsius
	Formula:- cel=(fah-32)*5/9
*/
import java.util.Scanner;
class FahrenheittoCelcius{
	public static void main(String args[]){
		float fah;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit");
		fah=sc.nextFloat();
		System.out.println("Fahrenheit to Celcius= "+((fah-32)*5/9));
		
	}
}