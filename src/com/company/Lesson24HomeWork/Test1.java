package com.company.Lesson24HomeWork;

public class Test1 {
    public static void main(String[] args) {
        System.out.println();
        Mechenosec mech = new Mechenosec("Charli");
        System.out.println(mech.name);
        mech.eat();
        mech.swim();
        mech.sleep();
        System.out.println();

        Speakable sp = new Pingvin("Shkiper");
        sp.speak();
        System.out.println();

        Animal an = new Lev("Leo");
        System.out.println(an.name);
        an.eat();
        an.sleep();
        System.out.println();

        Mammal m = new Lev("Leopold");
        System.out.println(m.name);
        m.run();
        m.eat();
        m.sleep();
        m.speak();
    }
}
abstract class Animal{
    Animal(String name){
        this.name = name;
    }
    String name;
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name = name;
    }
    public void sleep(){ System.out.println("Vsegda interesno nablyudat ,kak spyat ribi"); }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name = name;
    }
    abstract void fly();
    public void speak(String sings){
        System.out.println("Имя " + sings);
    }
}

abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}
interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    public void swim(){ System.out.println("Mechenosec krasivaya riba,kotoraya bistro plavaet!"); }
    public void eat(){ System.out.println("Mechenosec ne hitraya riba, i ona est obichniy ribiy korm!"); }
}

class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name = name;
    }
    public void eat(){ System.out.println("Pingvin lyubit est ribu!"); }
    public void sleep(){ System.out.println("Pingvini spyat prijavshis drug k drugu!"); }
    public void fly(){ System.out.println("Pingvini ne umeyut letat!"); }
    public void speak(){ System.out.println("Pingvini ne umeyut pet kak solovyi!"); }
}

class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name = name;
    }
    public void eat(){ System.out.println("Lev,kak luboi xishnik lyubit myaso!"); }
    public void sleep(){ System.out.println("Bolshuyu chast dnya lev spit!"); }
    public void run(){ System.out.println("Lev-eto ne samaya bistraya koshka!"); }
}
