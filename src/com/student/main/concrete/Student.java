package com.student.main.concrete;

public class Student {
	private String id;
	private String name;
	private Subjects subjects;
	private int rank;
	private double total;

	

	public Student(String id, String name, Subjects subjects, int rank, double total) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
		this.rank = rank;
		this.total = total;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	public Subjects getSubjects() {
		return subjects;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + ", rank=" + rank + "]";
	}

}
