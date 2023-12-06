package org.tree;

public class SuccessorInBst {

    public static void main(String[] args)
    {
        Node root = new Node(8);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(5);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        root.right = new Node(9);

        int[] arr = {Integer.MIN_VALUE};
        int target = 8;

        successorNode(root, arr, target);
        System.out.println("successor of :" + target + " : " + arr[0]);
    }

    private static void successorNode(Node root, int[] arr, int target) {

        if(root == null || arr[0]>target) return;

        successorNode(root.left, arr, target);

        if (root.val>target && arr[0] == Integer.MIN_VALUE) arr[0] = root.val;

        successorNode(root.right, arr, target);
    }
}
