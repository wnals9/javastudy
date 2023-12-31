package ex01_is_a;


/*
 * 상속
 * 1. 다른 클래스의 기능(메소드)을 물려 받아서 사용할 수 있는 기능이다.
 * 2. 다음 관계가 있는 클래스들을 상속 관계로 만들 수 있다.
 *    1) is a  관계 : ~은 ~이다.
 *    2) has a 관계 : ~ 은 ~을 가지고 있다.
 */

/*
 * is a 관계
 * 1. 상속 관계로 만들 수 있는 대표적인 관계이다.
 * 2. 예시
 *    Student is a Person. (학생은 사람이다.)
 * 3. 개념
 *    자식클래스 is a 부모클래스
 */

/*
 * 부모 클래스
 * 1. 자식 클래스에게 기능(메소드)를 제공한다.
 * 2. 슈퍼 클래스(super)라고 한다. (위)
 * 
 * 자식 클래스
 * 1. 부모 클래스의 기능(메소드)을 자신의 것처럼 사용할 수 있다.
 * 2. 서브 클래스(sub)라고 한다. (아래)
 */

/*
 * 상속 관계 도식
 *  ┌--------------┐
 *  │    Person    │ 슈퍼 클래스
 *  │--------------│
 *  │     eat()    │
 *  │    sleep()   │
 *  └--------------┘
 *          ▲
 *          │
 *          │
 *  ┌--------------┐
 *  │    Student   │ 서브 클래스
 *  │--------------│
 *  │    study()   │
 *  └--------------┘
 */


public class Student extends Person {

  public void study() {
    System.out.println("공부");
  }
  
  
}
