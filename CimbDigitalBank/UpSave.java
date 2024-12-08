package CimbDigitalBank;
//Concrete Decorator -- CarWithGPS
public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;

    }

    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.04;
    }
    
    public Double getBalance(){
        return bankAccount.getBalance();
    }

    @Override
    public Double computeBalanceWithInterest() {
        double balance = bankAccount.getBalance();
        return balance + (balance * getInterestRate());
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }
    
    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }


    
}
