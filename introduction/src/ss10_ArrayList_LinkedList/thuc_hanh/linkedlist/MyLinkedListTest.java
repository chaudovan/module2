package ss10_ArrayList_LinkedList.thuc_hanh.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.printList();
        list.add(2,9);
        list.printList();
    }
}
