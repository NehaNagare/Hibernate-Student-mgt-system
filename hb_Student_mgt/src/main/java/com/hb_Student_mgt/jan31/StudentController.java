package com.hb_Student_mgt.jan31;

import org.hibernate.Session;
public class StudentController {
	
	public void insertStudent() {
		Session senn=MyHb.getHbConf();
		System.out.println("Welcome");
		
		Student s=new Student(4,"Ram","DSBDA",74.00);
		senn.save(s);
		
		System.out.println("Student is ready to insert...");
		senn.beginTransaction().commit();
		System.out.println("Now Student Inserted successfulyyyyyy....");
		
		System.out.println("**********THANK YOU************");
	}

	public void getStudent()
	{
		Session senn=MyHb.getHbConf();
		Student s1=senn.get(Student.class, 1);
		System.out.println("Student Details....");
		System.out.println(s1);
		
	}
	public void updateStudent() {
		Session senn=MyHb.getHbConf();
		Student stdGetDB=senn.get(Student.class, 10);
		String name="Neha";
		String sub="Java Programming";
		double marks=89.00;

		if(stdGetDB!=null) {
			stdGetDB.setName(name);
			stdGetDB.setSub(sub);
			stdGetDB.setMarks(marks);
		senn.update(stdGetDB);
		senn.beginTransaction().commit();
		System.out.println("Update sucessfullyyyy....");
		}else {
			System.out.println("TERA ACCOUNT DELETE HO GAYA HAII..");
			Student std=new Student();
			std.setRollno(5);
			std.setName(name);
			std.setSub(sub);
			std.setMarks(marks);
			
			senn.save(std);
			senn.beginTransaction().commit();
			System.out.println("insert successfully....");
		}
	}
	
	public void deleteStduent() {
		Session senn=MyHb.getHbConf();
		Student std = senn.get(Student.class, 0);
		if(std!=null) {
			senn.delete(std);
			System.out.println("Student deleted successfully...");
		}else {
			System.out.println("Student not found");
		}
	}
	
}

