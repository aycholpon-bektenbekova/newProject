package HomeWork1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] function = {"Eating", "Drinking", "Sleeping"};
        Work work = new Work("Designer", "Tsum 1");
        Child child = new Child("Alex",20,170, Country.country.England, work, function);
        System.out.println(child.getInfo());
        child.makeVoice();

        Work work1 = new Work("Actor", "Theatre of opera and ballet");
        Child child1 = new Child("Steph", 30, 168, Country.country.Japan, work1, function);
        System.out.println(child1.getInfo());
        child1.makeVoice();

       Work work2 = new Work("Programmer", "GeekStudio");
       Man man = new Man("Tilek", 41, 171, Country.country.Kyrgyzstan, work2, function);
       System.out.println(man.getInfo());
       man.makeVoice();



    }
}
