package banking.app;

public class Savings extends Account {

	// List properties for saving account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;

	// Constructor to initialize settings for the savings properties

	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getBaseRate() - .25;

	}

	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	// List any methods specific to savings account
	public void showInfo() {
		super.showInfo();
		System.out.println(

				" Your Savings Account Features" + "\n Safety Deposit Box ID: " + safetyDepositBoxID
						+ "\n Safety Deposit Box Key: " + safetyDepositBoxKey);

	}


}