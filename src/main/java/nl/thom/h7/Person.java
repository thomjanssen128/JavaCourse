package nl.thom.h7;


public class Person {
    String name;
    Gender gender;
    int age;
    static String universalRights = "All humans are created equal.";
    static int MAX_AGE = 130;


    public Person(String name, int age) {
        this.name = name;
        this.setAge(age);
        this.gender = Gender.UNKNOWN;
    }

    public int haveBirthday() throws PersonDiedException  {
        //setAge();
        return 0;
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
        }
    }


}
