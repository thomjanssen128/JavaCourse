package nl.thom.h3;

public class Weekdays {
    enum Days {
        MAANDAG,
        DINSDAG,
        WOENSDAG,
        DONDERDAG,
        VRIJDAG,
        ZATERDAG,
        ZONDAG

    }

    public static void main(String[] args) {
        System.out.println(Days.values()[4]);
    }
}
