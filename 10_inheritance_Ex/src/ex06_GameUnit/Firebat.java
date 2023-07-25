package ex06_GameUnit;

public class Firebat extends GameUnit {
  
  private  final int POWER = 10;
  
  // new Firebat("파이어뱃")
  public Firebat(String name) {
    super(name);  // public GameUnit(String name){} 생성자를 호출한다.
  }

  public int getPOWER() {
    return POWER;
  }
  
  
  @Override
  public void attack(GameUnit other) {
   System.out.println(getName() + "의 공격!");
   if(POWER >= other.getHp()) {
     other.setHp(0);
   }else
     other.setHp(other.getHp() - POWER);
  }
  


}
