package ex04_Singer;

public class Singer {

  private String name;
  private Song titlesong;
  
  
  public void setName(String name) {
    this.name = name;
  }
  public void setTitleSong(Song titlesong) {
    this.titlesong = titlesong;
  }
  
  
  public void info() {
    System.out.println("이름: " + name);
    titlesong.info();
  }
  
  
  
}
