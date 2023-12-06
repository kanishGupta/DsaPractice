package org.tree;

import java.util.ArrayList;

public class BoundaryTraversal {

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        ArrayList< Integer > boundaryTraversal;
        boundaryTraversal = printBoundary(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }

    }

    private static ArrayList<Integer> printBoundary(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        if(root != null) list.add(root.val);
        addLeftBoundary(root,list);
        addLeafNodes(root,list);
        addRightBoundary(root,list);
        return list;
    }

    private static void addRightBoundary(Node root, ArrayList<Integer> list) {
        Node cur = root.right;
        ArrayList<Integer> subList = new ArrayList<>();
        while(cur!=null){
            if(isLeaf(cur) == false) subList.add(cur.val);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        for(int i =subList.size()-1; i>=0;  i--) list.add(subList.get(i));
    }

    private static void addLeafNodes(Node root, ArrayList<Integer> list) {
        if(isLeaf(root)) list.add(root.val);
        if(root.left != null) addLeafNodes(root.left, list);
        if(root.right != null) addLeafNodes(root.right, list);
    }

    private static void addLeftBoundary(Node root, ArrayList<Integer> list) {
        Node cur = root.left;
        while(cur!=null){
           if(isLeaf(cur) == false) list.add(cur.val);
           if (cur.left != null) cur = cur.left;
           else cur = cur.right;
        }
    }

    private static boolean isLeaf(Node cur) {
        return (cur.left == null && cur.right == null);
    }
}
