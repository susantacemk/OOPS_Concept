package staticExamples;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // Now one variable which are common to all object on human class

    // let's variable name - population

    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}