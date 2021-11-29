package LinkedList;
import java.util.Scanner;
public class CircularLinkedList {
    public static void main(String[] circular) {
        Scanner sc = new Scanner(System.in);
        Node12 list1=new Node12();
        System.out.println("[1]CREATE");
        System.out.println("[2]INSERT AT BEGINNING");
        System.out.println("[3]INSERT AT END");
        System.out.println("[4]INSERT AFTER PARTICULAR NODE");
        System.out.println("[5]DELETE THE NODE AT BEGINNING");
        System.out.println("[6]DELETE THE LAST NODE");
        System.out.println("[9]DISPLAY");
        System.out.println("[10]EXIT");
        circularlist:
        while (true) {
            System.out.println("ENTER YOUR CHOICE");
            int ch= sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("NUMBER OF ELEMENTS YOU WANT TO INSERT");
                    int n=sc.nextInt();
                    System.out.println("ENTER THE VALUE");
                    int i=1;
                    while (n-->0){
                        int n0 = sc.nextInt();
                        list1.create(n0);
                    }
                    break;
                case 2:
                    System.out.println("ENTER THE VALUE YOU WANT TO ADD");
                    int n1=sc.nextInt();
                    list1.addtobeginning(n1);
                    break;
                case 3:
                    System.out.println("ENTER THE VALUE TO BE INSERTED");
                    int n2=sc.nextInt();
                    list1.addtoend(n2);
                    break ;
                case 4:
                    System.out.println("ENTER THE VALUE AFTER WHICH YOU WANT TO INSERT");
                    int x=sc.nextInt();
                    System.out.println("ENTER THE VALUE TO BE INSERTED");
                    int n3=sc.nextInt();
                    list1.addafter(x,n3);
                    break;
                case 5:
                    list1.deleteatbeg();
                    break;
                case 6:
                    list1.deleteatend();
                    break;
                case 9:
                    list1.display();
                    break;
                case 10:
                    break circularlist;
            }
        }
    }
}
class Node12{
    Node12 last=null;
    Node12 link;
    int data;
    Node12(int data){
        this.data=data;
    }
    Node12(){
        this.link=null;
    }
    void create(int data){
        Node12 new_node=new Node12(data);
        if (last==null){
            last=new_node;
            last.link=last;
            return;
        }
        new_node.link=last.link;
        last.link=new_node;
        last=new_node;
    }
    void addtobeginning(int data){
        Node12 new_node=new Node12(data);
        if(last==null){
            last=new_node;
            last.link=last;
            return;
        }
        new_node.link=last.link;
        last.link=new_node;
    }
    void addtoend(int data){
        Node12 new_node=new Node12(data);
        if (last.link==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        new_node.link=last.link;
        last.link=new_node;
        last=new_node;
    }
    void addafter(int x,int data){
        Node12 new_node= new Node12(data);
        if (last.link==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node12 p=last.link;
        do {
            if (p.data==x) {
                new_node.link = p.link;
                p.link = new_node;
                if (p==last)
                {
                    last=new_node;
                }
            }
            p=p.link;
        }while (p!=last.link);
    }
    void deleteatbeg(){
        if (last==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        last.link=last.link.link;
    }
    void deleteatend(){
        if (last.link == null) {
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node12 p=last.link;
        while (p.link!=last){
            p=p.link;
        }
        p.link=last.link;
        last=p;
    }
    void display()
    {
        if (last.link == null) {
            System.out.println("THE LINKED LIST IS EMPTY");
            return;
        }
        Node12 t = last.link;
        do {
            System.out.println(t.data);
            t = t.link;
        }
        while(t!=last.link);
    }
}

