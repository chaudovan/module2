package ss10_arrayList_linkedList.bai_tap.my_linked_list;

public class MyLinkedList<E> {
    private Node head;
    private int size=0;
    private int numNodes;
    private class Node{
        private Node next;
        private Object data;
        public Node(){}
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }

    public MyLinkedList() {
    }
    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public void add(int index,E element){
        if(index==0 || size==0) {
            addFirst(element);
        }else {
            Node temp = head;
            Node custody;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            custody = temp.next;
            temp.next = new Node(element);
            temp.next.next = custody;
            numNodes++;
            size++;
        }
    }

    public void addFirst(E e){
        Node newN = new Node(e);
        newN.next=head;
        head=newN;
        numNodes++;
        size++;

    }

    public void addLast(E e){
        if(size==0){
            addFirst(e);
        }else {
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(e);
            numNodes++;
            size++;
        }
    }
    public E remove(int index){
        Node temp = head;
        Node remove;
        for (int i = 0; i <index-1 && temp.next!=null ; i++) {
            temp = temp.next;
        }
        remove = temp.next;
        temp.next = remove.next;
        numNodes--;
        size--;
        return (E) remove.next;
    }
    public boolean remove(Object e){
        Node temp = head;
        for (int i = 0; i <=numNodes ; i++) {
            if((temp.data).equals(e)){
                remove(i);
                return true;
            }else{
                temp = temp.next;
            }
        }
        return false;
    }
    public int size(){
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }
    public E clone(){
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            newList.add(i,(E)temp.getData());
            temp = temp.next;
        }
        return (E) newList;
    }
    public boolean contains(E o){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData() == o) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int indexOf(E o){
        Node temp = head;
        for (int i = 0; i <numNodes ; i++) {
            if(temp.getData()==o){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    public boolean add(E e){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData() == e) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public E get(int i) {
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }
    public E getFirst(){
        return (E) head.getData();
    }
    public E getLast(){
        Node temp = head;
        for (int i = 0; i <numNodes ; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }
    public void ensureCapacity(int minCapacity){
        numNodes +=minCapacity;
    }
    public void clear(){
        head = null;
        numNodes =0;
    }
    public void printList() {
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
