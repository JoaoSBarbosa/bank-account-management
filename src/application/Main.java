package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account ac;
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?");
		char cond = sc.next().charAt(0);
		
		if(cond == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			ac = new Account(account,holder,deposit);
		}else {
			ac = new Account(account,holder);
		}
		
		
		System.out.println();
		System.out.println("Account data: \n"+ac);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		ac.addDeposit(sc.nextDouble());
		System.out.println("Updated account data: \n"+ac);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		ac.withdrawFunds(sc.nextDouble());
		System.out.println();
		System.out.println("Updated account data: \n"+ac);
		sc.close();

	}

}
