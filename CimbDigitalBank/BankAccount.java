package CimbDigitalBank;
// Component Interface -- Car
public interface BankAccount {
    String showAccountType();
    Double getInterestRate();
    Double getBalance();
    String showBenefits(); //double UMl but should be string
    Double computeBalanceWithInterest();
    String showInfo();

}
