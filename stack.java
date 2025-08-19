class Stack {
    public int[] arr;
    public int top;
    public int capacity;

    public Stack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1; // Stack is initially empty
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push, stack is full.");
            return;
        }
        arr[++top] = x;
        System.out.println(x + " pushed to stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop, stack is empty.");
            return -1; // Or throw an exception
        }
        int poppedElement = arr[top--];
        System.out.println(poppedElement + " popped from stack.");
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty: Cannot peek.");
            return -1; // Or throw an exception
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        //stack overflow
        stack.push(40);
        stack.push(50);

        stack.pop();
        stack.pop();
        stack.pop();
        // Stack Underflow
        stack.pop();
        stack.pop();
    }
}