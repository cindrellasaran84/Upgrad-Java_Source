package com.upgrad.sarang.DSA.BinaryTreeAndBST;

import java.util.*;


class Node2 {
    int data;
    Node2 left, right;

    public Node2(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree2 {

    Node2 root;

    BinaryTree2(){
        root = null;
    }

    // Method to construct a binary tree from the given array
    public Node2 insertNode(int[] elementsArr, Node2 node, int i){
        if(i < elementsArr.length){
            node = new Node2(elementsArr[i]);

            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to find the largest value in the tree
    public int findMax(Node2 node)
    {
        Queue<Node2> queue = new LinkedList<Node2>();
        queue.add(root);
        int max=Integer.MIN_VALUE;
        while (!queue.isEmpty())
        {
            Node2 temp = queue.peek();
            queue.remove();
            if(temp.data>max){
                max=temp.data;
            }

            //Enqueue left child
            if (temp.left != null) {
                queue.add(temp.left);
            }

            //Enqueue right child
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        return max;
    }
}
// WARNING: Do not edit the code given below; otherwise the test cases might fail
public class BFSPrintMaximumValue{
    public static void main(String[] x){
        BinaryTree2 tree = new BinaryTree2();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        if(size == 0){
            System.out.println("-1");
        }

        else if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++){
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr,tree.root,0);

            System.out.println(tree.findMax(tree.root));
        }
    }
}
