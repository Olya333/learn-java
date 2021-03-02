package com.company.Lesson25;

public class Test3 {
    public static void main(String[] args) {
       // Help_able1 h = new Doctor1();
        Employee2 emp1 = new Doctor1();
        Employee2 emp2 = new Teacher1();
        Employee2 emp3 = new Driver1();
        Employee2 emp4 = new Employee2();
        Employee2 [] array= {emp1,emp2,emp3,emp4};

        for(Employee2 e : array){
            if(e instanceof Driver1){
                System.out.println(((Driver1)e).nazvanieMashini);
            }
            ((Driver1)e).vodit();

        }
      //  Employee2 e = new Employee2();
      //  Doctor1 d1 = (Doctor1)emp1;
      //  h.help();
       // System.out.println(((Doctor1)h).specializaciya);
       // ((Doctor1)h).lechit();
      //  ((Doctor1)emp1).help();
      //  System.out.println(e==emp1);
    }

}
class Employee2 {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }
    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor1 extends Employee2 implements Help_able1{
    String specializaciya = "xirurg";
    public void help(){ System.out.println("Doctor okazivaet pomosh"); }
    void lechit() { System.out.println("Lechit"); }
}
class Teacher1 extends Employee2 {
    int kolichestvoUchenikov;
    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver1 extends Employee2 {
    String nazvanieMashini = "Mercedes";
    void vodit() {
        System.out.println("Vodit");
    }
}
interface Help_able1{
    void help();
}
