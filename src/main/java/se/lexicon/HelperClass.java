package se.lexicon;

import java.util.Random;

public class HelperClass {


  public static int generateRandomNumber(){
    Random random= new Random();
    int result = random.nextInt();
    return result;
  }

  public static double generateRandomNumberNew(){
    return Math.random();
  }


}
