package com.company.Lesson23;

public class Test7 {
    public static void main(String[] args) {
        A1 c1 = new C();
        c1.abc(new B());

    }
}
class A1{
   void abc(A a){
       System.out.println("A");
   }
}
class B1 extends A1{
    void abc(A a){
        System.out.println("BBB");
    }

    void abc(B b1){
        System.out.println("B");
    }
}
class C extends B1{
    void abc(B b2){
        System.out.println("C");
    }
}
