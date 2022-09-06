public class Rectngle extends Figure{
    private int sidea, sideb;

    public Rectngle(String name, int sidea, int sideb) {
        super(name);
        this.sidea = sidea;
        this.sideb = sideb;
    }

    @Override
    public double calculate() {
        return (sidea + sideb) * 2;
    }
}
