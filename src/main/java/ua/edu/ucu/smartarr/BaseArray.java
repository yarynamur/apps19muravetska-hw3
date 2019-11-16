package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{

    private Object[] array;

    public BaseArray(Object[] arr){
        this.array = arr;
    }

    @Override
    public Object[] toArray() {
        return this.array;
    }

    @Override
    public String operationDescription() {
        return "Base array";
    }

    @Override
    public int size() {
        return this.array.length;
    }
}
