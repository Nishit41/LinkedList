package com.bridgelabz.datastructers;

import java.util.Objects;

public class LinkedList <E>{
    Node<E> head;
    Node<E> tail;
    public void push(E key){
        Node<E> newNode = new Node<>(key);
        if( head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void print(){
        Node<E> temp = head;
        while ( temp!= null)
        {
            System.out.print(temp.getKey()+" ");
            temp= temp.getNext();
        }
    }
    public Node<E> search(E searchData) {
        Node<E> temp = head;
        while (temp != null) {
            if (temp.getKey().equals(searchData));
            temp = temp.getNext();
        }
        return null;
    }
    public boolean insertAfter(E searchData, E insertData) {
        Node<E> newNode = new Node<>(insertData);
        Node<E> searchedNode = search(searchData);
        if (searchedNode != null) {
            newNode.setNext(searchedNode.getNext());
            searchedNode.setNext(newNode);
            return true;
        }
        return false;
    }
}
