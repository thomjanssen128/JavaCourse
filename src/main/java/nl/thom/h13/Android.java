package nl.thom.h13;

//import nl.thom.h7.PersonDiedException;

public class Android extends Human implements Chargeable {
    public int level;

    public Android(String name) {
        this(name, 314, 0);
    }

    public Android(String name, int age) {
        this(name, age, 0);
    }

   public Android(String name, int age, int level) {
        this.name = name;
        setAge(age);
        this.level = level;
   }

   @Override
   public void setAge(int age) {
        if (age > 100) {
            System.out.println("I'm old, not obsolete");
        }
        this.age = age;
   }

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

    @Override
    public String toString() {
        return "Android{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
