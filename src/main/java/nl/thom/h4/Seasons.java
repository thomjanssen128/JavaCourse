package nl.thom.h4;

enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}


public class Seasons {
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            switch (s) {
                case SPRING: {
                    System.out.println("Warm");
                    break;
                }
                case SUMMER: {
                    System.out.println("Warm");
                    break;
                }
                case AUTUMN: {
                    System.out.println("Koud");
                    break;
                }

                case WINTER: {
                    System.out.println("Koud");
                    break;
                }

                default: {
                    System.out.println("Unknown");
                }
            }
        }
    }
}
