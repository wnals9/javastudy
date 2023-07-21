package ex05_BankAcouunt;

public class BankAccount {

  private Bank bank;
  private String accNo;
  private long balance;
  
  public BankAccount(Bank bank, String accNo, long balance) {
    this.bank= bank;
    this.accNo = accNo;
    this.balance = balance;
  }
  public void info(){
    System.out.println("계좌번호: " + accNo + ", 통장잔액: " + balance + "원");
    System.out.print("개설지점: ");
    bank.info();
  }
  
  
  // 생성자
  public BankAccount() {
    
  }
  
  // Setter
  public void setBank(Bank bank) {
    this.bank = bank;
  }
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  // Getter
  public Bank getBank() {
    return bank;
  }
  public String getAccNo() {
    return accNo;
  }
  public long getBalance() {
    return balance;
  }
  
  
  // 입금 메소드
  public void deposit(long money) {
    if(money <= 0) {
      return;
    }
    balance += money;
  }
  
  // 출금 메소드
  public long withdrawal(long money) {
    long retVal = 0;
    if(money > 0 && balance <= money) {
    balance -= money;
    retVal = money;
  }
  return retVal;
 }
  
  public void transfer(BankMember acc, long money) {
    acc.deposit(withdrawal(money));
  }

}
