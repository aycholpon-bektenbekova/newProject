import Animals.Drowable;

public abstract class Figure implements Drowable {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract double calculate();
}
