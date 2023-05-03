public class Queue {
    int capacity;
    int queueArray[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;

    public Queue(int queueSize){
        capacity = queueSize;
        queueArray = new int[capacity];
    }
    public void enQueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue Is Full .");
        } else {
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            queueArray[rear] = item;
            currentSize++;
            System.out.println(+item +" :");
        }
    }
    public void deQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue Is Empty .");
        } else {
            front++;
            if(front == capacity-1){
                System.out.println("Removed element: "+queueArray[front-1]);
                front = 0;
            } else {
                System.out.println("Removed element: "+queueArray[front-1]);
            }
            currentSize--;
        }
    }
    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
    public void display(){
        for(int i = front; i<= rear ; i++){
            System.out.println(queueArray[i] + " : ");
        }
    }
    public static void main(String args[]){
        Queue q=new Queue(4);
        System.out.println("Element Of Queue :");
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.display();

    }
}
