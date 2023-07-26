package ex10_Walkable;

public class Person implements Walkable {
  
  public void foodFeed(Pet pet, String food) {
    System.out.println(pet + "에게 " + food + "주기");
  }
  public void walk(Walkable pet) {
    System.out.println(pet + "와 산책하기");
  }

}
