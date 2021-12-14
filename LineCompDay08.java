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
				s.close();

				double lenght_of_line = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
				System.out.printf("Length of end point is : "+lenght_of_line);

			}
	}


