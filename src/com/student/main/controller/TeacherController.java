package com.student.main.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.main.service.TeacherService;

public class TeacherController {
	private TeacherService teacherService = new TeacherService();
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public void start() throws IOException {
		do {
			System.out.println(
					"1.Generate Highest Mark Student Details.\n2.Generate Lowest Mark Student Details.\n3.Sort the Students by Rank.\n");
			System.out.print("Enter your choice : ");
			switch (Integer.parseInt(reader.readLine())) {
			case 1: {
				System.out.println(teacherService.getHighestMarkStudent());
				break;
			}
			case 2: {
				System.out.println(teacherService.getLowestMarkStudent());
				break;
			}
			case 3: {
				teacherService.sortStudentsByRank();
				break;
			}
			default:
				System.out.println("Enter valid choice...");
			}
			System.out.println("Enter 'y' or 'Y' to continue : ");
		} while (reader.readLine().toLowerCase().charAt(0) == 'y');
	}
}
