package nl.thom.hTien;

import nl.thom.Gender;
//import nl.thom.h7.PersonDiedException;

public class Person /*extends Human*/ {
    String name;
    Gender gender;
    int age;
    static String universalRights = "All humans are created equal.";
    static int MAX_AGE = 130;

    public Person() {
    }

    public Person(String name, int age) {
        this(name, age, Gender.UNKNOWN);
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        setAge(age);
        this.gender = gender;
    }

    // public int haveBirthday() throws PersonDiedException {
    //     int age = getAge();
    //     age++;
    //     if (age >= 130) {
    //         throw new PersonDiedException("Te oud!");
    //     }
    //     setAge(age);
    //     return age;
    // }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        // if (age > MAX_AGE) {
        //     try {
        //         throw new PersonDiedException("Im getting too old for this shit.");
        //     } catch (PersonDiedException e) {
        //         e.printStackTrace();
        //         //this.age = age;
        //
        //     }
        // } else {
        //     this.age = age;
        //     // System.gc();
        //
        // }
        this.age = age;
    }

    public String toString() {
        // "Jan (45) is MALE".
        //return name + " (" + getAge() + ") is " + getGender();
        return String.format("test %s (%d) is %s", name, age, gender);
    }


    void go() {
        System.out.println(this);
    }

    // @Override
    // public boolean equals(Object b) {
    //     if (!(b instanceof Person)) return false;
    //
    //     Person other = (Person) b;
    //     return this.name.equals(other.name) &&
    //             getAge() == other.getAge() &&
    //             getGender().equals(other.getGender());
    // }
    //
    // @Override
    // public int hashCode() {
    //     return this.age * this.name.hashCode() * this.gender.hashCode();
    // }


    //@Override
    public String greet() {
        return "Hello, my name is " + this.name + ". Nice to meet you!";
    }
}
