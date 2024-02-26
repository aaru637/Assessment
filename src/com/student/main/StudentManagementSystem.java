package com.student.main;

import java.io.IOException;

import com.student.main.controller.TeacherController;

public class StudentManagementSystem {
	public static void main(String[] args) throws IOException {
		new TeacherController().start();
	}
}
