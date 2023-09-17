package one;

/**
 * Created at 2023-09-14
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value){
        if(this.isFull()){
            System.out.println("큐가 가득 차있습니다.");
        }

        // 끝자리 그대로면
        if(rear == maxSize - 1){
            rear = -1;
        }

        queueArray[++rear] = value;
        size++;
    }

    public int dequeue(){
        if(this.isEmpty()){
            System.out.println("큐가 비었습니다.");
            return -1;
        }

        if(front == maxSize) {
            front = 0;
        }

        size--;
        return queueArray[front++];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("큐가 비었습니다.");
            return -1;
        }

        return queueArray[front];
    }

    public boolean isEmpty(){
        return size <= 0;
    }
    public boolean isFull(){
        return size >= maxSize;
    }
}
