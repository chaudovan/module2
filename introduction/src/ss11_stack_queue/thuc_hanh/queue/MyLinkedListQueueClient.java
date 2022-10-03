package ss11_stack_queue.thuc_hanh.queue;

public class MyLinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(20);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
//        queue.enqueue(20);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }

}
