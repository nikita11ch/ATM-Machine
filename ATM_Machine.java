//ATM Machine in Java using Classes and Objects
import java.util.Scanner;
class ATM
{
    float balance;
    int pin = 1234;
    
    public void checkPin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your pin : ");
        int enteredPin=sc.nextInt();
        if(enteredPin == pin)
        {
            menu();
        }
        else
        {
            System.out.print("Enter a valid pin");
            menu();
        }
    }
    
    public void menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        System.out.println();
        System.out.print("Enter Your Choice : ");
        int opt = sc.nextInt();
        if(opt == 1)
        {
            checkBalance();
        }
        
        else if(opt == 2)
        {
            withDrawMoney();
        }
        
        else if(opt == 3)
        {
            depositMoney();
        }
        
        else if(opt == 4)
        {
            System.out.println("Thanks For Visiting!");
            return;
        }
        
        else
        {
            System.out.println("Enter a valid choice");
        }   
    }
    
    public void checkBalance()
    {
        System.out.println("Balance : "+balance);
        menu();
    }
    
    public void withDrawMoney()
    {
        System.out.print("Enter Amount to Withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance -= amount;
            System.out.println("Money Withdraw Successful. Total Balance : "+balance);
        }
        menu();
    }
    
    public void depositMoney()
    {
        System.out.println("Enter the Amount to Deposit : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance +=amount;
        System.out.println("Money Deposited Successfully. Total Balance : "+balance);
        menu();
    } 
}

public class ATM_Machine
{
    public static void main(String []args)
    {
        ATM obj = new ATM();
        obj.checkPin();
    } 
}
