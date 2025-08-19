class SimpleQueue {
    public int[] queueArray;
    public int front;
    public int rear;
    public int capacity;
    public int currentSize;

    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        currentSize = 0;
    }
    public boolean isFull() {
        return currentSize == capacity;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow: Cannot add element, queue is full.");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment for array-based queue
        queueArray[rear] = item;
        currentSize++;
        System.out.println(item + " enqueued to queue.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: Cannot remove element, queue is empty.");
            return -1; // Or throw an exception
        }
        int item = queueArray[front];
        front = (front + 1) % capacity; // Circular increment
        currentSize--;
        System.out.println(item + " dequeued from queue.");
        return item;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queueArray[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        SimpleQueue myQueue = new SimpleQueue(3);

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
		// Attempting overflow
        myQueue.enqueue(40); 
		myQueue.enqueue(50);

        myQueue.display();

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
		// Attempting underflow
        myQueue.dequeue(); 
		myQueue.dequeue();

        myQueue.display();
    }
}