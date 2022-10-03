package ss10_arrayList_linkedList.thuc_hanh.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.add(0,1);
        list.add(1,1);
        list.add(2,1);
        list.add(3,1);
        list.addLast(9);
        list.printList();
//        list.add(2,9);
//        list.printList();
    }
}
