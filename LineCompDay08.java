package com.linecompday08;
import java.util.Scanner;
public class LineCompDay08 {
		public static void main(String[] args) {
			System.out.println("Welcome to the line comparison program");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter x co-ordinate of first point: ");
			int x1 = s.nextInt();
			System.out.println("Enter y co-ordinate of first point: ");
			int y1 = s.nextInt();
			System.out.println("Enter x co-ordinate of second point: ");
			int x2 = s.nextInt();
			System.out.println("Enter y co-ordinate of second point: ");
			int y2 = s.nextInt();

			System.out.println("Enter x co-ordinate of third point: ");
			int p1 = s.nextInt();
			System.out.println("Enter y co-ordinate of third point: ");
			int q1 = s.nextInt();
			System.out.println("Enter x co-ordinate of forth point: ");
			int p2 = s.nextInt();
			System.out.println("Enter y co-ordinate of forth point: ");
			int q2 = s.nextInt();

			Double length_of_line1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			Double length_of_line2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
			
			System.out.printf("length of 1st end points are : %.2f %n", length_of_line1);
			System.out.printf("length of 2nd end points are : %.2f %n", length_of_line2);
			int comp = length_of_line1.compareTo(length_of_line2);
			if(comp > 0)
				System.out.println("Length of first end points is greater than length of second end points");
			else if(comp < 0)
				System.out.println("Length of first end points is less than length of second end points");
			else
				System.out.println("Both lines are equal.");
		}
	}

