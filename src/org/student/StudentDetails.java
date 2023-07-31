package org.student;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int StudentId=S.nextInt();
		System.out.println("Enter Student Name :");
		String name=S.next();
		System.out.println("Enter Mark1 :");
		int Mark1=S.nextInt();
		System.out.println("Enter Mark2 :");
		int Mark2=S.nextInt();
		System.out.println("Enter Mark3 :");
		int Mark3=S.nextInt();
		System.out.println("Enter Mark4 :");
		int Mark4=S.nextInt();
		System.out.println("Enter Mark5 :");
		int Mark5=S.nextInt();
		
		System.out.println("\n\nSTUDENT DETAILS\n=============");
		System.out.println("Student Id   :" +StudentId);
		System.out.println("Student Name :" +name);
		System.out.println("Mark1        :" + Mark1);
		System.out.println("Mark2        :" + Mark2);
		System.out.println("Mark3        :" + Mark3);
		System.out.println("Mark4        :" + Mark4);
		System.out.println("Mark5        :" + Mark5);

		int Total=Mark1+Mark2+Mark3+Mark4+Mark5;
		System.out.println("TotalMarks   :" + Total);
		int Average=Total/5;
		System.out.println("AverageMark  :" + Average);

	}
}
