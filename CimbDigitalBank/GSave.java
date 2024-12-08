package CimbDigitalBank;
//Concrete Decorator -- CarWithAC
public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;

    }

    public String showAccountType() {
        return "GSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.025;
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
        return bankAccount.showBenefits() + ", GCash Transfer";
    }
    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }


}

