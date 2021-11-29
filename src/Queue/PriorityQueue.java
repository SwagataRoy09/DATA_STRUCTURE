package Queue;
import java.util.Scanner;
public class PriorityQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("[1]INSERT");
        System.out.println("[2]DELETE");
        System.out.println("[3]DISPLAY");
        System.out.println("[4]PEEK");
        System.out.println("[5]EXIT");
        priority q=new priority();
        while (true){
            System.out.println("ENTER YOUR CHOICE");
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("ENTER THE PRIORITY");
                    int p1=sc.nextInt();
                    System.out.println("ENTER THE VALUE TO BE INSERTED");
                    int p2=sc.nextInt();
                    q.insert(p2,p1);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
class priority{
    priority link;
    priority front;
    priority rear;
    int data;
    int prio;
    priority(int data,int prio){
        this.data=data;
        this.prio=prio;
    }
    priority(){
        this.link=null;
    }
    void insert(int data,int prio){
        priority new_node=new priority(data,prio);
        if (new_node==null){
            System.out.println("QUEUE OVERFLOW");
            return;
        }
      /*  if (front==null && rear==null){
            front=new_node;
            return;
        }*/
        priority p=front;
        if ( front==null && rear==null || front.prio>new_node.prio){
            new_node.link=front;
            front=new_node;
            return;
        }
        while (p.link!=null && p.link.prio<new_node.prio){
            p=p.link;
        }
        new_node.link=p.link;
        p.link=new_node;
    }
    void delete(){
        if (rear==null && front==null){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        System.out.println("DELETED ITEM IS : "+front.data);
        front=front.link;
    }
    void peek(){
        if (rear==null && front==null){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        System.out.println("THE FRONT ELEMENT IS : "+front.data);
        System.out.println("THE PRIORITY OF FRONT ELEMENT IS : "+front.prio);
    }
    void display(){
        if (front==null && rear==null){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        priority p=front;
        while (p!=null) {
            System.out.println(p.prio + " " + p.data);
            p=p.link;
        }
    }
}

