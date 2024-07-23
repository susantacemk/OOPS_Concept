public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num1 = 57;
        Integer num2 = 45;
        // Integer num=new Integer(34); it is deprecated

        // Now our question is what is the difference between int and Integer
        // int - premitive Type
        // Integer - non Premitive Type

        swap(a, b);
        System.out.println(a + " " + b); // cannot swaped - because java methods call pasess the value

        swapNonPremitive(num1, num2);

        System.out.println(num1 + " " + num2); // cannot swaped

        // lets talk about the final keyword
        final int FINAL_A = 18; // once a variable is fianl; then it cannot be modified..
        // FINAL_A=90; // this occurs error final cannot be modiafied..
        System.out.println(FINAL_A);

        final A susanta = new A("Susanta maity");
        // susanta = new A("Susanta"); // this will give error because susanta is final
        susanta.name = "Other Name"; // this is allowed because we are not changing the reference of the object
        System.out.println(susanta.name);

        // lets talk about the finalize method
        // A obj;
        // for (int i = 0; i < 10000000; i++) {
        // obj = new A("Susanta");
        // }

    }

    static void swap(int a, int b) { // premitive type
        int temp = a;
        a = b;
        b = temp;
    }

    static void swapNonPremitive(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    /**
     * A class
     */
    public static class A {
        final int a = 90;
        String name;

        public A(String name) {
            System.out.println("A class is created");
            this.name = name;
        }

        // @Override
        // protected void finalize() throws Throwable {
        // System.out.println("A class is destroyed");
        // super.finalize();
        // }
    }
}
