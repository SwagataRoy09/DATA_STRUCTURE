package Queue;
import java.util.Scanner;
public class CircularQueueImplementation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("[1]INSERT");
        System.out.println("[2]DELETE");
        System.out.println("[3]PEEK");
        System.out.println("[4]DISPLAY");
        System.out.println("[5]EXIT");
        q queues=new q();
        queueq:
        while (true){
            System.out.println("ENTER YOUR CHOICE");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("ENTER THE VALUE YOU WANT TO INSERT");
                    int n0= sc.nextInt();
                    queues.insert(n0);
                    break;
                case 2:
                    queues.delete();
                    break;
                case 3:
                    queues.peek();
                    break;
                case 4:
                    queues.display();
                    break;
                case 5:
                    break queueq;
                default:
                    System.out.println("ENTER VALID CHOICE");
            }
        }
    }
}
class q{
    int n=1000;
    int[] array=new int[n];
    int rear=-1;
    int front=-1;
    void insert(int x){
        if (rear==n-1 && front==0||front==rear+1){
            System.out.println("QUEUE OVERFLOW");
            return;
        }
        if(rear==n-1){
            rear=0;
        }
        if (front==-1){
            front=0;
        }
        rear++;
        array[rear]=x;
    }
    void delete(){
        if (rear==-1 && front==-1){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        int x=array[front];
        System.out.println("THE DELETED ELEMENT IS : "+x);
        front++;
    }
    void peek(){
        if (rear==-1 && front==-1){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        System.out.println("THE INDEX OF REAR IS : "+rear+" THE ELEMENT AT REAR IS : "+array[rear]);
        System.out.println("THE INDEX OF FRONT IS : "+front+" THE ELEMENT IS : "+array[front]);
    }
    void display(){
        if (front==-1 && rear==-1){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        for (int i=front;i<=rear;i++){
            System.out.println(array[i]);
        }
    }
}
