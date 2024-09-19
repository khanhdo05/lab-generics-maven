package edu.grinnell.csc207.util;

public class Box<T> {
  private T val;
  // constructor
  public Box(T _val) {
    this.val = _val;
  }

  // a mutator - set
  public void set(T newVal) {
    this.val = newVal;
  }

  // an observer - get
  public T get() {
    return this.val;
  }
}
