package com.company.Lesson22;

public class Human {
   // public  Human(String n){
    //    name = n;
   // }
    private String name = "Kolya";
    public String getName(){return name;}
    public void setName(String n){n=name;}
   // public static int salary = 150;

  //  public void work() {
   //     System.out.println("Rabotat");
  //  }

   // public static void rest() {
      //  System.out.println("otdixat");
   // }

    static class Student extends Human{
        public static void main(String[] args) {
            Student s = new Student();
            System.out.println(s.getName());
            //System.out.println(Student.salary);
           // s.work();
           // Student.rest();
        }

    }
}
