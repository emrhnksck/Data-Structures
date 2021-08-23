package queue;

import java.util.Arrays;

public class Queue<T> {
    private int front = -1;
    private int  rear = 1;
    T[] arr;

    public Queue(){
        arr = (T[])new Object[10];
    }

    public Queue(int size){
        arr = (T[])new Object[size];
    }

    public boolean isEmpty(){
        return front==-1 && rear==1;
    }

    public boolean isFull(){
        return rear==arr.length-1;
    }

    public void enqueue(T elem){
        if(isFull()){
            throw new RuntimeException("Queue is full");
        }
        if(isEmpty()){
            front=0;
            arr[++rear] = elem;
        }
    }

    public T dequeue(){
        if(isEmpty()) throw new RuntimeException("Queue is empty");
        T donen = arr[front++];
        if(front > rear)
            front = rear = -1;
        return donen;
    }

    public int count(){
        if(isEmpty()) return 0;
        return  rear-front-1;
    }
    public void print(){
        Arrays.stream(arr).forEach(e -> System.out.println(e));
    }
}
