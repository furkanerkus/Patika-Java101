class Fighter {
  String name;
  int damage;
  int health;
  int weight;
  int dodge;

  Fighter(String name, int damage, int health, int weight, int dodge) {
    this.name = name;
    this.damage = damage;
    this.health = health;
    this.weight = weight;
    if(dodge < 0 && dodge >100) {
      this.dodge = 0;
    }else {
      this.dodge = dodge;
    }
  }

  int hit(Fighter oppenent) {
    System.out.println( this.name + " => " + oppenent.name + " " + this.damage + " hasar vurdu.");
    if(oppenent.isDodge()) {
      System.out.println(oppenent.name + " atağı savuşturdu.");
      return oppenent.health;
    }else{
      if(oppenent.health - this.damage < 0) {
        return 0;
      }else {
        return oppenent.health - this.damage;
      }
    }
    
  }

  boolean isDodge() {
    Double randomNumber = Math.random() * 100;
    return randomNumber <= this.dodge;
  }
}