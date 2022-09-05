import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private ENUM colorEnum;
    private Shelter shelter;

    public void setAge(int age) {
        this.age = age;
    }

    public void setColorEnum(ENUM colorEnum) {
        this.colorEnum = colorEnum;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    public ENUM getColorEnum() {
        return colorEnum;
    }

    public Shelter getShelter() {
        return shelter;
    }

    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(20) + 1;

    }


    public String getInfo() {
        return
                "age=" + age +
                "\ncolorEnum=" + colorEnum +
                "\nshelter address(Address of shelter):"
                        + shelter.getAddress() +
                        "\nshelter name (Name of shelter):"  + shelter.getName()
                ;
    }


}
