package org.tree;

import java.util.ArrayList;
import java.util.List;

public class PrintRootToNodePath {

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);

        List< Integer > arr = new ArrayList < > ();

        boolean res;
        res = getPath(root, arr, 6);

        System.out.print("The path is ");
        for (int it: arr) {
            System.out.print(it + " ");
        }

    }

    private static boolean getPath(Node root, List<Integer> arr, int givenNode) {

        if(root==null){
            return false;
        }

        arr.add(root.val);
        if(root.val==givenNode){
            return true;
        }

        boolean left = getPath(root.left, arr, givenNode);
        boolean right = getPath(root.right, arr, givenNode);

        if(left || right){
            return true;
        }

        arr.remove(arr.size()-1);
        return false;
    }
}
