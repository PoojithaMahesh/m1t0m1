package manytomanymg.cont;

import java.util.ArrayList;
import java.util.List;

import manytomanymg.dao.Studentdao;
import manytomanymg.dto.Courses;
import manytomanymg.dto.Student;

public class StudentCont {
public static void main(String[] args) {
	Courses courses1=new Courses();
	courses1.setId(101);
	courses1.setCourses("Java");
	courses1.setFees(20000);

	
	
	Courses courses2=new Courses();
	courses2.setId(102);
	courses2.setCourses("Advancejava");
	courses2.setFees(40000);
	
	
	List<Courses> coursesOfRitesh=new ArrayList<Courses>();
	coursesOfRitesh.add(courses1);
	coursesOfRitesh.add(courses2);
	
	
	Courses courses3=new Courses();
	courses3.setId(103);
	courses3.setCourses("html");
	courses3.setFees(60000);
	
	Courses courses4=new Courses();
	courses4.setId(104);
	courses4.setCourses("CSS");
	courses4.setFees(60000);
	
	
	List<Courses> coursesOfBhavesh=new ArrayList<Courses>();
	coursesOfBhavesh.add(courses3);
	coursesOfBhavesh.add(courses4);
	
	
	
	Student student1=new Student();
	student1.setId(1);
	student1.setName("Ritesh");
	student1.setAddress("Mumbai");
	student1.setCourses(coursesOfRitesh);
	
	
	Student student2=new Student();
	student2.setId(2);
	student2.setName("Bhavesh");
	student2.setAddress("Bangalore");
	

	student2.setCourses(coursesOfBhavesh);
	
	List<Student> studentsOfJava=new ArrayList<Student>();
	studentsOfJava.add(student1);
	
	courses1.setStudents(studentsOfJava);
	
	List<Student> studentsOfadvanceJava=new ArrayList<Student>();
	studentsOfadvanceJava.add(student1);
	courses2.setStudents(studentsOfadvanceJava);
	
	
	List<Student> studentofHtml=new ArrayList<Student>();
	studentofHtml.add(student2);
	courses3.setStudents(studentofHtml);
	
	
	List<Student> studentsofCss=new ArrayList<Student>();
	studentsofCss.add(student2);
	courses4.setStudents(studentsofCss);
	
	Studentdao studentdao=new Studentdao();
	studentdao.saveStudent(student1);
	studentdao.saveStudent(student2);
}
}
