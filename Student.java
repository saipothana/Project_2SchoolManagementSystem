package com.jj.School;

public class Student {

	private int id;
	private String name;
	private char grade;
	private double feespaid;
	private double totalfees;
	public Student(int id, String name, char grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feespaid=0;
		this.totalfees=30000;
		
		
	}
	
	public void setGrade(char grade) {
		this.grade=grade;
	}
	
	public void payfees(double fees) {
		this.feespaid+=fees;
	
	}
	
	  public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public char getGrade() {
	        return grade;
	    }

	    public double getFeesPaid() {
	        return feespaid;
	    }

	    public double getFeesTotal() {
	        return totalfees;
	    }
	
	    public double getRemainingfees() {
	    	return totalfees-feespaid;
	    }
	    
	    @Override
	    public String toString() {
	        return "Student's name: " + name + ", Total fees paid so far: $" + feespaid;
	    }
	
}
