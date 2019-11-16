package ua.edu.ucu.smartarr;

import java.util.Arrays;
import java.util.ArrayList;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {


    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        ArrayList<Object> result = new ArrayList<>();
        ArrayList<Object> arr = new ArrayList<>(Arrays.asList(smartArray.toArray()));
        for (int i = 0; i < arr.size(); i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (!arr.get(i).equals(arr.get(j)) && (!result.contains(arr.get(i))))
                    result.add(arr.get(i));
        return result.toArray();
    }

    @Override
    public String operationDescription() {
        return "Distinct decorator";
    }

    @Override
    public int size() {
        return this.toArray().length;
    }
}
