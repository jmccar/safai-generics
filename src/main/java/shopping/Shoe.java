package shopping;

// class specs come first :)
public class Shoe extends Object implements Colored, Sized{
  private int size;
  private String color;

  public Shoe(int size, String color) {
    this.size = size;
    this.color = color;
  }

  @Override
  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Shoe{" +
        "size=" + size +
        ", color='" + color + '\'' +
        '}';
  }
}
