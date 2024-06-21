package Lesson9.StackQueue.Problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public int peek() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    // Add into queue
    public void enqueue(int obj) {
        // If array is full, resize
        if (isFull()) {
            resize();
        }

        if (isEmpty()) { // If queue is empty, put in the initial position
            front = 0;
            rear = 0;
        } else {  // Queue is not empty, put after rear position
            rear++;
        }

        arr[rear] = obj;
        size++;
    }

    // Remove from queue (remove from front)
    public int dequeue() {
        if (isEmpty()) return -1;

        int item = arr[front];
        arr[front] = 0;  // Set back to default value

        front++;
        size--;

        if (size == 0) {
            front = 0;
            rear = -1;
        }

        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }

    private void resize() {
        int newSize = arr.length * 2;
        int[] newArr = new int[newSize];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[front + i];
        }

        arr = newArr;
        front = 0;
        rear = size - 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "<empty>";
        StringBuilder sb = new StringBuilder();
        for (int i = front; i <= rear; i++) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue); // Should print: 1 2 3
        System.out.println(queue.dequeue()); // Should print: 1
        System.out.println(queue); // Should print: 2 3
    }
}
