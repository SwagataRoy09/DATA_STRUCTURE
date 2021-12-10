package TREE;
import java.util.Scanner;
public class Traversal_Using_Recursion {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            node tree=new node();
            System.out.println("[1]INORDER TRAVERSAL\n"+
                    "[2]POSTORDER TRAVERSAL\n"+"[3]PREORDER TRAVERSAL\n"+
                    "[4]EXIT");
            System.out.println("tree.root=new node(5);\n" +
                            "            tree.root.left=new node(4);\n" +
                            "            tree.root.left.left=new node(8);\n" +
                            "            tree.root.left.right=new node(9);\n" +
                            "            tree.root.right=new node(10);\n" +
                            "            tree.root.right.left=new node(11);\n" +
                            "            tree.root.right.right=new node(12)");
            tree.root=new node(5);
            tree.root.left=new node(4);
            tree.root.left.left=new node(8);
            tree.root.left.right=new node(9);
            tree.root.right=new node(10);
            tree.root.right.left=new node(11);
            tree.root.right.right=new node(12);
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
                    case 1->
                            {
                                System.out.println("INORDER TRAVERSAL IS");
                                tree.printInorder1();
                            }
                    case 2->{
                        System.out.println("POST ORDER TRAVERSAL IS");
                        tree.printPostorder1();
                    }
                    case 3->{
                        System.out.println("PREORDER TRAVERSAL IS  :");
                        tree.printPreorder1();
                    }
                    case 4->System.exit(0);
                }
            }
        }
    }
    class node {
        node root = null;
        node left = null;
        node right = null;
        int data;

        node(int data) {
            this.data = data;
        }

        node() {

            this.root=null;
        }

        void printPreorder(node n) {
          if (n==null){
              return;
          }
            System.out.println(n.data+" ");
            printPreorder(n.left);
            printPreorder(n.right);
        }
        void printPreorder1(){
            printPreorder(root);
        }
        void printPostorder(node n) {
            if (n==null){
                return;
            }
            printPostorder(n.left);
            printPostorder(n.right);
            System.out.println(n.data+" ");
        }
        void printPostorder1(){
            printPostorder(root);
        }
        void printInorder(node n) {
            if (n==null){
                return;
            }
            printInorder(n.left);
            System.out.println(n.data+" ");
            printInorder(n.right);
        }
        void printInorder1(){
            printInorder(root);
        }
    }

