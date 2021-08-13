package stack;

import java.util.Arrays;

public class Stack<T> {

    private T[] arr;
    private int en; //element number

    public Stack(){
        arr = (T[]) new Object[10];
        en=0;
    }

    public Stack(int en){
        arr =(T[]) new Object[en];
    }

    public void push(T element){
        if(en == arr.length) throw new RuntimeException("Stack Overflow");
        arr[en++] = element;
    }

    public T pop(){
        if(en == 0) throw new RuntimeException("Stack Underflow");
        return arr[--en];
    }

    public T peek(){
       if(en == 0) throw new RuntimeException("Stack Underflow");
       return arr[en-1];
    }

    public boolean isEmpty(){
        return en == 0 ;
    }

    public void print(){
        Arrays.stream(arr).forEach(e -> System.out.println(e));
    }


}
