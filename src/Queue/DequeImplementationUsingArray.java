package Queue;
import java.util.Scanner;
public class DequeImplementationUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("[1]INSERT AT FRONT");
        System.out.println("[2]INSERT AT END");
        System.out.println("[3]DELETE FROM FRONT");
        System.out.println("[4]DELETE FROM END");
        System.out.println("[5]DISPLAY");
        System.out.println("[6]EXIT");
        deque d=new deque();
        while (true) {
            System.out.println("ENTER YOUR CHOICE");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("ENTER THE VALUE TO BE INSERTED");
                    int n0= sc.nextInt();
                    d.insertatfront(n0);
                    break;
                case 2:
                    System.out.println("ENTER THE VALUE TO BE INSERTED");
                    int n1=sc.nextInt();
                    d.insertatend(n1);
                    break;
                case 3:
                    d.delete();
                    break;
                case 4:
                case 5:
                    d.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
class deque{
    int rear=-1;
    int front=-1;
    int max=10000;
    int[] dq=new int[max];
    void insertatfront(int x){
        if (rear==max-1 && front==0 || front==rear+1){
            System.out.println("THE QUEUE IS OVERFLOW");
            return;
        }
        if (front==-1){
            front=0;
            //rear=0;
        }
        if (front==0){
            front=max-1;
        }
        dq[front]=x;
        front--;
    }
    void insertatend(int data){
        if (rear==max-1 && front==0 || front==rear+1){
            System.out.println("QUEUE IS OVERFLOW");
            return;
        }
        if (rear==max-1){
            rear=0;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        dq[rear]=data;
    }
    void delete(){
        if (rear==-1 && front==-1){
            System.out.println("QUEUE UNDERFLOW");
            return;
        }
        int x=dq[front];
        System.out.println("THE DELETED VALUE IS : "+x);
        front++;
    }
    void display(){
        if (rear==-1 && front==-1){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        for (int i=front;i<=rear;i++){
            System.out.println(dq[i]);
        }
    }
}
