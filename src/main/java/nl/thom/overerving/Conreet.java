package nl.thom.overerving;

public class Conreet extends Abstract{

    //String naam;

    public Conreet(String naam) {
        this.naam = naam;
    }

    @Override
    public String hallo() {
        return "Hallo " + naam;
    }
}
