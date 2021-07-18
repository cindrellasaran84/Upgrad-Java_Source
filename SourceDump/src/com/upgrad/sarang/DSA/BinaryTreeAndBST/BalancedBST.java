package com.upgrad.sarang.DSA.BinaryTreeAndBST;
import java.util.*;

class Node6
{
    int value;
    Node6 leftchild, rightchild;

    Node6(int item)
    {
        value = item;
        leftchild = rightchild = null;
    }
}

class BinaryTree1
{
    Node6 root;
    static int preIndex = 0;
    static int index=0;

    Node6 constructTree(int in[], int pre[], int inStrt, int inEnd)
    {
        if (inStrt > inEnd)
            return null;

        Node6 tNode = new Node6(pre[preIndex++]);

        if (inStrt == inEnd)
            return tNode;

        int inIndex = search(in, inStrt, inEnd, tNode.value);

        tNode.leftchild = constructTree(in, pre, inStrt, inIndex - 1);
        tNode.rightchild = constructTree(in, pre, inIndex + 1, inEnd);

        return tNode;
    }

    int search(int arr[], int strt, int end, int value)
    {
        int i;
        for (i = strt; i <= end; i++)
        {
            if (arr[i] == value)
                return i;
        }
        return i;
    }

    int sumBinaryTree(Node6 node)
    {
        int sum = 0;
        if (node == null)
            return 0;
        sum = node.value + sumBinaryTree(node.leftchild) +
                sumBinaryTree(node.rightchild);
        node.value = sum;
        return sum;
    }

    void printPostorder(Node6 node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.leftchild);

        // then recur on right subtree
        printPostorder(node.rightchild);

        // now deal with the node
        System.out.print(node.value + " ");
    }

    void inOrder(Node6 node, int array[])
    {
        if (node == null)
            return;
        inOrder(node.leftchild, array);
        array[index++] = node.value;
        inOrder(node.rightchild, array);

    }

    Node6 ArrayToBST(int arr[], int start, int end) {
        //It will avoid overflow
        if (start > end) {
            return null;
        }

        //Variable will store middle element of array and make it root of binary search tree
        int mid = (start + end) / 2;
        Node6 node = new Node6(arr[mid]);

        //Construct left subtree
        node.leftchild = ArrayToBST(arr, start, mid - 1);

        //Construct right subtree
        node.rightchild = ArrayToBST(arr,mid + 1, end);

        return node;
    }
}
class BalancedBST{

    // driver program to test above functions
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int in[] = new int[len];
        int pre[] = new int[len];
        for(int i=0;i<len;i++){
            in[i] = scanner.nextInt();
        }
        for(int i=0;i<len;i++){
            pre[i] = scanner.nextInt();
        }
        BinaryTree1 tree = new BinaryTree1();
        Node6 root = tree.constructTree(in, pre, 0, len - 1);
        tree.sumBinaryTree(root);
        int inSumTree[] = new int[len];
        tree.inOrder(root, inSumTree);
        Arrays.sort(inSumTree);
        Node6 bstRoot = tree.ArrayToBST(inSumTree, 0, len-1);
        tree.printPostorder(bstRoot);

    }
}
