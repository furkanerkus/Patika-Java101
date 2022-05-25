class Teacher {
  String name;
  String branch;
  String phoneNo;
  

  Teacher(String name, String branch, String phoneNo){
    this.name = name;
    this.branch = branch;
    this.phoneNo = phoneNo;    
  }

  void printInfo(){
    System.out.println("Adı: " + this.name);
    System.out.println("Branşı: " + this.branch);
    System.out.println("Telefon: " + this.phoneNo);
    System.out.println("");
    
  }
}
  