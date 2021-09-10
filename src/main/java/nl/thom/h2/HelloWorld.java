package nl.thom.h2;

public class HelloWorld {
    /**
     * Dit is een JAVADOC
     * Een multiline comment
     * waarin je de onderstaande functie uitlegt
     */
    public static void main(String[] args) {
        String name;
        /*
         * if (args[0]) werkt niet
         * hoe een default waarde instellen?
         *
         */
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "Jaapie";
        }
        System.out.println(name);

        /*Scanner in = new Scanner(System.in); System.out.println("Enter username");
        String userName = in.nextLine(); System.out.println("Username is: " + userName);
        System.out.printf("Hello %s\n", userName);
        int plusTwo = abs(-2);
        System.out.print(plusTwo);*/


    }
}