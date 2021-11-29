package LinkedList;

import java.util.Scanner;

public class DoubleLinkedList {
    public  static void main(String[] Dlist){
        Scanner sc=new Scanner(System.in);
        Node11 list=new Node11();
        System.out.println("[1]CREATE");
        System.out.println("[2]INSERT AT BEGINNING");
        System.out.println("[3]INSERT AT END");
        System.out.println("[4]INSERT AFTER PARTICULAR NODE");
        System.out.println("[5]INSERT BEFORE PARTICULAR NODE");
        System.out.println("[6]INSERT AT PARTICULAR POSITION");
        System.out.println("[7]DELETE THE NODE AT BEGINNING");
        System.out.println("[8]DELETE THE LAST NODE");
        System.out.println("[9]DELETE PARTICULAR NODE");
        System.out.println("[10]SORTING");
        System.out.println("[11]SEARCH A PARTICULAR NODE");
        System.out.println("[12]DELETE NODE AT PARTICULAR POSITION");
        System.out.println("[13]DELETE THE NODE AFTER PARTICULAR NODE");
        System.out.println("[14]DELETE THE NODE BEFORE THE PARTICULAR NODE");
        System.out.println("[15]REVERSE THE LINKED LIST");
        System.out.println("[19]DISPLAY");
        System.out.println("[20]EXIT");
        doubly:
        while (true){
            System.out.println("PLEASE ENTER YOUR CHOICE");
            int n= sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("NUMBER OF ELEMENTS YOU WANT TO ENTER");
                    int a= sc.nextInt();
                    System.out.println("ENTER THE ELEMENTS");
                    while (a-- >0){
                        int b= sc.nextInt();
                        list.create(b);
                    }
                    break;
                case 2:
                    System.out.println("ENTER THE VALUE TO BE INSERTED");
                    int n0= sc.nextInt();
                    list.insertAtBeginning(n0);
                    break;
                case 3:
                    System.out.println("ENTER THE NODE TO BE INSERTED");
                    int n1=sc.nextInt();
                    list.insertAtEnd(n1);
                    break ;
                case 4:
                    System.out.println("ENTER THE DATA OF NODE AFTER WHICH YOU WANT TO INSERT");
                    int na=sc.nextInt();
                    System.out.println("ENTER THE VALUE TO BE INSERTED");
                    int nb= sc.nextInt();
                    list.insertaftergivennode(na,nb);
                    break;
                case 5:
                    System.out.println("ENTER THE DATA OF NODE BEFORE WHICH YOU WANT TO INSERT THE VALUE");
                    int nc=sc.nextInt();
                    System.out.println("ENTER THE VALUE TO BE INSERTED");
                    int nd=sc.nextInt();
                    list.insertbeforegivennode(nc,nd);
                    break;
                case 6:
                    System.out.println("ENTER THE POSITION WHERE YOU WANT TO INSERT");
                    int p= sc.nextInt();

                    System.out.println("ENTER THE ELEMENT TO BE ENTERED");
                    int n2= sc.nextInt();
                    list.insertAtParticularPos(n2,p);
                    break;
                case 7:
                    list.deleteAtBeginning();
                    break;
                case 8:
                    list.deleteAtEnd();
                    break;
                case 9:
                    System.out.println("ENTER THE NODE YOU WANT TO DELETE");
                    int n3= sc.nextInt();
                    list.deleteparticular(n3);
                    break;
                case 10:
                    list.sorting();
                    System.out.println("SORTED LIST IS : ");
                    list.display();
                    break;
                case 11:
                    System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
                    int n4=sc.nextInt();
                    list.search(n4);
                    break;
                case 12:
                    System.out.println("ENTER THE POSITION OF THE NODE TO BE DELETED");
                    int n5= sc.nextInt();
                    list.deleteatpartpos(n5);
                    break;
                case 13:
                    System.out.println("ENTER THE NODE AFTER WHICH YOU WANT TO DELETE");
                    int n6=sc.nextInt();
                    list.deleteafternode(n6);
                    break;
                case 14:
                    System.out.println("ENTER THE NODE BEFORE WHICH YOU WANT TO DELETE");
                    int n7=sc.nextInt();
                    list.deletebeforenode(n7);
                    break;
                case 15:
                    list.reverse();
                    list.display();
                    break;
                case 19:
                    list.display();
                    break;
                case 20:
                    break doubly;
                default:
                    System.out.println("ENTER VALID CHOICE");
            }
        }

    }
}
class Node11 {
    Node11 link;
    Node11 prev;
    int data;
    Node11 head=null;
    Node11(int data) {
        this.data = data;
    }
    Node11(){
        this.prev=null;
        this.link=null;
    }
    void create(int data){
        Node11 new_node=new Node11(data);
        if (head==null){
            head=new_node;
            return;
        }
        Node11 p=head;
        while (p.link!=null){
            p=p.link;
        }
        p.link=new_node;
        new_node.prev=p;
        return;

    }
    void insertAtBeginning(int data){
        Node11 new_Node11=new Node11(data);
        if (head==null) {
            head = new_Node11;
            return;
        }
        new_Node11.link=head;
        head.prev=new_Node11;
        //new_Node11.prev=null;
        head=new_Node11;
    }
    void insertAtEnd(int data){
        Node11 new_node= new Node11(data);
        if(head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node11 p=head;
        while (p.link!=null){
            p=p.link;
        }
        p.link=new_node;
        new_node.prev=p;
    }
    void insertAtParticularPos(int data,int pos){
        Node11 new_node=new Node11(data);
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        if (pos==1){
            new_node.link=head;
            head.prev=new_node;
            head=new_node;
            return;
        }
        Node11 p=head;
        for (int i=1;i<pos-1 && p!=null;i++){
            p=p.link;
        }
        new_node.link=p.link;
        new_node.prev=p;
        p.link=new_node;
        p=p.link;
    }
    void insertaftergivennode(int pos,int data){
        Node11 new_node=new Node11(data);
        if (head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node11 p=head;
        while (p!=null){
            if (p.data==pos){
                new_node.link=p.link;
                p.link.prev=new_node;
                p.link=new_node;
                new_node.prev=p;
            }
            p=p.link;
        }
    }
    void insertbeforegivennode(int x,int data){
        Node11 new_node=new Node11(data);
        if (head==null){
            System.out.println("THE LINKED LIST IS EMPTY");
            return;
        }
        Node11 p=head;
        while (p!=null){
            if (p.data==x){
                new_node.link=p;
                p.prev.link=new_node;
                new_node.prev=p.prev;
                p.prev=new_node;
            }
            p=p.link;
        }
    }
    void deleteAtBeginning(){
        if (head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        System.out.println("DELETED NODE IS"+" "+head.data);
        head=head.link;
        head.link.prev=null;
    }
    void deleteAtEnd(){
        if(head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node11 p=head;
        while (p.link!=null){
            p=p.link;
        }
        System.out.println("DELETED NODE IS"+" "+p.data);
        p.prev.link=null;
    }
    void deleteparticular(int key){
        if (head==null){
            System.out.println("THE LINKED LIST IS EMPTY");
            return;
        }
        Node11 p=head;
        while (p.link!=null){
            if (p.data==key){
                System.out.println("DELETED NODE IS : "+p.data);
                p.prev.link=p.link;
                p.link.prev=p.prev;
                return ;
            }
            p=p.link;
        }
        System.out.println("DELETED ELEMENT IS : "+p.data);
        p.prev.link=null;
    }
    void sorting(){
        if (head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node11 p=head;
        while (p!=null){
            Node11 l=p.link;
            while (l!=null){
                if (p.data > l.data){
                    int temp = p.data;
                    p.data=l.data;
                    l.data=temp;
                }
                l=l.link;
            }
            p=p.link;
        }
    }
    void search(int key){
        if (head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node11 p=head;
        int i=1;
        while (p!=null) {
            if (p.data == key) {
                System.out.println("ELEMENT FOUND AT INDEX " + i);
                return;
            }
            p = p.link;
            i++;
        }
        System.out.println("ELEMENT NOT PRESENT IN LINKED LIST");
    }
    void deleteatpartpos(int pos){
        if (head==null){
            System.out.println("THE LINKED LIST IS EMPTY");
            return;
        }
        if (pos==1){
            System.out.println("DELETED NODE IS :"+" "+head.data);
            head=head.link;
            return;
        }
        Node11 p=head;
        for (int i=1;i<pos-1 &&p!=null;i++) {
            p = p.link;
        }
        if (p==null && p.link==null){
            System.out.println("INDEX OUT OF BOUND");
            return;
        }
        System.out.println("DELETED NODE IS "+p.link.data);
        p.link=p.link.link;
        p.link.link.prev=p;
    }
    void deleteafternode(int x){
        if (head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node11 p=head;
        while (p.link!=null){
            if(p.data==x){
                p.link=p.link.link;
                p.link.link.prev=p;
                return;
            }
            p=p.link;
        }
        if (p.data==x){
            p.prev.link=null;
        }
    }
    void deletebeforenode(int x){
        if (head== null){
            System.out.println("THE LINKED LIST IS EMPTY");
            return;
        }
        Node11 p=head;
        while (p!=null){
            if (p.data==x){
                p.prev=p.prev.prev;
                p.prev.link=p;
            }
            p=p.link;
        }

    }
    void reverse(){
        if (head==null){
            System.out.println("THE LINKED LIST IS EMPTY");
            return;
        }
        Node11 p= head;
        Node11 next=p.link;

        while (p!=null){
            //    next=p.link;
            next.prev=next.link;
            next.link=p;
            //p.prev=p;
            p=next;
            //next=next.prev;
        }
    }
    void display(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        Node11 p= head;
        System.out.println("ELEMENTS IN DOUBLE LINKED LIST ARE : ");
        while (p!=null){
            System.out.println(p.data);
            p=p.link;
        }
    }
}
