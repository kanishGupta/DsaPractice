package org.linkedlist;

public class FindMiddleOfLinkedList {

    private Node head;

    public static void main(String[] args) {
        FindMiddleOfLinkedList linkedList = new FindMiddleOfLinkedList();
        linkedList.push(6);
        linkedList.push(5);
        linkedList.push(3);
        linkedList.push(2);
        linkedList.push(1);
        linkedList.push(0);
        linkedList.findMiddleOfLinkedList();
    }

    private void findMiddleOfLinkedList() {
        Node slowPtr =  this.head;
        Node fastPtr = this.head;
        boolean  fast = true;

        while(fastPtr.getNext() != null){
            if(fast) {
                fastPtr = fastPtr.getNext();
                fast = false;
            }

            else{
                fastPtr = fastPtr.getNext();
                slowPtr = slowPtr.getNext();
                fast = true;
            }
        }
        System.out.println("middle of the list: " + slowPtr.getData());
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }
}

