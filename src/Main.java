import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String [] commands = {"Sit down", "eating"};
        Shelter shelter = new Shelter("Romashka", "Chui avenue 2");
        Dog dog = new Dog("md", "doberman", commands, ENUM.colorEnum.Black,shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Guff Guff");
    }
}
