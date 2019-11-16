package ua.edu.ucu.smartarr;

import java.util.Arrays;

import ua.edu.ucu.functions.MyPredicate;
// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{
    private MyPredicate predicate;

    public FilterDecorator(SmartArray smartArray, MyPredicate predicate){
        super(smartArray);
        this.predicate = predicate;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = smartArray.toArray();
        Object[] newArr = new Object[smartArray.size()];
        int end = arr.length;
        int count = 0;
        for (int i = 0; i < end; ++i) {
            if (predicate.test(arr[i])){
                newArr[count] = arr[i];
                count++;
            }
            else{
                newArr = Arrays.copyOf(newArr,
                        newArr.length - 1);
            }
        }
        return newArr;
    }

    @Override
    public String operationDescription() {
        return "Filter decorator";
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
