package ss10_ArrayList_LinkedList.thuc_hanh.arraylist;

import java.util.Arrays;
import java.util.ArrayList;

public class MyList<E> {
    private int size=0;
    private final int DEFAULT_CAPACITY=10;
    private Object elements[] = new Object[DEFAULT_CAPACITY];

    public MyList() {
    }
    public void ensureCapa(){
        int size = elements.length*2;
        elements = Arrays.copyOf(elements, size);
    }
    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] =e;
    }
}
