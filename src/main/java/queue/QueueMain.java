package queue;

public class QueueMain {

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(4);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(6);
        q.print();
    }
}
