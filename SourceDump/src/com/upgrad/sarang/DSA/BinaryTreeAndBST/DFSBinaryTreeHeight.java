package com.upgrad.sarang.DSA.BinaryTreeAndBST;

import java.util.*;

class Node1 {
    int data;
    Node1 left, right;

    Node1(int value) {
        data = value;
        left = right = null;
    }
}

class Tree1 {
    Node1 root;

    Tree1() {
        root = null;
    }

    // Method to construct a binary tree from the given array
    public Node1 insertNode(int[] elementsArr, Node1 node, int i) {
        if(i < elementsArr.length){
            node = new Node1(elementsArr[i]);
            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to find the height of a binary tree
    public int findHeight(Node1 node) {
        if (node == null)
            return 0;
        int leftHeight = 1 + findHeight(node.left);
        int rightHeight = 1 + findHeight(node.right);

        if (leftHeight > rightHeight)
            return leftHeight;
        else
            return rightHeight;
    }
}

// WARNING: Do not edit the code given below; otherwise the test cases might fail
public class DFSBinaryTreeHeight {
    public static void main(String[] x) {
        Tree1 tree = new Tree1();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if (size < 0){
            System.out.println("Size should be a positive integer");
        }
        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr, tree.root, 0);

            System.out.println(tree.findHeight(tree.root));
        }
    }
}
