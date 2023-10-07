package org.linkedlist;

public class InsertInSortedLinkedList {

    private Node head;

    public static void main(String[] args) {
        InsertInSortedLinkedList linkedList = new InsertInSortedLinkedList();
        linkedList.push(6);
        linkedList.push(5);
        linkedList.push(3);
        linkedList.push(2);
        linkedList.push(1);
        linkedList.insertInSortedLinkedListMethod(9);
        linkedList.printList();
    }

    public void insertInSortedLinkedListMethod(int data){

        Node newNode = new Node(data);
        if(this.head == null || this.head.getData()>data){
            newNode.setNext(head);
            head = newNode;
        }
        //1 2 3 5 6
        else {
            Node currentNode = this.head;
            while (currentNode.getNext() != null && currentNode.getNext().getData() < newNode.getData()) {
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void printList(){
        Node currentNode = this.head;
        System.out.print("Linked List : ");
        while(currentNode != null){
            System.out.print(currentNode.getData());
            currentNode = currentNode.getNext();
            if(currentNode != null){
                System.out.print("->");
            }
        }
    }
}
