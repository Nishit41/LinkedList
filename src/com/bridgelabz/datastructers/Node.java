package com.bridgelabz.datastructers;

public class Node <E>{
    private E key;
    private Node<E> next;

    public Node(E key) {
        this.key = key;
    }

    public E getKey() {
        return key;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }


}
