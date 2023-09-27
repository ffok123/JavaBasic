class School {

   public static void main (String[] args) {
      Student sammy = new Student ("Sammy", 5);
      Grad_Student pete = new Grad_Student ("Pete", 3,"Teaching Assistant", 8.75);

      sammy.info();
      System.out.println();
      pete.info();
      pete.support();

   }  // method main
}  // class School

class Student {

   protected String name;
   protected int num_courses;

   public Student (String student_name, int classes) {
      name = student_name;
      num_courses = classes;
   }  // constructor Student

   public void info () {
      System.out.println ("Student name: " + name);
      System.out.println ("Number of courses: " + num_courses);
   }  // method info
}  // class Student

class Grad_Student extends Student {

   private String source;
   private double rate;

   public Grad_Student (String student_name, int classes,
             String support_source, double hourly_rate) {

      super (student_name, classes);

      source = support_source;
      rate = hourly_rate;
   }  // constructor Grad_Student

   public void support () {
      System.out.println ("Support source: " + source);
      System.out.println ("Hourly pay rate: " + rate);
   }  // method support
}  // class Grad_Student
