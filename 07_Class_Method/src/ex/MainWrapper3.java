package ex;

import java.util.Arrays;

public class MainWrapper3 {
  
  public static void ex01(int[] a) {
    System.out.println(Arrays.toString(a));
    a[0] = 100;
    System.out.println("ex01의 배열 a = " + Arrays.toString(a));
  }
  
  public static void main(String[] args) {
    int[] a = {10, 20, 30};
    ex01(a);
    System.out.println("main의 배열 a = " + Arrays.toString(a));
  }
 // 배열은 참조타입이기 때문에 ex01 메소드에서 수정하면 main 메소드에서도 수정된다.(참조값이 같기때문)
}
