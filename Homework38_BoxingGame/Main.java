import java.util.*;

class Main2 {
  public static void main (String[] args) { 
    Fighter fighter1 = new Fighter("A", 30, 120, 100, 35);
    Fighter fighter2 = new Fighter("B", 22, 160, 90, 40);
    int minWeight = 80;
    int maxWeight = 100;

    Match match1 = new Match(fighter1, fighter2, minWeight, maxWeight);
    match1.run();
  }
}