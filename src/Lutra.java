package src;

public class Lutra {
    public String name;
    private String color;


    public Lutra (String color) {
        color = color;
    }
    public Lutra() {
        name = "Видра річкова";
        color = "коричневий";
    }


    public String getColor (){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    void sayHello() {

        System.out.println("Привіт! Я " + name + " і я маю " + color + " колір шерсті.");
    }
}