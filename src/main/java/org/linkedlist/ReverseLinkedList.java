package org.linkedlist;

public class ReverseLinkedList {

    private Node head;

    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        linkedList.push(6);
        linkedList.push(5);
        linkedList.push(3);
        linkedList.push(2);
        linkedList.push(1);
        linkedList.reverseTheLinkedList();
        linkedList.printList();
    }

    private  void reverseTheLinkedList() {
        Node current = this.head;
        Node prev = null, next;
        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        this.head = prev;
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
