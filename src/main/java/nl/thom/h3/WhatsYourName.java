package nl.thom.h3;

public class WhatsYourName {
    public static void main(String[] args) {
        Client client1 = new Client("Jan");
        Client client2 = new Client("Piet");
        client2 = client1; // nu wordt de instance met "Piet" als name opgehaald door GC
        client2.name = "Joris";

        System.out.println(client1.name);

    }
}
