class Course {
  Teacher teacher;
  String name;
  String code;
  String prefix;
  int writtenNote;
  int verbalNote;
  int averageNote;

  Course(String name, String code, String prefix){
    this.name = name;
    this.code = code;
    this.prefix = prefix;
  }
  
  void addTeacher(Teacher teacher) {
    if(teacher.branch.equals(this.prefix)){
      this.teacher = teacher;
    printTeacher();
    }else {
      System.out.println("Yanlış branş seçtiniz! Lütfen kontrol ediniz!");
    }
  }

  void printTeacher(){
    this.teacher.printInfo();
  }
  
}