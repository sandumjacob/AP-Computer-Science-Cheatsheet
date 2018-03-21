package OOP;

public class Animal {
    private int age;
    private int weight;
    private boolean isDomesticated;

    //Emptry parameter constructor for the Animal class.
    public Animal() {
        age = 0;
        weight = 0;
        isDomesticated = false;
    }

    //Constructor with parameters
    public Animal(int age, int weight, boolean isDomesticated) {
        //The "this" keyword signifies that it is the classes field, not the parameter of the method.
        //It is necessary to include this because they are named the same.
        //Thus, you don't necessarily need to use it, because you can just use two different names.
        this.age = age;
        this.weight = weight;
        this.isDomesticated = isDomesticated;
    }

    /*
    Since all of the fields are private, getter and setter methods are necessary.
    Another class cannot access a private field, but it can access a public method that retrieves that private field.
    By using private fields, one is enabled to write specific ways of setting and getting fields.
    For example, one could write a setter method that only allows a certain value, or else the field won't be set.
    */

    //Getter methods
    public int getAge() {
        return age;
    }

    public int getWeight() {
        return  weight;
    }

    public boolean isDomesticated() {
        return  isDomesticated;
    }
    //Setter methods

}
