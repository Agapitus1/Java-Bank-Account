# Java-Bank-Account

# BANKACCOUNT CLASS!

The user is required to enter their username and 4 digit PIN number to login:

void getLoginInfo()
{
	Scanner in = new Scanner(System.in);
	System.out.println(“Please enter your username:”);
	String username = in.next();
	System.out.println(“Please enter your PIN:”);
	int pin = in.nextInt();
	// Continue login process... Check details etc
}

Write a procedure with the header
	void startDeposit() which asks the user for the amount they wish to deposit into their account.  The amount is then added to the balance of the account (balance is a class attribute of BankAccount).




