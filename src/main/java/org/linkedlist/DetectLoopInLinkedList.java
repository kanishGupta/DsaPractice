package org.linkedlist;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectLoopInLinkedList {
    public static void main(String[] args) {
        Node1 head = new Node1(1);
        Node1 current = head;
        Node1 intersection = null;

        for (int i = 2; i <= 9; i++) {
            Node1 node1 = new Node1(i);
            if(i==4)
                intersection = node1;
            current.next = node1;
            current = current.next;
        }

        // create a loop
        current.next = intersection;
        // print the list
        Node1 temp = head;
        for (int i = 0; i < 17; i++) { // print 15 Node1s to show the loop
            System.out.println(temp.data);
            temp = temp.next;
        }

//        while(temp.next != null) {
//            temp = temp.next;
//            System.out.println(temp.data);
//        }

        checkIfListContainsLoop(head);
    }

    public static void checkIfListContainsLoop(Node1 head){
        Node1 fstPtr = head;
        Node1 slowPtr = head;
        Boolean isLoop = false;

        while(fstPtr != null && fstPtr.next != null){
            fstPtr = fstPtr.next.next;
            slowPtr = slowPtr.next;

            if(fstPtr == slowPtr){
                isLoop = true;
                break;
            }
        }

        if(isLoop)
            System.out.println("There is a loop: " + slowPtr.data);

        else
            System.out.println("There is no loop");

    }
}
