package com.upgrad.sarang.DSA.BinaryTreeAndBST;

class Node {
    int data; // value contained inside a node
    Node1 left, right; // left & right children of a node

    // constructor to set the data of a node to the passed value and make it a leaf node
    Node(int value) {
        data = value;
        left = right = null;
    }
}

// class representing a binary tree
class Tree {
    Node1 root; // root node of the binary tree

    // constructor to create an empty tree with no root node
    Tree() {
        root = null;
    }
}

// driver class to create tree and test code
public class Implementation {

    public static void main(String[] args) {
        Tree1 tree = new Tree1(); // constructing an empty tree

        tree.root = new Node1(1); // adding the root node

        tree.root.left = new Node1(2); // adding left child of root node
        tree.root.right = new Node1(3); // adding right child of root node

        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);

        tree.root.right.left = new Node1(6);
        tree.root.right.right = new Node1(7);
    }
}
