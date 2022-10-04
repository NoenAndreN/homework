package src;

public class Snowy {
    public String name;
    private String color;

    public Snowy (String color) {
        color = color;
    }
    public Snowy() {
        name = "Сніжок";
        color = "білий";
    }

    void sayHello(){
        System.out.println("Привіт! Я " + name + " і я маю " + color + " колір шерсті.");
    }
}
