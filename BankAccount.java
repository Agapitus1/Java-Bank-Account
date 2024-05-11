import java.util.*;

class BankAccount
{
    final double INTEREST_RATE = 0.1;    

    double balance; // class attribute

    BankAccount(double theBalance) // BankAccount constructor 
    {
        // Initialise class attributes
        balance = theBalance;
    }

	// deposit is a procedure method, parameter amount
    void deposit(double amount)
    {
        balance = balance + amount;
    }

    double calcInterest()
    {
        double interest = balance * INTEREST_RATE;// local variable interest
        return interest;
    }

    void displayBalance()
    {
 System.out.println("The balance of your account is now: " + balance);
    }

    void withdraw(double amount) // parameter amount
    {
        balance = balance - amount;
    }
    
    void getLoginInfo()
    {
        Scanner in = new Scanner(System.in);
        // Prompt
        System.out.println("Please enter your username:");
        // Read input
        String username = in.next(); // local variable username
        System.out.println("Please enter your PIN:");
        int pin = in.nextInt();// local variable pin
        // Continue login process... Check details etc
    }



    void startDeposit()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the deposit amount: ");
        double amount = scan.nextDouble();
        //add amount to balance of the acc
        //balance = balance + amount;
        deposit(amount); //use last deposit already written
    }
    
    void addBonus(double amount)
    {
        if(balance > 5000)
        {
            deposit(amount);
        }
    }

    
    void addInterest()
    {
        if(balance >= 10000)
        {
            //add 10% bonus
            deposit(balance * 0.1);
        }
        else if(balance >=5000)
        {
            deposit(balance * 0.05);
        }
        else if(balance >= 100 && balance < 5000)
        {
            deposit(balance * 0.01);
        }
    }
}
