package oops_linecomparison;

import java.util.Scanner;

public class Uc4 {
	static Uc4_SUBClass obj = new Uc4_SUBClass();
	static final double lengthl1 = obj.length1();
	static final double lengthl2 = obj.length2();
	public static void main(String[] args) {
		System.out.println("The length of the line l1 is " + lengthl1);
		System.out.println("The length of the line l2 is " + lengthl2);
		obj.compareTo();
	}
}
class Uc4_SUBClass extends Uc4
{
	static void  compareTo(){                                   
		if (lengthl1==lengthl2)
		{
			System.out.println("The two lines are equal");
		}
		else if(lengthl1>=lengthl2)
		{
			System.out.println("The first line is greater than second line");
		}
		else
		{
			System.out.println("The first line is greater than second line");
		}
	}
	static double length1() {                                               
		System.out.println("Enter Details of first line ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point of First line");
		int x1 = sc.nextInt();
		System.out.println("Enter y1 point of First line");
		int x2 = sc.nextInt();
		System.out.println("Enter x2 point of First line");
		int y1 = sc.nextInt();
		System.out.println("Enter y2 point of First line");
		int y2 = sc.nextInt();
		double length1 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		return length1;
	}
	static double length2(){                                          
		System.out.println("Enter Details of second line ");
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x1 point of Second line");
		int x1 = s.nextInt();
		System.out.println("Enter y1 point of Second line");
		int x2 = s.nextInt();
		System.out.println("Enter x2 point of Second line");
		int y1 = s.nextInt();
		System.out.println("Enter y2 point of Second line");
		int y2 = s.nextInt();
		double length2 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		return length2;
	}
}
