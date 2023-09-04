package com.company;

public class Stack<T>  implements Collection<T> {
    private LinkedList<T> linkedList;

    public Stack(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void offer(T element) {
        this.linkedList.addFirst(element);
    }

    @Override
    public T poll() {
        return this.linkedList.removeFirst();
    }
}
