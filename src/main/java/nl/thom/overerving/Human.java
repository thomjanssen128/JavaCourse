package nl.thom.overerving;


import nl.thom.Gender;

public abstract class Human {
    String name;
    int age;
    static String universalRights = "All humans are created equal.";

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


    public abstract String greet();
}
