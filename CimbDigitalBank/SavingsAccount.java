package CimbDigitalBank;
//Concrete Component -- BasicCar
public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private Double balance;

    public SavingsAccount() {
    }
    
    //AccNo
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    
    //AccName
    public String getAccountName(){
        return accountName;
    }
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public Double getBalance(){
        return balance;
    }
    public void setBalance(Double balance){
        this.balance= balance;
    }

    

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    @Override
    public Double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate());
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + "\n" +
               "Account name: " + accountName + "\n" +
               "Balance: " + balance ;
    }
}

