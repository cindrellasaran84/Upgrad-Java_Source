package com.upgrad.sarang.DSA.PriorityQueueAndHeap;
import java.util.*;
public class HuffmanCoding {

    public static void printCode(TreeNode root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {

            System.out.println(root.c + ":" + s);

            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args) {

        int n = 5;
        char[] charArray = {'p', 't', 'u', 'v', 'w'};
        int[] charfreq = {5, 19, 26, 55, 118};

        PriorityQueue<TreeNode> q = new PriorityQueue<TreeNode>(n, new TreeNodeComparator());

        for (int i = 0; i < n; i++) {
            TreeNode hn = new TreeNode();

            hn.c = charArray[i];
            hn.freq = charfreq[i];

            hn.left = null;
            hn.right = null;

            q.add(hn);
        }

        TreeNode root = null;

        while (q.size() > 1) {

            TreeNode x = q.peek();
            q.poll();

            TreeNode y = q.peek();
            q.poll();

            TreeNode f = new TreeNode();

            f.freq = x.freq + y.freq;
            f.c = '-';

            f.left = x;

            f.right = y;

            root = f;

            q.add(f);
        }

        printCode(root, "");
    }
}

class TreeNode {

    int freq;
    char c;

    TreeNode left;
    TreeNode right;
}

class TreeNodeComparator implements Comparator<TreeNode> {
    public int compare(TreeNode x, TreeNode y) {

        return x.freq - y.freq;
    }
}
