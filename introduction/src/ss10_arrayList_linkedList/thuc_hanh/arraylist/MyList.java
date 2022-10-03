package ss10_arrayList_linkedList.thuc_hanh.arraylist;

import java.util.Arrays;

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
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
