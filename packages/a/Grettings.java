package packages.a;

import static packages.b.Messages.message;

public class Grettings {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        // call the message methods which are inside the b.Message file
        message();
    }

    public static int add(int a, int b) {
        System.out.println("Hello ! I am inside of the packages.a.grettings");
        return a + b;
    }
}
