package com.student.main.concrete;

public class Subjects {
	private String id;
	private double language1;
	private double language2;
	private double language3;
	private double socialStudies;
	private double maths;
	private double science;

	public Subjects(String id, double language1, double language2, double language3, double socialStudies, double maths,
			double science) {
		super();
		this.id = id;
		this.language1 = language1;
		this.language2 = language2;
		this.language3 = language3;
		this.socialStudies = socialStudies;
		this.maths = maths;
		this.science = science;
	}

	public String getId() {
		return id;
	}

	public double getLanguage1() {
		return language1;
	}

	public double getLanguage2() {
		return language2;
	}

	public double getLanguage3() {
		return language3;
	}

	public double getMaths() {
		return maths;
	}

	public double getScience() {
		return science;
	}

	public double getSocialStudies() {
		return socialStudies;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLanguage1(double language1) {
		this.language1 = language1;
	}

	public void setLanguage2(double language2) {
		this.language2 = language2;
	}

	public void setLanguage3(double language3) {
		this.language3 = language3;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public void setScience(double science) {
		this.science = science;
	}

	public void setSocialStudies(double socialStudies) {
		this.socialStudies = socialStudies;
	}

	@Override
	public String toString() {
		return "Subjects [id=" + id + ", language1=" + language1 + ", language2=" + language2 + ", language3="
				+ language3 + ", socialStudies=" + socialStudies + ", maths=" + maths + ", science=" + science + "]";
	}

}
