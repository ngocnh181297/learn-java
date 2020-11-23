package com.ngocnh;

import java.util.ArrayList;
import java.util.List;

import com.ngocnh.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("manhNH");
		s1.setAge(18);
		s1.setPoint(10f);

		Student s2 = new Student();
		s2.setName("ngocNH2");
		s2.setAge(24);
		s2.setPoint(5f);
//		
//		
//		System.out.println("name : " + student.getName());
//		System.out.println("age : " + student.getAge());
//		System.out.println("point : " + student.getPoint());

		List<Student> lstStudent = new ArrayList<Student>();
		lstStudent.add(s1);
		lstStudent.add(s2);
		
		// forEach
		for (Student student : lstStudent) {
			if (student.getPoint() >= 5) {
				System.out.println("name : " + student.getName());
				System.out.println("age : " + student.getAge());
				System.out.println("point : " + student.getPoint());
				System.out.println("=====================================");
			}
		}
		
		// for index
//		for (int i = 0; i < lstStudent.size(); i++) {
//			if (lstStudent.get(i).getPoint() >= 5) {
//				System.out.println("name : " + lstStudent.get(i).getName());
//				System.out.println("age : " + lstStudent.get(i).getAge());
//				System.out.println("point : " + lstStudent.get(i).getPoint());
//				System.out.println("=====================================");
//			}
//		}

	}

}
