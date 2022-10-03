package ss10_arrayList_linkedList.bai_tap.my_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(4);
        list.add(0,3);
        list.add(1,4);
        list.add(2,5);
        list.add(3,6);
        list.add(4,7);
        list.add(5,8);
        list.display();
        list.remove(0);
        System.out.println();
        list.display();

    }
}
