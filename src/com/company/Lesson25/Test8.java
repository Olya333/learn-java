package com.company.Lesson25;

public class Test8 {

}
class Test{
    public void abc(){
        System.out.println("ok");
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(( (interface1)t).a);
        t.abc();
    }
}
interface interface1{
    int a = 5;
    void abc();
}
interface interface2{
    int a = 10;
    void abc();
}
