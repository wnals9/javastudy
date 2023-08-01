package ex03_Bakery;

public class MainWrapper {

  
  public static void main(String[] args) {
    try {
      Bakery bakery = new Bakery(100, 10000);  // 빵이 100개, 빵 가격 1000원, 빵집에 10000원 있음
      
      Customer customer = new Customer(10000);  // 빵 0개, 10000원을 가진 고객
      
      customer.buy(bakery, -1, 10000);  
      
      System.out.println("빵집 money: " + bakery.getMoney() + "원"); 
      System.out.println("빵집 빵: " + bakery.getCount() + "개");
      
      System.out.println("고객 money: " + customer.getMoney() + "원");  
      System.out.println("고객 빵: " + customer.getCount() + "개");  
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }    
  }
}  
