package nl.thom.h13;


public abstract class Human {
    String name;
    int age;
    static String universalRights = "All humans are created equal.";

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public abstract String greet();
}
