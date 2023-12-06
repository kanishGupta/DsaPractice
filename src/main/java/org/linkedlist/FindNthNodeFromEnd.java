package org.linkedlist;

import javax.sound.midi.Soundbank;

public class FindNthNodeFromEnd {

    private Node head;

    public static void main(String[] args) {
        int nthPositionFromEnd = 4;
        FindNthNodeFromEnd linkedList = new FindNthNodeFromEnd();
        linkedList.push(8);
        linkedList.push(7);
        linkedList.push(6);
        linkedList.push(5);
        linkedList.push(4);
        linkedList.push(3);
        linkedList.push(2);
        linkedList.push(1);
        linkedList.push(0);
        linkedList.findNthElementFromEnd(nthPositionFromEnd);
    }

    private void findNthElementFromEnd(int position) {
        Node fastPtr = this.head;
        Node slowPtr = this.head;
        int length =0;

        while(fastPtr.getNext() != null){
            fastPtr =  fastPtr.getNext();
            length++;

            if(length >= position){
                slowPtr = slowPtr.getNext();
            }
        }

        System.out.println(position + "th node from end is : " + slowPtr.getData());
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }
}
