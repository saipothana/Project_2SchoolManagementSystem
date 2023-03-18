package com.jj.School;

import java.util.Arrays;

public class School {

	private Teacher[] teachers;
	private Student[] students;
	private double totalMoneyEarned;
	private double totalMoneySpent;
	
	
	public School(Teacher[] teachers, Student[] students) {
		this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
	}





	 





	public Teacher[] getTeachers() {
        return teachers;
    }
	
	
	
	
	
	public void addteacher(Teacher teacher) {
		
		Teacher t[]=new Teacher[teachers.length+1];
		
		for(int i=0;i<teachers.length;i++) {
			t[i]=teachers[i];
		}
		t[t.length-1]=teacher;
		teachers=t;
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }
	
	public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

	
    public void updateTotalMoneyEarned(double moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }
    
	

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(double moneySpent) {
        totalMoneySpent += moneySpent;
    }

	
}
