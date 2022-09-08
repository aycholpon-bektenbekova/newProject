package HomeWork2;

public class Apple extends Fruits{
    private String color;
    private String form;

    public Apple(String name) {
        super(name);
    }

    public Apple(String name, String color, String form) {
        super(name);
        this.color = color;
        this.form = form;
    }

    @Override
    public void print() {

    }
}

