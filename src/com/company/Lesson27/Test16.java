package com.company.Lesson27;

public class Test16 {
    public static void main(String[] args) {
       // ArrayList <String> list = new ArrayList<>();
      //  list.add("1");
     //   list.add("2");
      //  System.out.println(list.get(3));
     //   Doctor d = new Doctor();
     //   Teacher t = new Teacher();
     //   Teacher t3 = new Teacher();
     //   Teacher[] array2 = {t,t3};
      //  Employee [] array1 = {d,t};
       // Teacher t2 = (Teacher)array1[0];
        createPwd("djdkijfhjjk");
    }


    public static void createPwd(String pwd){
        if(pwd.length()<6){
            throw new IllegalArgumentException("Dlinna parolya slishkom malenkaya!");
        }
        if(pwd.length()>12){
            throw new IllegalArgumentException("Dlinna parolya slishkom bolshaya!");
        }
        System.out.println("Parol prinyat");
    }
}

class Employee{}
class Doctor extends Employee{}
class Teacher extends Employee{}
class Samolet{
    String sostoyanie = "V ojidanii"; // v ojidanii,v vozdyxe,polet otmenen
    public void letet(){
        sostoyanie = "v vozdyxe";
        System.out.println("Samolet letit");
    }

    public void ojidat(){
        if(sostoyanie.equals("v vozdyxe")){
            throw new IllegalStateException("Samolet uje v vozduxe");
        }
        sostoyanie = "v ojidanii";
        System.out.println("Samolet v ojidanii poleta");
    }

    public void otmenitPolet(){
        if(sostoyanie.equals("v vozdyxe")){
            throw new IllegalStateException("Samolet uje v vozduxe");
        }
        sostoyanie = "polet otmenen";
        System.out.println("Polet samoleta otmenen");
    }

    public static void main(String[] args) {
        Samolet s = new Samolet();
        s.ojidat();
    }
}
