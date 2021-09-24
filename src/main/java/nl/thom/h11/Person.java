package nl.thom.h11;

import nl.thom.Gender;

import java.util.ArrayList;

public class Person extends Human {
    Gender gender;
    static int MAX_AGE = 130;
    ArrayList<HistoryRecord> records = new ArrayList<>();


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

    public void addHistory(String descr) {
        //final int index = records.size();
        //System.out.println(index);
        HistoryRecord rec = new HistoryRecord(descr);
        records.add(rec);
    }

    public int haveBirthday() throws PersonDiedException {
        int age = getAge();
        age++;
        if (age >= 130) {
            throw new PersonDiedException("Te oud!");
        }
        setAge(age);
        return age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public String toString() {
        // "Jan (45) is MALE".
        //return name + " (" + getAge() + ") is " + getGender();
        return String.format("test %s (%d) is %s", name, age, gender);

    }


    @Override
    public boolean equals(Object b) {
        if (!(b instanceof Person)) return false;

        Person other = (Person) b;
        return this.name.equals(other.name) &&
                getAge() == other.getAge() &&
                getGender().equals(other.getGender());
    }

    @Override
    public int hashCode() {
        return this.age * this.name.hashCode() * this.gender.hashCode();
    }


    @Override
    public String greet() {
        return "Hello, my name is " + name + ". Nice to meet you!";
    }

    private class HistoryRecord {
        private final String description;

        private HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public Human createSubHuman() {
        return new Human() {
            @Override
            public String greet() {
                return "Sub is the best.";
            }
        };
    }
}
