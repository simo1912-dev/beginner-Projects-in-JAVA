package banking.app;

public class Checking extends Account {

	// List of properties specific for saving account
	int debitCardNumber;
	int debitCardPIN;

	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();

	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;

	}


	// List any methods specific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));

	}
	public void showInfo() {
		super.showInfo();

		System.out.println("Your checking Account feature" +

				"\n Debit Card Number: " + debitCardNumber + "\n Debit Card PIN: " + debitCardPIN

		);

	}

}
