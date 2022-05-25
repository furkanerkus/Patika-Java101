class Match {
  Fighter fighter1;
  Fighter fighter2;
  int minWeight;
  int maxWeight;

  Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
    this.fighter1 = fighter1;
    this.fighter2 = fighter2;
    this.minWeight = minWeight;
    this.maxWeight = maxWeight;
  }
  
  public void run() {
    Double randomState = Math.random() * 100;
    if(isCheck()) {
      while(this.fighter1.health > 0 && this.fighter2.health > 0) {
        if(randomState <= 50) {
          System.out.println("======Yeni Round=====");
          this.fighter2.health = this.fighter1.hit(fighter2);
          System.out.println(this.fighter2.name + " sağlık: " + this.fighter2.health);
          if(isWin()) {
            break;
          }
          this.fighter1.health = this.fighter2.hit(fighter1);
          System.out.println(this.fighter1.name + " sağlık: " + this.fighter1.health);
          if(isWin()) {
            break;
          }
        }else {
          System.out.println("======Yeni Round=====");
          this.fighter1.health = this.fighter2.hit(fighter1);
          System.out.println(this.fighter1.name + " sağlık: " + this.fighter1.health);
          if(isWin()) {
            break;
          }
          this.fighter2.health = this.fighter1.hit(fighter2);
          System.out.println(this.fighter2.name + " sağlık: " + this.fighter2.health);
          if(isWin()) {
            break;
          }
        }
      }
      
    }else{
      System.out.println("Lütfen sporcuların sikletlerini kontrol ediniz.");
    }
  }

  boolean isCheck() {
    return(this.fighter1.weight >= minWeight && this.fighter1.weight <= maxWeight) && (this.fighter2.weight >= minWeight && this.fighter2.weight <= maxWeight);
  }

  boolean isWin() {
    if(fighter1.health == 0) {
      System.out.println(fighter2.name + " Kazandı !");
      return true;
    }else if(fighter2.health == 0) {
      System.out.println(fighter1.name + " Kazandı !");
      return true;
    }else {
      return false;
    }
  }
}