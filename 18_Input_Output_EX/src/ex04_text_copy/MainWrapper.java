package ex04_text_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainWrapper {

  public static void ex01() {
    
    // 문제1. 다음과 같이 알파벳 대문자가 입력된 C:/storage/alphabet.txt 파일을 만드시오.
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    File file = new File(dir, "alphabet.txt");
    
    FileOutputStream fout = null;
    
    try {
      
      fout = new FileOutputStream(file);
      
      int a ='A';
      
      for(int i = a; i <= 'Z'; i++) {
        fout.write(i);
      }
      
      System.out.println(file.getPath() + " 파일 생성 완료");
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fout != null) fout.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex02() {
    
    // 문제2. C:/storage/alphabet.txt 파일을 복사하여 C:/storage/alphabet2.txt 파일을 만드시오.
    
    // 원본 파일
    File dir1 = new File("C:/storage");
    File src = new File(dir1, "alphabet.txt");
    
    // 원본을 읽는 입력스트림
    BufferedInputStream bin = null;
    
    // 복사본 파일
    File dir2 = new File(dir1.getPath());
    if(dir2.exists() == false) {
      dir2.mkdirs();
    }
    File cp = new File(dir2, "alphabet2.txt");
    
    // 복사본을 만드는 출력스트림
    BufferedOutputStream bout = null;
    
    try {
      
      bin = new BufferedInputStream(new FileInputStream(src));
      
      bout = new BufferedOutputStream(new FileOutputStream(cp));
      
      // 복사 단위
      byte[] b = new byte[1024];
      
      // 실제로 읽는 바이트 수
      int readByte = 0;
      
      while((readByte = bin.read(b)) != -1) {
        bout.write(b, 0, readByte);
      }
      
      System.out.println(src.getPath() + " >>> " + cp.getPath());
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) bout.close();
        if(bin != null) bin.close();
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
    
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
    
  }

}