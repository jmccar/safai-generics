package shopping;

// class specs come first, if you have any :)
public class ClothingPair<E extends Object & Sized & Colored/*, String*/> extends Pair<E> {
//  private java.lang.String x = "Hello";

  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean matched() {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }
}
