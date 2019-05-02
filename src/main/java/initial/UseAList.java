package initial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UseAList {
  public static void breakList(List/*<String>*/ l) {
    l.add(0, LocalDate.now());
  }
  public static void main(String[] args) {
    List<String> names = new ArrayList();
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");

//    names.add(0, LocalDate.now());
    breakList(names);
    System.out.println("First name is " + names.get(0));
//    String s = (String)names.get(0);
    String s = names.get(0);
  }
}
