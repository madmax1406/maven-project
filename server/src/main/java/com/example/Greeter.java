package com.example;

/**
 * This is a class.
 */
public class Greeter {

   public static void main(String[] args) {
    Greeter greeter = new Greeter();
    System.out.println(greeter.greet("World"));
  }

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
