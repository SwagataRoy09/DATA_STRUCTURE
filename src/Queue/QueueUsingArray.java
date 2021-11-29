package Queue;
import java.util.Scanner;
public class QueueUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1]PUSH");
        System.out.println("[2]DELETE");
        System.out.println("[3]DISPLAY");
        System.out.println("[4]EXIT");
        queue qq = new queue();
        queueQ:
        while (true) {
            System.out.println("ENTER YOUR CHOICE");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("ENTER THE VALUE TO BE INSERTED");
                    int n0 = sc.nextInt();
                    qq.push(n0);
                    break;
                case 2:
                    qq.delete();
                    break;
                case 3:
                    qq.display();
                    break;
                case 4:
                    break queueQ;
            }
        }
    }
}
class queue{
    int rear=-1;
    int front=-1;
    int n=1000;
    int[] q=new int[n];
    void push(int x){
        if (rear==n-1){
            System.out.println("QUEUE OVERFLOW");
            return;
        }
        if (front==-1) {
            front=0;
        }
        rear++;
        q[rear]=x;
    }
    void delete(){
        if (front==-1 && rear==-1){
            System.out.println("QUEUE EMPTY");
            return;
        }
        int x=q[front];
        System.out.println("DELETED ITEM IS : "+x);
        front++;
    }
    void display(){
        if ( front==-1 || front==rear+1 ){
            System.out.println("QUEUE UNDERFLOW");
            return;
        }
        for (int i=front;i<=rear;i++){
            System.out.println(q[i]);
        }
    }
}
