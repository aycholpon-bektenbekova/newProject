package HomeWork1;

import java.util.Random;

public class HomoSapiens {
    private int age;
    private String name;
    private int growth;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getGrowth() {
        return growth;
    }

    private int generateDefaultAge(){
        Random random = new Random(90);
        return random.nextInt();
    }
    private int generateDefaultGrowth(){
        Random random = new Random(190);
        return random.nextInt();
    }


    public HomoSapiens(int age, int growth, String name) {
        this.age = age;
        this.growth = growth;
        this.name = name;
    }


}
