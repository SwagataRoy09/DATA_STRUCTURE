package Queue;
import java.util.Scanner;
public class queueUsingCircularLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("[1]INSERTION");
        System.out.println("[2]DELETION");
        System.out.println("[3]PEEK");
        System.out.println("[4]DISPLAY");
        System.out.println("[5]EXIT");
        circularqueue qt=new circularqueue();
        circular:
        while (true){
            System.out.println("ENTER YOUR CHOICE");
            int ch= sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("THE VALUE TO BE INSERTED");
                    int n0=sc.nextInt();
                    qt.insert(n0);
                    break;
                case 2:
                    qt.delete();
                    break;
                case 3:
                    qt.peek();
                    break;
                case 4:
                    qt.display();
                    break;
                case 5:
                    break circular;
            }
        }
    }
}
class circularqueue{
    circularqueue rear=null;
    int data;
    circularqueue link;
    circularqueue(int data){
        this.data=data;
    }
    circularqueue(){
        this.link=null;
    }
    void insert(int data){
        circularqueue new_node=new circularqueue(data);
        if (rear==null){
            rear=new_node;
            new_node.link=rear;
            return;
        }
        new_node.link=rear.link;
        rear.link=new_node;
        rear=new_node;
    }
    void delete(){
        if (rear.link== null){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        if (rear==rear.link){
            System.out.println("DELETED NODE IS : "+rear.data);
            rear.link=null;
            return;
        }
        System.out.println("DELETED NODE IS : "+rear.link.data);
        rear.link=rear.link.link;
    }
    void peek(){
        if (rear.link==null){
            System.out.println("THE QUEUE IS EMPTY");
            return;
        }
        System.out.println("FRONT ELEMENT IS : "+rear.link.data);
    }
    void display(){
        if (rear.link==null){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        circularqueue p=rear.link;
        do {
            System.out.println(p.data);
            p=p.link;
        }while (p!=rear.link);
    }
}
