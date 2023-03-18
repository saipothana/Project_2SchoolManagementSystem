package com.jj.School;

public class Teacher {

	private int id;
	private String name;
	private double salary;
	private double salaryearned;
	public Teacher(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryearned = 0;
	}
	
	  public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }
	    
	    public void receiveSalary(double salary) {
	        salaryearned += salary;
	    }

	    public double getSalaryEarned() {
	        return salaryearned;
	    }

	    @Override
	    public String toString() {
	        return "Teacher's name: " + name + ", Total salary earned so far: $" + salaryearned;
	    }
	
	
	
}
