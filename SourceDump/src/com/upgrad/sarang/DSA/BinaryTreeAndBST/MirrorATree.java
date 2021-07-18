package com.upgrad.sarang.DSA.BinaryTreeAndBST;

import java.util.*;

class Node3 {
    int data;
    Node3 left, right;

    Node3(int value) {
        data = value;
        left = right = null;
    }
}

class Tree3 {
    Node3 root;

    Tree3() {
        root = null;
    }

    // Method to construct a binary tree from the given array
    public Node3 insertNode(int[] elementsArr, Node3 node, int i) {
        if(i < elementsArr.length){
            node = new Node3(elementsArr[i]);
            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to print the tree in pre-order traversal
    void preOrderDFS(Node3 node) {
        if (node == null)
            return;

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");
        // recursively go to left subtree
        preOrderDFS(node.left);
        // recursively go to right subtree
        preOrderDFS(node.right);
    }

    // Method to convert a given binary tree into its mirror image
    public void mirror(Node3 node) {
        if (node == null)
            return;

        // mirror subtrees
        mirror(node.left);
        mirror(node.right);

        // swap left & right children of node
        Node3 temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}

// WARNING: Do not edit the code given below; otherwise the test cases might fail
class MirrorATree {
    public static void main(String[] x) {
        Tree3 tree = new Tree3();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if(size <= 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr, tree.root, 0);

            tree.mirror(tree.root);

            tree.preOrderDFS(tree.root);
        }
    }
}
