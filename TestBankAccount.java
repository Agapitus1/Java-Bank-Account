
import java.util.*;

class TestBankAccount
{
    BankAccount account;

        TestBankAccount()
        {        
        account = new BankAccount(500);
        
        // Perform a deposit
        account.deposit(150.0);
        
        // Calculate the interest due
        double interest = account.calcInterest();

        // Display the interest due         
        System.out.println("The interest due on your account is: $" + interest);
        
        // Deposit the interest - NOTE: we can use a variable as an argument
        account.deposit(interest);
        
        // Disply the final balance
        account.displayBalance();

      // Call startDeposit()

      account.startDeposit();
      
      account.addBonus(125);




     





    }

    

void findLargest()
    {
        int a=0, b=0, c=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter three doubles: ");

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a > b)
        {
            if (a > c)
                System.out.println("Largest is " + a);
            else
                System.out.println("Largest is " + c);
        }
        else
        {
            if (b > c)
                System.out.println("Largest is " + b);
            else
                System.out.println("Largest is " + c);
        }
    }
}
