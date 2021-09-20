package nl.thom.h9;


import nl.thom.Gender;
import nl.thom.h7.PersonDiedException;

public class Person {
    String name;
    Gender gender;
    int age;
    static String universalRights = "All humans are created equal.";
    static int MAX_AGE = 130;


    public Person(String name, int age) {
        this(name, age, Gender.UNKNOWN);
    }
    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.setAge(age);
        this.gender = gender;
    }

    public int haveBirthday() throws PersonDiedException {
        int age = this.getAge();
        age++;
        if (age >= 130) {
            throw new PersonDiedException("Te oud!");
        }
        setAge(age);
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender val) {
        this.gender = val;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > MAX_AGE) {
            try {
                throw new PersonDiedException("Im getting too old for this shit.");
            } catch (PersonDiedException e) {
                e.printStackTrace();
                //this.age = age;

            }
        } else {
            this.age = age;
            System.gc();

        }
    }

    public String toString() {
        // "Jan (45) is MALE".
        //return name + " (" + getAge() + ") is " + getGender();
        return String.format("%s (%d) is %s", name, age, gender);
    }

    public static void main(String[] args) {
        Person t = new Person("Thom", 33);
        Person s = new Person("Thom", 33);
        t.setGender(Gender.MALE);
        s.setGender(Gender.MALE);
        System.out.println(t);
        System.out.println(t.equals(s));
        System.out.println(t.hashCode());
        System.out.println(s.hashCode());
    }

    void go() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object b) {
        if (!(b instanceof Person)) return false;

        Person other = (Person) b;
        return name.equals(other.name) &&
                getAge() == other.getAge() &&
                getGender() == other.getGender();
    }

    @Override
    public int hashCode() {
        return age * name.hashCode() * gender.hashCode();
    }


}
