package TREE;
import java.util.Scanner;
public class Traversal_Using_Recursion {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            node tree=new node();
            System.out.println("[2]INSERT\n" +
                    "[3]DELETE\n"+"[4]PREORDER TRAVERSAL\n"+
                    "[5]EXIT");
            while (true){
                System.out.println("ENTER YOUR CHOICE");
                int choice=sc.nextInt();
                switch (choice){
                    case 2-> {
                        System.out.println("ENTER THE NUMBER YOU WANT TO INSERT");
                        int n1= sc.nextInt();
                        tree.insert(n1);
                    }
                    case 4->{
                        System.out.println("PREORDER TRAVERSAL IS  :");
                        tree.printPreorder1();
                    }
                    case 5->System.exit(0);
                }
            }
        }
    }
    class node {
        node left = null;
        node right = null;
        node root = null;
        int data;

        node(int data) {
            this.data = data;
        }

        node() {
            this.left = null;
            this.right = null;
        }

        void insert(int data) {
            node new_node = new node(data);
            if (root == null) {
                root = new_node;
            } else {
                if (left == null) {
                    root.left = new_node;
                } else if (right==null){
                    root.right = new_node;
                }
            }
        }

        void printPreorder(node n) {
          if (n==null){
              System.out.println("TREE EMPTY");
              return;

          }
            System.out.println(n.data+" ");
            printPreorder(n.left);
            printPreorder(n.right);
        }
        void printPreorder1(){
            printPreorder(root);
        }
    }

