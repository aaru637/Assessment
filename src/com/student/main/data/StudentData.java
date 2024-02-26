package com.student.main.data;

import java.util.ArrayList;
import java.util.List;

import com.student.main.concrete.Student;
import com.student.main.concrete.Subjects;

public class StudentData {
	private static List<Student> students = new ArrayList<>(List.of(
			new Student("613520104008", "Dhineshkumar D",
					new Subjects("613520104008", 92.0, 91.0, 88.0, 96.0, 99.0, 80.0), 1, 91.0),
			new Student("613520104009", "Ganeshkumar M",
					new Subjects("613520104008", 91.0, 92.0, 98.0, 88.0, 80.0, 90.0), 2, 89.83),
			new Student("613520104010", "Vigneshkumar M",
					new Subjects("613520104008", 90.0, 93.0, 89.0, 65.0, 89.0, 93.0), 4, 86.5),
			new Student("613520104011", "Sathishkumar M",
					new Subjects("613520104008", 90.0, 91.0, 76.0, 76.0, 98.0, 99.0), 3, 88.3),
			new Student("613520104012", "Ishwarya C", new Subjects("613520104008", 93.0, 89.0, 56.0, 88.0, 76.0, 76.0),
					6, 79.67),
			new Student("613520104013", "Sindhu S", new Subjects("613520104008", 91.0, 78.0, 89.0, 99.0, 80.0, 58.0), 5,
					82.5)));

	public Student getStudent(String id) {
		return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
	}

	public List<Student> getStudents() {
		return students;
	}
}
