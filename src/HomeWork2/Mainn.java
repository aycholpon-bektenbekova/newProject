package HomeWork2;

public class Mainn {
    public static Printable createObject(String className) {
        Apple apple = new Apple("Apple", "green", "circle");
        Banana banana = new Banana("Banana", "little");
        DragonFruit dragonFruit = new DragonFruit("DragonFruit", "Hylocereus");
        Pineapple pineapple = new Pineapple("Pineapple", 1);

        switch (className) {
            case "Apple":
                return new Apple("Apple");
            case "Banana":
                return new Banana("Banana");
            case "DragonFruit":
                return new DragonFruit("DragonFruit");
            case "Pineapple":
                return new Pineapple("Pineapple");
        }
        return null;
    }


}




