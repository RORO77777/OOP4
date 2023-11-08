package Roro;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		//base and height
		int base=0;
		int height=0;
		
		int area=0;
		
		Object system;
		Scanner scanner = new Scanner();
		
		System.out.print("Enter the length of the base of the triangle:");
		base= scanner.nextInt();
		System.out.print("Enter the length of the height of the triangle");
		height= scanner.nextInt();
		
		// area= (base * height)/2;
		area= (base * height)/2;
		
		System.out.println("The area of the triangle is:" + area);

	}

}
