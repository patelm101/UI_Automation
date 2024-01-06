//Documentation
package xyza;

import java.io.Console;
import java.lang.*;

public class Sampleproj {
	//create a method (user defined)
	public int multiply(int a, int b, int c){
		int result  = a*b*c;
		return result;
	}
	
public static void main(String[]args){
//this is a sample program
	int a = 10, b = 20, c = 30; //variables declaration and initialization
	final int money = 100;  //Constant declaration
	System.out.println("Addition of a, b is " + (a+b)); //30
	System.out.println(money); //100
	System.out.println(c); //30
	//Condition block
	if (a>b){
		System.out.println("A is a big number");
	}
	else
	{
		System.out.println("B is a big number");
	}
	//Loop block
	for (int d = 1; d <= 10; d++){
		System.out.println(d);
	}
	//create object and access methods one or more
	Sampleproj obj = new Sampleproj();
	int x  = obj.multiply(10, 25, 50);
	System.out.println(x);
}
}
