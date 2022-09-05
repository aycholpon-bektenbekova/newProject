import java.util.Arrays;

public class Dog extends Pet{
    private String name;
    private String breed;
    private String [] commands;

    public Dog(String name, String breed, String[] commands, ENUM.colorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColorEnum(getColorEnum());
        super.setShelter(shelter);
    }
    public Dog(String name, String breed, ENUM colorEnum, Shelter shelter){
        this.breed = breed;
        this.name = name;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public String[] getCommands() {
        return commands;
    }

    public void makeVoice(){
        System.out.println("Gaff Gaff!");
    }
    public void makeVoice (String voice){
        System.out.println(voice);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", commands=" + Arrays.toString(commands) +
                '}';
    }




}
