package one;

/**
 * Created at 2023-09-14
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if(this.isFull()){
            System.out.println("스택이 가득 차있습니다.");
        }

        stackArray[++top] = value;
    }

    public int pop(){
        if(this.isEmpty()){
            System.out.println("스택이 비어있습니다.");
            return -1;
        }

        return stackArray[top--];
    }

    public int peek() {
        if(this.isEmpty()){
            System.out.println("스택이 비어있습니다.");
            return -1;
        }

        return stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize -1;
    }
}
