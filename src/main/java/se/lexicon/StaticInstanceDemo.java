package se.lexicon;

import java.util.Random;

public class StaticInstanceDemo {
  private static int sequencer = 1000;

  //fields
  private int id;
  private String firstName;
  private String lastName;

  public StaticInstanceDemo(String firstName, String lastName) {
    this.id = nextId();
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public static int nextId(){
    return ++sequencer;
  }

  //instance methods

  public void showInformation(){
    System.out.println("id: " + id + " Name: " + getFullName());
  }

  public String getFullName(){
    return  firstName + " " + lastName;
  }

  // write a method that takes a string number and return an int => convert String number to int Number
  public static int convertStringToInt(String number){
    return Integer.parseInt(number);
  }

}
