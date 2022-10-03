package ss10_arrayList_linkedList.bai_tap.my_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addFirst(9);
        linkedList.addLast(10);
        linkedList.addLast(10);
        linkedList.addFirst(9);
        linkedList.add(0,1);
        linkedList.add(1,2);
        linkedList.add(2,3);
        linkedList.add(3,4);
        linkedList.add(4,5);
        linkedList.remove(2);
        System.out.println("Size của linkedlist : " + linkedList.size());
        System.out.println("kiểm tra tồn tại : " + linkedList.indexOf(5));
        linkedList.printList();
    }
}
