package HomeWork2;

public class DragonFruit extends Fruits{
    private String grade;

    public DragonFruit(String name) {
        super(name);
    }

    public DragonFruit(String name, String grade) {
        super(name);
        this.grade = grade;
    }

    @Override
    public void print() {

    }
}
