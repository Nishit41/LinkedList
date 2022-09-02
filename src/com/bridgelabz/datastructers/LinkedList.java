package com.bridgelabz.datastructers;

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
    void  add(E data){
        Node<E> newnode = new Node<>(data);
        if(head == null){
            head = newnode;
        }
        else{
            tail.setNext(newnode);
            tail = newnode;
        }
    }
    void insetElement( E data){
            Node<E> insertingNode = new Node<>(data);
            head.setNext(insertingNode);
            insertingNode.setNext(tail);
        }

    }




