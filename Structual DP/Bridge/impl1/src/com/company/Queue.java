package com.company;

//A refined abstraction.
public class Queue<T> implements Collection<T> {

    private LinkedList<T> linkedList;

    Queue(LinkedList<T> list){
        this.linkedList = list;

    }
    @Override
    public void offer(T element) {
        linkedList.addLast(element);
    }

    @Override
    public T poll() {
        return linkedList.removeFirst();
    }
}
