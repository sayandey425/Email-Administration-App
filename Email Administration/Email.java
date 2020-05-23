package emailAdministration;

import java.util.Scanner;

public class Email {
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private String email;
		private int inboxCapacity = 5;
		private int defaultPassword = 8;
		private String alternateEmail;
		private String college = "hetc.com";
		
//		constructor to receive the FirstName and LastName
		public Email(String firstName, String lastName) {
			this.firstName = firstName ;
			this.lastName = lastName ;
			
			
			
//			display the department
			this.department = Department();
			System.out.println("\nYour Department: " +this.department);
			
//			display the random password
			this.password = randomPassword(defaultPassword);
			System.out.println("Your Password: " +this.password);
			
//			Generate complete Email address
			email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@" +department.toLowerCase() + "." +college;
			System.out.println("Your Mail id: "+email);
			
		}
		
//		Ask for the department
		private String Department() {
			System.out.print("\nDepartment Codes\n1 for EE\n2 for CSE\n3 for ECE\n4 for IT\n5 for CE\n6 for ME\n0 for none\n\nChoose the Department Code from above: ");
			Scanner sc = new Scanner(System.in);
			int dept = sc.nextInt();
			
			if(dept == 1) {
			return "EE" ;
			} else if (dept == 2) {
				return "CSE";
			}else if(dept == 3){
				return "ECE";
			}else if (dept == 4) {
				return "IT";
			}else if (dept == 5) {
				return "CE";
			}else if (dept == 6) {
				return "ME";
			}else {
				return "";
			}
				
			}
		
		
//		Generate random password
		private String randomPassword(int length) {
			String SetPassword = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%" ;
			char [] password = new char[length] ;
			for(int i=0; i<length; i++) {
				int random = (int) (Math.random() * SetPassword.length());	
				password[i] = SetPassword.charAt(random) ;				
				
				}
			return new String(password);
		}
		
//		Set the InboxCapacity
		public void setInboxCapacity (int capacity) {
			this.inboxCapacity = capacity ;
		}
		
//		Set the AlternateEmail
		public void setAlterEmail (String altEmail) {
			this.alternateEmail = altEmail ;
		}
		
//		change password
		public void resetPassword (String resetPass) {
			this.password = password;
		}
		
		public int getInboxCapacity() {
			return inboxCapacity;
			
		}
		public String altEmail() {
			return alternateEmail;
		}
		public String getPassword() {
			return password;
		}
		public String showInfo() {
			return "Full Name: " +firstName+ " " +lastName+ "\nCollege Website: " +college+ "\nInbox Capacity: " +inboxCapacity+ "GB" ;
		}
		
	}


