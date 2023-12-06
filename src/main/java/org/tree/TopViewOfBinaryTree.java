package org.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBinaryTree {

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

        List< Integer > boundaryTraversal;
        boundaryTraversal = topView(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }

    }

    private static List<Integer> topView(Node root) {

        List<Integer> list = new ArrayList<>();
        Queue<LineNode> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        if(root == null){
            return list;
        }
        else{
            q.offer(new LineNode(0,root));
        }

        while(!q.isEmpty()){
            LineNode lineNode = q.poll();
            int line = lineNode.line;
            Node node = lineNode.node;

            if(!map.containsKey(line)){
                map.put(line, node.val);
            }

            if(node.left != null){
                q.offer(new LineNode(line-1, node.left));
            }

            if(node.right != null){
                q.offer(new LineNode(line+1, node.right));
            }
        }
        map.values().forEach(i -> list.add(i));
        return list;
    }
}
