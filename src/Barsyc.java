package src;

public class Barsyc {
    public String name;
    private String color;


    public Barsyc (String color) {
        color = color;
    }

    public Barsyc() {
        name = "Барсик";
        color = "руденький";
    }

    void sayHello() {
        System.out.println("Привіт! Я " + name + " і я маю " + color + " колір шерсті.");
    }
}
