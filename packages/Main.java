package packages;

import static packages.a.Grettings.add;

public class Main {

    public static void main(String[] args) {
        // call the add method which are inside the
        // packages.a.Grettings
        System.out.println(add(2, 3));
    }

}
