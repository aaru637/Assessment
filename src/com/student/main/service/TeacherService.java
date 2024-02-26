package com.student.main.service;

import java.util.ArrayList;
import java.util.List;

import com.student.main.concrete.Student;
import com.student.main.data.StudentData;

public class TeacherService {
	private StudentData studentData = new StudentData();
	private List<Student> students = new ArrayList<>();
	
	public TeacherService() {
		students = studentData.getStudents();
	}
	
	public Student getHighestMarkStudent() {
		return students.stream().sorted((student1, student2) -> (int)(student2.getTotal() - student1.getTotal())).findFirst().orElse(null);
	}
	
	public Student getLowestMarkStudent() {
		return students.stream().sorted((student1, student2) -> (int)(student1.getTotal() - student2.getTotal())).findFirst().orElse(null);
	}
	
	public void sortStudentsByRank() {
		students.stream().sorted((student1, student2) -> student1.getRank() - student2.getRank()).forEach(System.out::println);
	}
}
