public class Main {

    public static void main(String[] args) {
        // create a dataType where stores the 5 roll No
        // int[] rollNo = new int[5];

        // create a dataType where stores the 5 students names
        // String []names=new String[5];

        // create a dataType where stores the 5 students marks
        // float[] marks=new float[5];

        // Now teachers said to create a data Structure where stores the 5 students
        // data , data means ={names, roll Nos, marks}

        // To solve that type of problem create a custom class - Students

        // create an object which are namely susanta

        Students susanta = new Students(83, "Susanta Maity", 8.9f);

        // using dot operator (separator) we can access the instance variables and
        // method
        // based on their accesibility
        System.out.println(susanta.mark); // 8.9
        System.out.println(susanta.name); // Susanta Maity

        Students one = new Students(1, "Sreya das", 7.8f);

        Students two = one;
        two.name = "Soumili Mondal";
        System.out.println(two.mark);
        System.out.println(one.name);

    }

    // create a Students class
    static class Students {
        // here are three Property
        int rollNo;
        String name;
        float mark;

        // create a constructor
        // constructor- a special type of method which is used to initialized
        // the value of class variable during the time of object creation

        public Students(int rollNo, String name, float mark) {
            this.rollNo = rollNo;
            this.name = name;
            this.mark = mark;
        }

    }

}