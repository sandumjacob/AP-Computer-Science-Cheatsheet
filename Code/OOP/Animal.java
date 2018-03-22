package OOP;

public class Animal {
    //Object fields
    private String name;
    private int age;
    private int weight;
    private boolean isDomesticated;

    //Empty parameter constructor for the Animal class.
    Animal() {
        name = "";
        age = 0;
        weight = 0;
        isDomesticated = false;
    }

    //Constructor with parameters
    @SuppressWarnings("unused")
    Animal(String name, int age, int weight, boolean isDomesticated) {
        //The "this" keyword signifies that it is the classes field, not the parameter of the method.
        //It is necessary to include this because they are named the same.
        //Thus, you don't necessarily need to use it, because you can just use two different names.
        this.name = name;
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
    public String getName() {
        return  this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return  this.weight;
    }

    public boolean isDomesticated() {
        return  this.isDomesticated;
    }
    //Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void isDomesticated(boolean isDomesticated) {
        this.isDomesticated = isDomesticated;
    }

    @Override
    public String toString() {
        return this.name + "\n" + "Age: " + this.age + "\n" + "Weight: " + this.weight + "\n" + "is Domesticated? " + this.isDomesticated;
    }
}
