package staticExamples;

public class StaticInitialized {
    static int a = 4;
    static int b;

    // static block - to initialized the static variable
    // Will only run once, when the first oject is create i.e. when class is loaded

    static {
        System.out.println("I am in static block ");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInitialized obj1 = new StaticInitialized();
        System.out.println(StaticInitialized.a + " " + StaticInitialized.b);

        StaticInitialized.b += 3;
        System.out.println(StaticInitialized.a + " " + StaticInitialized.b);

        StaticInitialized obj2 = new StaticInitialized();
        System.out.println(StaticInitialized.a + " " + StaticInitialized.b);
        System.out.println(obj1.toString() + " " + obj2.toString());
    }
}
