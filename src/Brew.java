/*
   ( (
    ) )
  ........
  |      |]
  \      /
   `----'

   Cozy Brew Timer
   by MintBanshee 🌙🍵
*/

import java.util.Scanner;

public class Brew {

  private static Scanner input = new Scanner(System.in);

  private String teaName;
  private int steepTime;
  private int temperature; 

  public Brew(String teaName, int steepTime, int temperature) {
        this.teaName = teaName;
        this.steepTime = steepTime;
        this.temperature = temperature;
  }

  public String getTeaName() {
    return teaName;
  }
  public int getSteepTime() {
    return steepTime;
  }
  public int getTemperature() {
    return temperature;
  } // getters closed

  public void setTeaName(String teaName) {
    this.teaName = teaName;
  }
  public void setSteepTime(int steepTime) {
    this.steepTime = steepTime;
  }
  public void setTemperature(int temperature) {
    this.temperature = temperature;
  } // setters closed 

  
    public static void main(String[] args) {

      // Teacup! 
      System.out.println(); 
      System.out.println("   ( (");
      System.out.println("    ) )");
      System.out.println("  ........");
      System.out.println("  |      |]");
      System.out.println("  \\      /");  
      System.out.println("   `----'");
      System.out.println(); 

      // Print welcome message
      System.out.println("Welcome to Cozy Brew!");
      System.out.println();


      // first cup of tea 
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("✨ Types of tea: Green, Black, Herbal, Oolong, White 🌙");
      System.out.println("☕ What tea are you steeping today? ☕");
      String teaChoice = input.nextLine().trim().toLowerCase();
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      // brew 
      switch (teaChoice) {
        case "green":
        case "sencha":
          System.out.println("Green tea → 2 minutes @ 80°C.\nEnjoy your calm moment 🍵");
          break;
        case "black":
        case "black tea":
          System.out.println("Black tea → 4 minutes @ 100°C.\nTime to refresh your energy level! ☀️");
          break;
        case "herbal":
        case "tisane":
          System.out.println("Herbal tea → 6 minutes @ 100°C.\nTake a deep breath and relax 🌿");
          break;
        case "oolong":
          System.out.println("Oolong tea → 4 minutes @ 90°C.\nRelax and watch the steam dragons curl into the sky 🐉🍵");
          break;
        case "white":
          System.out.println("White tea → 2 minutes @ 85°C.\nGentle and delicate like a cherry blossom 🌸");
          break;
        default:
          System.out.println("Sorry, I know these teas:");
          System.out.println("- Green");
          System.out.println("- Black");
          System.out.println("- Herbal");
          System.out.println("- Oolong");
          System.out.println("- White");
          break;
      }

      // brew again? 
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("Would you like to brew another cup? (yes/no): ");
        String answer = input.nextLine().trim().toLowerCase();

        while (answer.equals("yes") || answer.equals("y")) {
          System.out.println();
          System.out.println("✨ Types of tea: Green, Black, Herbal, Oolong, White 🌙");
          System.out.print("☕ Which tea would you like to brew next? ☕ \n");
          String nextTea = input.nextLine().trim().toLowerCase();

        // quick exit if they type n/no here
        if (nextTea.equals("n") || nextTea.equals("no")) {
           break;
       }

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        switch (nextTea) {
        case "green":
        case "sencha":
          System.out.println("Green tea → 2 minutes @ 80°C.\nEnjoy your calm moment 🍵");
          break;
        case "black":
        case "black tea":
          System.out.println("Black tea → 4 minutes @ 100°C.\nTime to refresh your energy level! ☀️");
          break;
        case "herbal":
        case "tisane":
          System.out.println("Herbal tea → 6 minutes @ 100°C.\nTake a deep breath and relax 🌿");
          break;
        case "oolong":
          System.out.println("Oolong tea → 4 minutes @ 90°C.\nRelax and watch the steam dragons curl into the sky 🐉🍵");
          break;
        case "white":
          System.out.println("White tea → 2 minutes @ 85°C.\nGentle and delicate like a cherry blossom 🌸");
          break;
        default:
          System.out.println();
          System.out.println("Sorry, I know these teas:");
          System.out.println("- Green");
          System.out.println("- Black");
          System.out.println("- Herbal");
          System.out.println("- Oolong");
          System.out.println("- White");
          break;
        } 

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Would you like to brew another cup? (yes/no): ");
        answer = input.nextLine().trim().toLowerCase();
        System.out.println();
        }


        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Goodbye and stay cozy! 🌙🍵");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

    }
}

