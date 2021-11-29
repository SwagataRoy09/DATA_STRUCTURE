package Queue;

import java.util.Scanner;

public class queueUsingLinkedList {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        queuelink qq=new queuelink();
        System.out.println("[1]INSERT");
        System.out.println("[2]DELETE");
        System.out.println("[3]DISPLAY");
        System.out.println("[4]PEEK");
        System.out.println("[5]EXIT");
        q:
        while (true){
            System.out.println("ENTER YOUR CHOICE");
            int ch= sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("ENTER THE VALUE TO BE INSERTED");
                    int n0= sc.nextInt();
                    qq.insert(n0);
                    break;
                case 2:
                    qq.delete();
                    break;
                case 3:
                    qq.display();
                    break;
                case 4:
                    qq.peek();
                    break;
                case 5:
                    break q;
            }
        }
    }
}
class queuelink{
    queuelink front=null;
    queuelink rear=null;
    queuelink link;
    int data;
    queuelink(int data){
        this.data=data;
    }
    queuelink(){
        this.link=null;
    }
    void insert(int data){
        queuelink new_node=new queuelink(data);
        if (new_node==null){
            System.out.println("MEMORY NOT AVAILABLE");
            return;
        }
        if (front==null) {
            front = new_node;
            return;
        }
        queuelink p=front;
        while (p.link!=null){
            p=p.link;
        }
        p.link=new_node;
    }
    void delete(){
        if (front==null){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        System.out.println("DELETED VALUE IS : "+front.data);
        front=front.link;
    }
    void peek(){
        System.out.println("THE PEEK ELEMENT IS");
        System.out.println(front.data);
    }
    void display(){
        if (front==null){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        queuelink p=front;
        while (p!=null){
            System.out.println(p.data);
            p=p.link;
        }
    }
}
