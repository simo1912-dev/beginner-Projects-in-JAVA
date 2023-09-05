package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	// Constructor : to prompt user to enter student's name and year

	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextLine();

		setStudentID();
	}

	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	// Method for enrolling in courses

	public void enroll() {
		// We want to get in a loop , where user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance += costOfCourse;
			} else {
				break;
			}

		} while (1 != 0);
	}
	// Method to view the current tuition balance

	public void viewBalance() {
		System.out.println("Balance is: " + tuitionBalance);
	}

	// Method to pay the tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of: " + payment);
		viewBalance();
	}

	// Now the showInfo Method
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID
				+ "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
	}
}
