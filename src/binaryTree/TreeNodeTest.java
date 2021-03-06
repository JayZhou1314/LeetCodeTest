package binaryTree;

import java.util.ArrayList;

/**
 * Created by sunchao on 2018/12/19.
 */
public class TreeNodeTest{
    public static void main(String[] args){
        TreeNode root = new TreeNode();
        TreeNode a = new TreeNode();
        TreeNode b = new TreeNode();
        TreeNode c = new TreeNode();
        TreeNode d = new TreeNode();
        TreeNode e = new TreeNode();

        root.val = 3;
        root.left = a;
        root.right = c;

        a.val = 4;
        a.left = b;
        a.right = d;

        b.val = 2;
        b.left = e;

        c.val = 8;
        d.val = 10;
        e.val = 6;


        ArrayList<Integer> result = root.postOrder(root);
        for(int data:result){
            System.out.println(data);
        }

        System.out.println("the max depth of binaryTree is "+ root.getMaxDepth(root));

        System.out.println("the min depth of binaryTree is "+ root.getMin(root));

    }
}
