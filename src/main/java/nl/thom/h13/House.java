package nl.thom.h13;

import java.util.ArrayList;
import java.util.List;

public class House {
    public List<Human> content = new ArrayList<>();

    @Override
    public String toString() {
        String r = "This house is owned by [";
        r += content.get(0);
        r += "] and it says [";
        r += content.get(0).greet();
        r+= "].";
        return r;
    }
}
