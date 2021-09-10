package nl.thom.h3;

public class TheClock {
    public static void main(String[] args) {
        final int HOURS_DAY = 24;
        int start = 23;
        int add = 80;
        int totalHours = start + add;
        int daysPassed = totalHours % HOURS_DAY;

        System.out.println(daysPassed);
    }
}
