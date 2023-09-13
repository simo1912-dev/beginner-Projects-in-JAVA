package banking.app;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();

		/*
		 * Checking chkacc1 = new Checking("Tom Wilson", "32345678", 1500);
		 * 
		 * Savings savacc1 = new Savings("Rich Lowe", "4348485865", 2500);
		 * savacc1.compound();
		 * 
		 * savacc1.showInfo(); chkacc1.showInfo();
		 */


		// Read a csv file then create new accounts based on that data
		String file = "/Users/air/Downloads/NewBankAccounts.csv";
		List<String[]> newAccountHolders = Utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[1];
			String sSN = accountHolder[2];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("Error reading account Type");
			}
		}
		for (Account acc : accounts) {
			System.out.println("\n*********");
			acc.showInfo();
		}

	}

}
