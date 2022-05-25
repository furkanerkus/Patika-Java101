class Students{
  Course course1;
  Course course2;
  Course course3;
  String name;
  String studentNumber;
  String classes;
  Double average;
  boolean isPass;

  Students(String name, String studentNumber, String classes, Course course1, Course course2, Course course3){
    this.name = name;
    this.studentNumber = studentNumber;
    this.classes = classes;
    this.course1 = course1;
    this.course2 = course2;
    this.course3 = course3;
    this.average = 0.0;
    this.isPass = false;
  }

  public void addBulkExamNote(int writtenNote1, int verbalNote1, int writtenNote2, int verbalNote2, int writtenNote3, int verbalNote3){
    if(writtenNote1 >= 0 && writtenNote1 <= 100) {
      this.course1.writtenNote = writtenNote1;
      this.course1.verbalNote =verbalNote1;
      this.course1.averageNote = ((80 * this.course1.writtenNote) + (20 * this.course1.verbalNote)) / 100;
    }
    if(writtenNote2 >= 0 && writtenNote2 <= 100) {
      this.course2.writtenNote = writtenNote2;
      this.course2.writtenNote =verbalNote2;
      this.course2.averageNote = ((75 * this.course2.writtenNote) + (25 * this.course2.verbalNote)) / 100;
    }
    if(writtenNote3 >= 0 && writtenNote3 <= 100) {
      this.course3.writtenNote = writtenNote3;
      this.course3.writtenNote = verbalNote3;
      this.course3.averageNote = ((70 * this.course3.writtenNote) + (30 * this.course3.verbalNote)) / 100;
    }
  }

  Double calcAverage(){
    this.average = (this.course1.averageNote + this.course2.averageNote + this.course3.averageNote) / 3.0;
    return this.average;
  }

  void isPass(){
    printNote();
    if(calcAverage() > 55) {
      System.out.println("Tebrikler. Sınıfı geçtiniz.");
      this.isPass = true;
    }else {
      System.out.println("Maalesef sınıfta kaldınız. Seneye görüşürüz.");
      this.isPass = false;
    }
  }
  void printNote(){
    System.out.println("Merhaba " + this.name);
    System.out.println(this.course1.name + " notunuz: " + this.course1.averageNote);
    System.out.println(this.course2.name + " notunuz: " + this.course2.averageNote);
    System.out.println(this.course3.name + " notunuz: " + this.course3.averageNote);
    System.out.println("Ortalamanız : " + calcAverage());
  }
}