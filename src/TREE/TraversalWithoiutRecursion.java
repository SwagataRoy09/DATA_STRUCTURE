package TREE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TraversalWithoiutRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("[1]POSTORDER TRAVERSAL USING TWO STACK\n"+
                "[2]POSTORDER TRAVERSAL USING ONE STACK\n"+
                "[3]INORDER TRAVERSAL\n"+
        "[4]PREORDER TRAVERSAL\n"+
                "[5]EXIT");
        node11 tree1=new node11();
        tree1.root=new node11(5);
        tree1.root.left=new node11(4);
        tree1.root.left.left=new node11(8);
        tree1.root.left.right=new node11(9);
        tree1.root.right=new node11(10);
        tree1.root.right.left=new node11(11);
        tree1.root.right.right=new node11(12);

        /*
             5
            /  \
           4    10
          / \   / \
         8  9 11  12
 */


        while (true){
            System.out.println("ENTER YOUR CHOICE");
            int choice=sc.nextInt();
            switch (choice){
                case 3->
                        {
                            System.out.println("INORDER TRAVERSAL IS");
                           tree1.inorder();
                        }
                case 4->{
                    System.out.println("PREORDER TRAVERSAL IS");
                    tree1.preorder();
                }
                case 1->{
                    System.out.println("POSTORDER TRAVERSAL IS  :");
                    tree1.postorder();
                }
                case 2->
                        {
                            System.out.println("POSTORDER TRAVERSAL IS : ");
                            System.out.println(tree1.postorderSingleStack());
                        }
                case 5->System.exit(0);
            }
        }
    }
}
class node11{
    node11 left=null;
    node11 right;
    node11 root;
    int data;
    node11(int data){
        this.data=data;
    }
    node11(){
        this.left=null;
        this.right=null;
    }
    void preorder() {
        Stack<node11> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while (root == null) {
            return;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            root=stack.pop();
            list.add(root.data);
            // stack.pop();
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        System.out.println(list);
    }
    void inorder() {
        Stack<node11> stack1 = new Stack<>();
        List<Integer> list1 = new ArrayList<>();
        node11 current=root;
        while (!stack1.isEmpty()||current!=null){
            if (current!=null) {
                stack1.push(current);
                current = current.left;
            }
            else {
                current=stack1.pop();
                list1.add(current.data);
                current=current.right;
            }
        }
        System.out.println(list1);
    }
    void postorder(){
        Stack<node11> stack2 = new Stack<>();
        Stack<node11> stack3 = new Stack<>();
        List<Integer> list2 = new ArrayList<>();
        if (root==null){
            return;
        }
        stack2.push(root);
        node11 current;
        while (!stack2.isEmpty()){
             current=stack2.pop();
            stack3.push(current);
            if (current.left!=null){
                stack2.push(current.left);
            }
            if (current.right!=null){
                stack2.push(current.right);
            }
        }
        while (!stack3.isEmpty()){
            node11 res=stack3.pop();
            list2.add(res.data);
        }
        System.out.println(list2);
    }
    ArrayList<Integer> postorderSingleStack(){
        ArrayList<Integer> list3=new ArrayList<>();
        Stack<node11> stack4 = new Stack<>();
        node11 current=root;
        while (!stack4.isEmpty() || current!=null){
            if (current!=null){
                stack4.push(current);
                current=current.left;
            }
            else {
                node11 temp=stack4.peek().right;
                if (temp==null) {
                    temp = stack4.peek();
                    stack4.pop();
                    list3.add(temp.data);

                    while (!stack4.isEmpty() && temp == stack4.peek().right) {
                        temp=stack4.peek();
                        stack4.pop();
                        list3.add(temp.data);
                    }
                }
                else{
                    current=temp;
                }
            }
        }
        return list3;
    }
}