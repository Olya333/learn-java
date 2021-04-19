package com.company.Lesson27HomeWork;

public class Test1 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Tiger {
    public void eat(String eda) {
        if (!eda.equals("myaso")) {
            throw new NeMyasoException("Tiger ne est " + eda);
        }
        System.out.println("Tigr est myaso");
    }

    public void drink(String jidkost) throws NeVodaException {
        if (!jidkost.equals("voda")) {
            throw new NeVodaException("Tiger ne pyet" + jidkost);
        }
        System.out.println("Tiger pyet vodu");
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String s) {
        super(s);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String s) {
        super(s);
    }
}