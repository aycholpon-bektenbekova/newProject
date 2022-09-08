package HomeWork2;

import Animals.Animal;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple("Apple", "green", "circle");
        Banana banana = new Banana("Banana", "little");
        DragonFruit dragonFruit = new DragonFruit("DragonFruit", "Hylocereus");
        Pineapple pineapple = new Pineapple("Pineapple", 1);


        Mainn.createObject("Apple");
        Mainn.createObject("Banana");
        Mainn.createObject("DragonFruit");
        Mainn.createObject("Pineapple");

        Printable [] printable = {apple, banana, dragonFruit, pineapple};

        for(int i = 0; i < printable.length; i ++){
            if (printable[i] instanceof Fruits){
                System.out.println(
                        ((Fruits) printable[i]).getName());
            }

            printable[i].print();
        }
        }

    }

