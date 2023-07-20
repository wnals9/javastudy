package ex05_BankAcouunt;

public class Bank {

  private String bank;
  private String number;
  
  public Bank(String bank, String number) {
    this.bank = bank;
    this.number = number;
  }
  
  
 
  
  public void info() {
    System.out.println(bank + "(" + number + ")" );
  }
  
}
