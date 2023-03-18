package com.jj.School;

public class main {

	public static void main(String[]args) {
		
		//create teacher array
		
		Teacher teacher[]=new Teacher[2];
		
		teacher[0]=new Teacher(1,"vijay",3000);
		teacher[1]=new Teacher(2,"vjayasri",2000);
		
		//create array of students
		
		Student students[]=new Student[4];
		
		students[0]=new Student(1,"varun",'A'); 
		
		students[1]=new Student(2,"keerthy",'B');
		
		students[2]=new Student(3,"suriya",'C');
		
		students[3]=new Student(4,"prabhas",'D');
		
		//create school obj
		
		School school=new School(teacher,students);
		
		//some students pay their fee
		
	students[0].payfees(5000);
	students[1].payfees(1000);
	students[2].payfees(15000);
	
	// // Print updated state of the school
	
    System.out.println("\nState of the school after some students paid their fees:");
    
   school.updateTotalMoneyEarned(students[0].getFeesPaid()+students[1].getFeesPaid()+students[2].getFeesPaid());
   System.out.println("Total money earned: Rs" + school.getTotalMoneyEarned());
    
    System.out.println("Total money spent: Rs" + school.getTotalMoneySpent());
    
    //some teachers receive salary
	
    teacher[0].receiveSalary(teacher[0].getSalary());
		
    teacher[1].receiveSalary(teacher[0].getSalary());
		
	 // Print updated state of the school
    
	 System.out.println("\nState of the school after some teachers received their salaries:");
	 
	 school.updateTotalMoneySpent(teacher[0].getSalaryEarned()+teacher[1].getSalaryEarned());
	 
	  System.out.println("Total money spent: Rs" + school.getTotalMoneySpent());  //6k
	 
	
	
    
	 
     
     
     
     //add a new teacher
     
     Teacher newteacher=new Teacher(3,"anusha",1500);
     
     school.addteacher(newteacher);
     
     //add a student
     
     Student newstudent = new Student(5,"sharukh",'F');	  
     
     school.addStudent(newstudent);		
		
     // Print final state of the school
     
     System.out.println("\nFinal state of the school:");
     
     System.out.println("Total money earned: Rs" + school.getTotalMoneyEarned());
     
     System.out.println("Total money spent: Rs" + school.getTotalMoneySpent());
		
		for(Student stu:students) {
			System.out.println(stu);
		}
		
	}
}
