package ss11_stack_queue.bai_tap.queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.deQueue();
        queue.display();
    }
}
