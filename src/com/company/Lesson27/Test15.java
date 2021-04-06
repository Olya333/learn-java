package com.company.Lesson27;

public class Test15 {
    void marafon(int temperaturaVozduha, int tempBega) throws PodvernutNoguException {
        if (tempBega > 12) {
            throw new PodvernutNoguException("Temp bega bil slishkom visokim " + tempBega);
        }
        if (temperaturaVozduha > 32) {
            throw new SveloMishcyException();
        }
        System.out.println("Vi probeshali marafon");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try{
        t.marafon(40,8);}
        catch (PodvernutNoguException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("V lyubom sluchae vi polychite grammotu!!!");
        }
    }

}

class PodvernutNoguException extends Exception {
    PodvernutNoguException(String message) {
        super(message);
    }

    PodvernutNoguException() {
    }
}

class SveloMishcyException extends RuntimeException {
    SveloMishcyException(String message) {
        super(message);
    }

    SveloMishcyException() {
    }
}
