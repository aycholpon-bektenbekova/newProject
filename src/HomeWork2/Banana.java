package HomeWork2;

public class Banana extends Fruits{
    private String size;

    public Banana(String name) {
        super(name);
    }

    public Banana(String name, String size) {
        super(name);
        this.size = size;
    }

    @Override
    public void print() {

    }
}
