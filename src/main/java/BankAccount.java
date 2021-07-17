public class BankAccount {

    String custName;
    String custAddress;
    String accountNo;
    String accountType;
    double ckgBalance;
    double svgBalance;
    int atmPIN;
    int checks;
    String loanStatus;

    public BankAccount() {

    }

    public BankAccount(String custName,
                       String custAddress,
                       String accountNo,
                       String accountType,
                       double balance,
                       int atmPIN,
                       int checks) {
        this.custName = custName;
        this.custAddress = custAddress;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.ckgBalance = balance;
        this.atmPIN = atmPIN;
        this.checks = checks;
    }

    public double deposit(double amount) {
        if(amount != 0.0) {
            this.ckgBalance = this.ckgBalance + amount;
        }
        return this.ckgBalance;
    }

    public double withdraw(double amount) {
        if(amount != 0.0) {
            this.ckgBalance = this.ckgBalance - amount;
        }
        if(this.ckgBalance < 100) {
            System.out.println();
            System.out.println("*** Low Balance Alert ***");
        }
        return this.ckgBalance;
    }

    public void transferFromCkg(double amount) {
        this.svgBalance = this.svgBalance + amount;
        this.ckgBalance = this.ckgBalance - amount;
    }

    public void transferToCkg(double amount) {
        this.ckgBalance = this.ckgBalance + amount;
        this.svgBalance = this.svgBalance - amount;
    }

    public void wire(BankAccount otherBank, double amount) {
        otherBank.ckgBalance = otherBank.ckgBalance + amount;
        this.ckgBalance = this.ckgBalance - amount;
        if(this.ckgBalance < 100) {
            System.out.println();
            System.out.println("*** Low Balance Alert ***");
        }
    }

    public String getCustName() {
        return this.custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getCkgBalance() {
        accountType = "Checking";
        System.out.println(accountType);
        System.out.println(this.ckgBalance);
        return this.ckgBalance;
    }

    public void setCkgBalance(double ckgBalance) {
        this.ckgBalance = ckgBalance;
    }

    public double getSvgBalance() {
        accountType = "Savings";
        System.out.println(accountType);
        System.out.println(this.svgBalance);
        return this.svgBalance;
    }

    public void setSvgBalance(double svgBalance) {
        this.svgBalance = svgBalance;
    }

    public int getAtmPIN() {
        return atmPIN;
    }

    public void setAtmPIN(int atmPIN) {
        this.atmPIN = atmPIN;
    }

    public int getChecks() {
        return checks;
    }

    public void setChecks(int checks) {
        this.checks = checks;
    }

    public void addChecks(int noOfChecks) {
        this.checks = this.checks + noOfChecks;
        System.out.println(noOfChecks + " checks added.");
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        // "Application Not Received"
        // "Received, In Review"
        // "Accepted"
        // "Denied"
        this.loanStatus = loanStatus;
    }
}
