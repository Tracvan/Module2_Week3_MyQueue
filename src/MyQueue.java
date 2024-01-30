public class MyQueue {
    private int capacity = 0;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean myQueueIsEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public boolean myQueueIsFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (myQueueIsFull()) {
            System.out.println("Over flow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue");
        }
    }

    public void dequeue() {
        if (myQueueIsEmpty()) {
            System.out.println("Underflow ! unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop opeartion done ! remove: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop opeartion done ! remove: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

}
