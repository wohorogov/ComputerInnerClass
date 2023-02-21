package anonim;

public class Start {
    public static void main(String[] args) {
        TestApp testApp = new TestApp();
        System.out.println(testApp.getAnonimClass("COMP").getPrice());
        System.out.println(testApp.getAnonimClass("MOB").getPrice());
    }
}
