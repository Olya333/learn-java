package com.company.Lesson24HomeWork;

public class Test1 {
    public static void main(String[] args) {
        Animal a1 = new Pingvin("Shkiper1");
        Animal a2 = new Lev("Leo1");
        Animal a3 = new Mechenosec("Charli1");

        Fish f1 = new Mechenosec("Charli2");
        Bird b1 = new Pingvin("Shkiper2");
        Mammal m1 = new Lev("Leo2");

        Mechenosec mech1 = new Mechenosec("Charli3");
        Pingvin p1 = new Pingvin("Shkiper3");
        Lev l1 = new Lev("Leo3");

        Speakable s1 = new Pingvin("Shkiper4");
        Speakable s2 = new Lev("Leo4");

        Animal [] array1 = {a1,a2,a3,f1,b1,m1,mech1,p1,l1};
        Speakable [] array2 = {s1,s2,b1,m1,p1,l1};

        for(Animal a : array1){
            if(a instanceof Mechenosec){
                Mechenosec m = (Mechenosec)a;
                System.out.println(m.name);
                m.sleep();
                m.swim();
                m.eat();
            }else if(a instanceof Pingvin){
                Pingvin p = (Pingvin)a;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            }else if(a instanceof Lev){
                Lev l = (Lev)a;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
            }
        }System.out.println();

        for(Speakable s :array2){
            if(s instanceof Pingvin){
                Pingvin p = (Pingvin)s;
                System.out.println(p.name);
                p.speak();
                p.sleep();
                p.fly();
                p.eat();
            }else if(s instanceof Lev ){
                Lev l = (Lev)s;
                System.out.println(l.name);
                l.speak();
                l.sleep();
                l.run();
                l.eat();
            }
        }
        System.out.println();

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
