package one;

/**
 * Created at 2023-09-14
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
public class StackToQueue {
    private Stack inputStack;
    private Stack outputStack;

    public StackToQueue(int size){
        inputStack = new Stack(size);
        outputStack = new Stack(size);
    }

    public void enqueue(int v){
        inputStack.push(v);
    }

    public int dequeue(){
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.pop();
    }
}
