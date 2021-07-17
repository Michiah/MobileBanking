import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        String custName;
        String custAddress;
        String accountNo;
        String accountType;
        double ckgBalance;
        double svgBalance;
        int atmPIN;
        int newPIN;
        int checks;
        int noOfChecks;

        double amount;
        double transferFromAmount;
        String verify;
        String correctedName;
        String correctedAddress;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        custName = scanner.next();
        System.out.print("Enter customer address: ");
        custAddress = scanner.next();
        System.out.print("Enter how much is initially deposited: ");
        ckgBalance = scanner.nextDouble();
        System.out.print("\n");

        BankAccount bankAccount = new BankAccount(custName,custAddress,"123456","Checking",ckgBalance,1234,100);

        System.out.println("New account added....");
        System.out.println("Customer name: " + bankAccount.custName);
        System.out.println("Customer address: " + bankAccount.custAddress);
        System.out.println("Customer account number: " + bankAccount.accountNo);
        System.out.println("Type of account opened: " + bankAccount.accountType);
        System.out.println("Opening Account balance: " + bankAccount.ckgBalance);
        System.out.println("Temporary ATM pin generated: " + bankAccount.atmPIN);
        System.out.println("Number of starter checks: " + bankAccount.checks);
        System.out.println();
        System.out.print("Is this information correct? (Y/N): ");
        verify = scanner.next();
        if(verify.equals("N")) {
            System.out.print("Is name correct? (Y/N): ");
            verify = scanner.next();
            if(verify.equals("N")) {
                System.out.print("Enter name again: ");
                correctedName = scanner.next();
                bankAccount.setCustName(correctedName);
                System.out.println("Name has been corrected to: " + bankAccount.getCustName());
            }
            System.out.print("Is the address correct? (Y/N): ");
            verify = scanner.next();
            if(verify.equals("N")) {
                System.out.print("Enter address again: ");
                correctedAddress = scanner.next();
                bankAccount.setCustAddress(correctedAddress);
                System.out.println("The address has been corrected to: " + bankAccount.getCustAddress());
            }
            System.out.println();
            System.out.println("Updated info...");
            System.out.println("Customer name: " + bankAccount.custName);
            System.out.println("Customer address: " + bankAccount.custAddress);
            System.out.println("Customer account number: " + bankAccount.accountNo);
            System.out.println("Type of account opened: " + bankAccount.accountType);
            System.out.println("Opening Account balance: " + bankAccount.ckgBalance);
            System.out.println("Temporary ATM pin generated: " + bankAccount.atmPIN);
            System.out.println("Number of starter checks: " + bankAccount.checks);
            System.out.println();
        }
        System.out.println();
        System.out.print("Your ATM pin is temporary, enter a new pin: ");
        atmPIN = scanner.nextInt();
        bankAccount.setAtmPIN(atmPIN);
        System.out.println("Your new ATM PIN is : " + bankAccount.getAtmPIN());
        System.out.println();
        System.out.print("How many additional checks would you like to add to your account: ");
        noOfChecks = scanner.nextInt();
        bankAccount.addChecks(noOfChecks);
        System.out.println("Total number of checks for your account: " + bankAccount.checks);
        System.out.println();
        System.out.print("Enter an amount to deposit: ");
        amount = scanner.nextDouble();
        System.out.println("Amount deposited: " + amount);
        bankAccount.ckgBalance = bankAccount.deposit(amount);
        System.out.print("New balance (checking): " + bankAccount.ckgBalance);
        System.out.println();
        System.out.print("Enter an amount to withdraw: ");
        amount = scanner.nextDouble();
        System.out.println("Amount withdrawn: " + amount);
        bankAccount.ckgBalance = bankAccount.withdraw(amount);
        System.out.print("New balance (checking): " + bankAccount.ckgBalance);
        System.out.println();
        System.out.print("Enter an amount to transfer to Savings account: ");
        transferFromAmount = scanner.nextDouble();
        bankAccount.transferFromCkg(transferFromAmount);
        System.out.println("New balance (checking) after transfer: " + bankAccount.ckgBalance);
        System.out.println("New balance (savings) after transfer: " + bankAccount.svgBalance);
        System.out.println();
        BankAccount newBankBankAccount = new BankAccount();
        newBankBankAccount.setAccountNo("654321");
        System.out.println("Attempting to wire to Bank #2, account# " + newBankBankAccount.getAccountNo() + "...");
        System.out.print("Enter an amount to wire to " + newBankBankAccount.accountNo + ": ");
        amount = scanner.nextDouble();
        bankAccount.wire(newBankBankAccount, amount);
        System.out.println("New balance (checking account #1), account# " + bankAccount.accountNo + ", after wire transfer: " + bankAccount.ckgBalance);
        System.out.println("New balance (checking account #2), account# " + newBankBankAccount.accountNo + ", after wire transfer: " + newBankBankAccount.ckgBalance);
        System.out.println();
        bankAccount.setLoanStatus("Received, In Review");
        System.out.println("We see you have submitted an application for a loan...");
        System.out.println("The status of your loan application is: ");
        System.out.println(bankAccount.getLoanStatus());
        System.out.println();
        Bank bank1 = new Bank();
        bank1.setBankName("TD Bank");
        bank1.setBranchLocation("100 French Street");
        Bank bank2 = new Bank();
        bank2.setBankName("TD Bank");
        bank2.setBranchLocation("200 Wilson Boulevard");
        Bank bank3 = new Bank();
        bank3.setBankName("TD Bank");
        bank3.setBranchLocation("300 Ayers Avenue");
        System.out.println("Other branch locations...");
        System.out.println(bank1.getBankName());
        System.out.println(bank1.getBranchLocation());
        System.out.println();
        System.out.println(bank2.getBankName());
        System.out.println(bank2.getBranchLocation());
        System.out.println();
        System.out.println(bank3.getBankName());
        System.out.println(bank3.getBranchLocation());
    }
}
