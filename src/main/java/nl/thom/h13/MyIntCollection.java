package nl.thom.h13;

import java.util.ArrayList;
import java.util.List;

public class MyIntCollection {
    List<Integer> values = new ArrayList<>(4);
    int length = values.size();

    public void add(int value) {
        if (!(values.contains(null))){
        } else {
            List<Integer> newValues = new ArrayList<>(length * 2);
            newValues.addAll(values);
            values = newValues;
            length = values.size();
        }
            values.add(value);

    }

}
