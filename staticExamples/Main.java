package staticExamples;

public class Main {
    public static void main(String[] args) {
        Human sreya = new Human(20, "Sreya Das", 10000, false);
        Human soumili = new Human(19, "Soumili Mondal", 13000, false);

        System.out.println(sreya.name);
        System.out.println(soumili.age);

        // let's talk about static variable
        // if the population variable are not static i.e - all the object are see the
        // population is 1
        // But , if that is static - then all the object are see that variable are samew
        // So, static variable cannot be dependent on the object.
        // static keyword accesible of static way i.e - using class name
        // static - is belonging to the class not object..
        // System.out.println(sreya.population); // 2
        // System.out.println(soumili.population); // 2

        System.out.println("Total Population is= " + Human.population); // 2

        Human susanta = new Human(22, "Susanta Maity", 10001, false);
        System.out.println(susanta.married); // false

        System.out.println(Human.population); // 3
    }

    /*
     * let's talk about the properties of static method
     * 1. Non static method is not work inside of static methods.
     * 2. But , the vice_varsa are possible.
     * i.e - the static method are work in non static method..
     * 
     * Let's see the example -
     */

    // static method
    // this is not dependent on objects
    static void fun() {
        // hello(); // you cant use this bcz. it requires an instances
        // But the function you are using it in does not dependent on instances
        // To prevent this problem you use this
        Main obj = new Main();
        obj.hello();
    }

    // non static method - belonging to the object
    void hello() {
        fun(); // use this because not static method does not have limitations
        System.out.println("hello ! MySelf Susanta");
    }
}
