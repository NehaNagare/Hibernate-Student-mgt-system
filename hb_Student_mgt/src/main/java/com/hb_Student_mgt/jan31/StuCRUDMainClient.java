package com.hb_Student_mgt.jan31;

import java.util.Scanner;

public class StuCRUDMainClient {

	public static void main(String[] args) {
		StudentController controller=new StudentController();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("Choose option");
			
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				controller.insertStudent();
				break;
			case 2:
				controller.getStudent();
				break;
			case 3:
				controller.updateStudent();
				break;
			case 4:
				controller.deleteStduent();
				break;
			case 5:
				System.exit(choice);
			}
		}
	}
}
