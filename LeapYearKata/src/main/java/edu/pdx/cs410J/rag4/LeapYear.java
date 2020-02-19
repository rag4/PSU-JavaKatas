package edu.pdx.cs410J.rag4;

/**
 * This class is represents a <code>LeapYear</code>.
 */                                                                                 
public class LeapYear {
   private final int year; // user sampled year input
   private int isLeapYear; // flag that determines if sample year is a Leap Year (0 or 1)

  /**
   * Constructor for Leap Year class
   * @param year
   */
  public LeapYear(int year) {
    if (year == 0){ // if sample year is 0, throw an exception as 0 cannot be divisible by anything
      throw new IllegalArgumentException("Cannot determine divisibility of the number 0.");
    }
    this.year = year; // initialize
    this.isLeapYear = 0; // initialize
  }

  /**
   * return the sample year
   * @return
   */
  public int getYear(){
    return this.year;
  }

  /**
   * return the Leap Year flag
   * @return
   */
  public int getIsLeapYear(){
    return this.isLeapYear;
  }

  /**
   * function that returns 0 if sample year is not a Leap Year
   * function that returns 1 if sample year is a Leap Year
   * @return
   */
  public int determineLeapYear(){
    /*if (this.year < 0){
      return 0;
    }*/
    if (this.year % 400 == 0){
      this.isLeapYear = 1;
      return 1;
    }
    if ((this.year % 4 == 0) && (this.year % 100 != 0)){
      this.isLeapYear = 1;
      return 1;
    }
    if (this.year % 4 != 0){
      this.isLeapYear = 0;
      return 0;
    }
    if ((this.year % 100 == 0) && (this.year % 400 != 0)){
      this.isLeapYear = 0;
      return 0;
    }
    return 0;
  }

  /**
   * MAIN FUNCTION
   * @param args
   */
  public static void main(String[] args) {
    if (args.length < 0){
      System.err.println("NOT ENOUGH COMMAND LINE ARGUMENTS");
    }
    if (args.length > 1){
      System.err.println("TOO MANY COMMAND LINE ARGUMENTS");
    }
    int year = Integer.parseInt(args[0]);
    LeapYear leapy = new LeapYear(year);
    leapy.determineLeapYear();
    if(leapy.getIsLeapYear() == 1){
      System.out.println(leapy.getYear() + " IS A LEAP YEAR");
    }
    else{
      System.out.println(leapy.getYear() + " IS NOT A LEAP YEAR");
    }
    System.exit(1);
  }
}