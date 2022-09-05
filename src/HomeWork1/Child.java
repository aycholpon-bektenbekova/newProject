package HomeWork1;

final class Child extends Man{
    private String name;
    private int age;
    private String[] function;


    public Child(String name, int age, int growth, Country.country country, Work work, String[] function) {
        super(name, age, growth, country, work, function);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String[] getFunction() {
        return function;
    }

    @Override
    public void makeVoice(String voice) {
        super.makeVoice(voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
