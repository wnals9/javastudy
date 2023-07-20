package ex04_Singer;

public class Song {

  private String title;
  private String genre;
  private double playTime;
  
  
  // Setter
  public void setTitle(String title) {
    this.title = title;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }
  public void setPlayTime(double playTime) {
    this.playTime = playTime;
  }

  
  // Getter
  public String getTitle() {
    return title;
  }
  public String getGenre() {
    return genre;
  }
  public double getPlayTime() {
    return playTime;
  }
  
  
  
  public void info() {
    System.out.println("제목: " + title + ", 장르: " + genre + ", 재생시간: " + playTime + "분");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
