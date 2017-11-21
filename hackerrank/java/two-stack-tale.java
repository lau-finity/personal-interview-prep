//Queues: A Tale of Two Stacks (Java)
public static class MyQueue<T> {
    Stack<T> stackNewestOnTop = new Stack<T>();
    Stack<T> stackOldestOnTop = new Stack<T>();

    public void enqueue(T value) { // Push onto newest stack
        stackNewestOnTop.push(value);
    }

    public T peek() {
         prepOld();
         return stackOldestOnTop.peek();
    }

    public T dequeue() {
        prepOld();
        return stackOldestOnTop.pop();
        
    }
    
    public void prepOld(){
        if (stackOldestOnTop.isEmpty())
            while (!stackNewestOnTop.isEmpty())
                stackOldestOnTop.push(stackNewestOnTop.pop());
    }
}