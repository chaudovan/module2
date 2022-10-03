package ss11_stack_queue.bai_tap.queue;

public class Queue {
    private Node front;
    private Node rear;

    public void enQueue(int data){
        Node temp = new Node(data);
        if(this.front ==null){
            this.front = this.rear = temp;
        }else{
            this.rear.link = temp;
            this.rear = temp;
        }
        this.rear.link = this.front;

    }
    public void deQueue(){
        if(this.front==null){
            System.out.println("null");
            return;
        }else if(this.front==this.rear){
            this.front=this.rear =null;
            return;
        }
        Node temp = this.front;
        this.front = this.front.link;
        this.rear.link=this.front;
    }
    public void display(){
        Node temp = this.front;
        do{
            System.out.print(temp.data + " ");
            temp = temp.link;
        }while (temp != this.front);
    }
}
