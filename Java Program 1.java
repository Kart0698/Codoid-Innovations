//Java Program 1
//Write a Java program to create and throw custom exception


import java.util.Scanner;

public class NotEligibleForExamException extends Exception {
  @Override
  public String getMessage() {
    return "waste fellow...come next semester";
    
  }
}

public class MainClass {
  public static void main(String[] args) throws NotEligibleForExamException {
  
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Attendance");	
     int att = sc.nextInt();
     if(att>=85) {
      System.out.println("You can write exams");
     }
     
     else {
      throw new NotEligibleForExamException();
     }	 
	
  }
}
