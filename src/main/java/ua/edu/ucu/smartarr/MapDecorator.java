package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    private MyFunction function;

    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        function = func;
    }

    @Override
    public Object[] toArray() {
        Object[] array = smartArray.toArray();
        int end = array.length;
        for (int i = 0; i < end; i++) {
            array[i] = function.apply(array[i]);
        }
        return array;
    }

    @Override
    public String operationDescription() {
        return "Map decorator";
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
