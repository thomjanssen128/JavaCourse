package nl.thom.overerving;

//import nl.thom.h7.PersonDiedException;

public class Android extends Human implements Chargeable {
    public int level = 0;

    public Android() {
    }

    public Android(String name) {
        this(name, 314);
    }

    public Android(String name, int age) {
        this.name = name;
        setAge(age);
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


    @Override
    public String greet() {
        return "I'm only half human, but human still... My energy level is " + level + "%";
    }

    @Override
    public int charge(int amount) {
        if (level + amount > 100) {
            return level;
        }

        level += amount;
        return level;
    }
}
