package local_inner;

public class Start {
    public static void main(String[] args) {
        TestApp testApp = new TestApp();
        System.out.println(testApp.getLocalClass("COMP").getPrice());
        System.out.println(testApp.getLocalClass("Mobile").getPrice());
    }

}
