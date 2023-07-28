package ex08_Bakery;

import java.util.Map;

public class Customer {
  
  private int count;  // 빵을 몇 개 샀는가?
  private int money;     // 돈을 얼마 가지고 있는가?

  
  public Customer(int money) {
    this.money = money;
  }
  
  public int getCount() {
    return count;
  }
  public int getMoney() {
    return money;
  }
  
  /**
   * * 구매 메소드<br>
   * Bakery에서 빵을 구매하는 메소드이다.<br>
   * 어떤 Bakery에서 살 것인지, 몇 개의 빵을 살 것인지, 얼마를 낼 것인지 전달 받는다.
   * Bakery 클래스의 판매 메소드(sell)를 이용해서 구현한다.
   * @param bakery 빵을 구매할 Bakery
   * @param count 구매할 빵의 갯수
   * @param money 구매할 때 낸 돈
   */
  public void buy(Bakery bakery, int count, int money) {
    // bakery에 count와 money를 전달하고 빵과 잔돈을 받는다.
    Map<String, Integer> map = bakery.sell(count, money);
    
    // 가진 돈이 부족하다.
    if(this.money < count * bakery.PRICE) {
      System.out.println("구매 불가합니다.(가진 돈 부족)");
       return;
    }
    
    // 구매 처리
    if(map != null) {  // bc가 null이 아닐때만 처리
    this.count += map.get("bread");   // 빵 3개 받기
    this.money -= money;           // 10000원 내고,
    this.money += map.get("change");  // 4000원 받기
  }
  } 
}
  
