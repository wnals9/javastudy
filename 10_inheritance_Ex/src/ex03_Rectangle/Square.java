package ex03_Rectangle;

public class Square extends Rectangle {
  
  // new Square()
  public Square() {
    super();
  }

  // new Square(6)
  public Square(int width) {
    // new Rectangle(6, 6)
    super(width, width);
  }
}
