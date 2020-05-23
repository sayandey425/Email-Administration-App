package emailAdministration;

import java.util.Scanner;

public class EmailAdministration {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Nmae: ");
		String firstname = sc.nextLine();
		System.out.print("\nEnter Last Name: ");
		String lastname = sc.nextLine();
		
		Email e1 = new Email(firstname, lastname);
		
		System.out.println(e1.showInfo());

	}

}
