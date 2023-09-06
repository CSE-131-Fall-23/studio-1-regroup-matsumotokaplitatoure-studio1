package studio1;

import java.util.Scanner;

public class Leapyear_class {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please give me a year"); 
		int year = in.nextInt();
		boolean leapyear = (year%4 ==0)&&((year%100!=0))||(year%400==0);
		System.out.println(year + " is a leapyear " + "is " + leapyear);
	}

}
