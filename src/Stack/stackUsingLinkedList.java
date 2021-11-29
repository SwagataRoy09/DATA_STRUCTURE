package Stack;
import java.util.Scanner;
public class stackUsingLinkedList {
    public static void main(String[] args) {
        Node22 stack = new Node22();
        Scanner sc=new Scanner(System.in);
        System.out.println("[1]PUSH");
        System.out.println("[2]POP");
        System.out.println("[3]DISPLAY");
        System.out.println("[4]PEEK");
        System.out.println("[5]EXIT");
        stack:
        while (true){
            System.out.println("ENTER YOUR CHOICE");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("ENTER THE VALUE TO BE INSERTED IN STACK");
                    int n0= sc.nextInt();
                    stack.push(n0);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    stack.peek();
                    break;
                case 5:
                    break stack;
            }
        }
    }
}
class Node22 {
    Node22 top = null;
    int data;
    Node22 link;

    Node22(int data) {
        this.data=data;
    }
    Node22(){
        this.link=null;
    }
    void push(int data){
        Node22 new_node=new Node22(data);
        if (top==null){
            top=new_node;
            return;
        }
        new_node.link=top;
        top=new_node;
    }
    void pop(){
        if (top==null){
            System.out.println("THE STACK IS EMPTY");
            return;
        }
        System.out.println("DELETED VALUE IS :"+" "+top.data);
        top=top.link;
    }
    void display(){
        if (top==null){
            System.out.println("THE STACK IS EMPTY");
            return;
        }
        Node22 p=top;
        while (p!=null){
            System.out.println(p.data);
            p=p.link;
        }
    }
    void peek(){
        if (top==null){
            System.out.println("THE STACK IS EMPTY");
            return;
        }
        System.out.println("TOP ELEMENT IS : "+top.data);
    }
}


