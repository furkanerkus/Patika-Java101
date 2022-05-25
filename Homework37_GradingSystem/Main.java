class Main1 {
  public static void main(String[] args) {
    Teacher teacher1 = new Teacher("Büşra", "Mat", "5448660361");
    Teacher teacher2 = new Teacher("Yusuf", "Fiz", "5062120354");
    Teacher teacher3 = new Teacher("Kübra", "Kim", "5548660362");
    Course courseMath = new Course("Matematik", "101", "Mat");
    Course courseFiz = new Course("Fizik", "101", "Fiz");
    Course courseKim = new Course("Kimya", "101", "Kim");
    Students student1 = new Students("Furkan", "2002400", "3. Sınıf", courseMath, courseFiz, courseKim);
    
    courseMath.addTeacher(teacher1);
    courseFiz.addTeacher(teacher2);
    courseKim.addTeacher(teacher3);
    student1.addBulkExamNote(50, 80, 65, 90, 55, 100);
    student1.isPass();
  }
}