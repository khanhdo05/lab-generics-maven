package edu.grinnell.csc207.util.predicates;

import edu.grinnell.csc207.util.Predicate;

public class SmallObject implements Predicate<Object> {
  public static final SmallObject PRED = new SmallObject();

  private SmallObject() {
  }

  public boolean holds(Object obj) {
    String converted = obj.toString();
    return (converted.length() < 5);
  }
}
