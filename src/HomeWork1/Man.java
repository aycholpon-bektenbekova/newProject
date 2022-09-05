package HomeWork1;

public class Man {
    private String name;
    private int age;
    private int growth;
    private Country.country country;
    private Work work;
    private String[] function;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrowth() {
        return growth;
    }

    public Country.country getCountry() {
        return country;
    }

    public Work getWork() {
        return work;
    }

    public String[] getFunction() {
        return function;
    }

    public Man(String name, int age, int growth, Country.country country, Work work, String[] function) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.country = country;
        this.work = work;
        this.function = function;
    }

    public String getInfo() {
        return
               "name:" + name +
                       "\nage=" + age +
                        "\ncountry=" + country +
                        "\nwork address(Address of work):"
                        + work.getAddress() +
                        "\nwork name (Name of work):"  + work.getProfession()
                ;
    }
     public void makeVoice (){
         System.out.println("Hi");
     }
     public void makeVoice(String voice){
         System.out.println(voice);
     }
     final String gender(){
         System.out.println("My gender is male");
         return null;
     }



}
