package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String password;
	private int defaultPasswordLength = 10;
	private String email;
	private String companySuffix = "nttdata.com";

	// We will be needing a constructor first
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;


		
		// Calling a method asking for the department - return the department

		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// calling a method that returns a random password

		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + password);

		// Comnine elemenmts to generate an email

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;

	}


	// Ask for the department
	private String setDepartment() {
		System.out.println(
				"Depatment Codes\n1 for Sale\n2 for Development\n3 for Accounting\n0 for none\nEnter depatment code");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "dev";
		} else if (depChoice == 3) {
			return "Acct";
		} else {
			return "";
		}

	}

	// Createin a method to set a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789+*?!@";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}
		return new String(password);
	}


	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	public int getMailboxCapacity() {
		return mailBoxCapacity;
	}


	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void changePassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	// Set the mailBox capacity

	// Find an alternate Email

	// Change the password
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + "Company Email: " + email + "Mailbox capacity; "
				+ mailBoxCapacity + "mb";
	}

}
