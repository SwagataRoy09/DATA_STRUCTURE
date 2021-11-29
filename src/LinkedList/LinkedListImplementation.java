package LinkedList;

import java.util.Scanner;

class Node {
    Node link; //instance variable for accessing the link part of each node
    int data;//instance variable to access the data of the nodes
    Node head = null;//instance variable to access the first  node
    Node(int data) { //made a constructor with parameter data
        this.data = data;
    }
    Node() { //MADE A CONSTRUCTOR WITH NO PARAMETER
        this.link = null;
    }
    void create(int data) {
        Node new_node = new Node(data);//made a new node
        if (head == null) {
            head = new_node;
            return;
        }
        Node p = head;
        while (p.link != null) {
            p = p.link;
        }
        p.link = new_node;
        return;
    }
    void insert_at_begin(int data) {
        Node new_node = new Node(data);//made a new node
        if (head == null) {
            head = new_node;
            return;
        }
        new_node.link = head; //the new node stores the copy of address stored in head
        head = new_node;//now as the new node is storing the value of first node so we can say new node is the head
    }
    void insert_at_end(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            return;
        }
        Node p = head;
        while (p.link != null) {
            p = p.link;

        }
        p.link = new_node;

    }

    void insert_after_node(int data, int x) {
        Node new_node = new Node(data);

        if (head == null) {
            new_node = head;
            return;
        }
        Node p = head;
        while (p.link != null) {
            if (p.data == x) {
                new_node.link = p.link;
                p.link = new_node;
                return;
            }
            p = p.link;
        }
        if (p.data == x) {
            new_node.link = p.link;
            p.link = new_node;
            return;
        }
    }

    void insert_before(int data, int x) {
        Node new_node = new Node(data);

        if (head == null) {
            System.out.println("LIST IS EMPTY");
            return;
        }
        new_node.data = data;
        new_node.link = null;
        if (x == head.data) {
            new_node.link = head;
            head = new_node;
            return;
        }
        Node p = head;
        while (p.link != null) {
            if (p.link.data == x) {
                new_node.link = p.link;
                p.link = new_node;
                return;
            }
            p = p.link;

        }
        System.out.println("ELEMENT NOT FOUND");
        return;

    }

    void insert_at_particular_position(int pos, int data) {
        Node new_node = new Node(data);
        if (head == null) {
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        if (pos == 1) {
            new_node.link = head;
            head = new_node;
            return;
        }
        Node p = head;
        while (pos-- != 0) {
            if (pos == 1) {
                new_node.link = p.link;
                p.link = new_node;
                return;
            }
            p = p.link;
        }
        if (pos != 1) {
            System.out.println("THE INDEX IS OUT OF BOUND");
        }
    }
    void search(int key) {
        if (head == null) {
            System.out.println("LIST IS EMPTY");
            return;
        }
        Node p = head;
        int index = 1;
        while (p != null) {
            if (p.data == key) {
                System.out.println("ELEMENT " + key + " FOUND AT INDEX " + index);
                return;
            }
            p = p.link;
            index++;

        }
        System.out.println("ELEMENT NOT PRESENT");
        return;
    }
    void bubblesort_linkedlist() {
        Node new_node = new Node(data);
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node p = head;
        while (p != null) {
            Node l = p.link;//checking node1 with node2 using two pointers like i and j used in array
            while (l != null) {
                if (p.data > l.data) {
                    int temp = p.data;
                    p.data = l.data;
                    l.data = temp;
                }
                l = l.link;
            }
            p = p.link;
        }
        return;

    }
    void selection_sort(){
        Node new_node=new Node(data);
        if (head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node p=head;
        while (p!=null){
            Node min=p;
            Node l=p.link;
            while(l!=null) {
                if (min.data > l.data) {
                    min = l;
                    return;
                }
                l = l.link;
            }
            if (min != p) {
                if(min.data>p.data){
                    int temp=min.data;
                    min.data=p.data;
                    p.data=temp;
                    return;
                }
            }
            p=p.link;
        }
    }
    void delete_from_beg() {
        Node new_node = new Node(data);

        if (head == null) {
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        int temp = head.data;
        head = head.link;

        System.out.println("DELETED ELEMENT IS" + " " + temp);
        return;
    }
    void delete_the_only_node() {
        head = null;
        return;
    }
    void delete_from_end(int x) {
        Node new_node = new Node(data);
        if (head == null) {
            System.out.println("LINKED LIST IS EMPTY");
            return;
        } else if (head.data == x) {

            head = head.link;
            System.out.println("DELETED ELEMENT IS" + " " + x);
            return;
        }
        Node p = head;
        while (p.link != null) {
            if (p.link.data == x) {
                p.link = p.link.link;
                System.out.println("DELETED ELEMENT IS " + " " + x);
                return;
            }
            p = p.link;
        }
        System.out.println("ELEMENT NOT PRESENT");
        return;
    }
    void deleteAlternate() {
        Node new_node = new Node(data);
        if(head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node p = head;
        while (p!= null) {
            if (p.link == null) {
                return;
            }
            p.link = p.link.link;
            p = p.link;
        }
    }
    void delete_at_particular_position(int pos){
        if (head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        if(pos==1){
            System.out.println("DELETED NODE IS "+ head.data);
            head=head.link;
            return;
        }
        Node p=head;
        for(int i=1;i<pos-1&&p!=null;i++){
            p=p.link;
        }
        if (p==null && p.link==null){
            System.out.println("INDEX OUT OF BOUND");
            return;
        }
        System.out.println("DELETED NODE IS AT POSITION "+pos+" THE DATA IS "+p.link.data);
        p.link=p.link.link;
    }
    void reverse_linked_list(){
        Node new_node=new Node(data);
        if(head==null){
            System.out.println("THE LINKED LIST IS EMPTY");
            return;
        }
        Node p=head;
        Node prev=null;
        Node next;
        while (p!=null){
            next=p.link;
            p.link=prev;
            prev=p;
            p=next;

        }
        head=prev;
    }
    void rotate(int k) {
        if(k==0){
            return;
        }
        Node p = head;
        for (int i=0;i<k-1 && p!=null;i++){
            p=p.link;
        }
        if (p == null) {
            return;
        }
        Node l = p;
        while (p.link != null) {
            p = p.link;
        }
        p.link = head;
        head = l.link;
        l.link=null;
    }
    void display(){
        if (head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        System.out.println("ELEMENTS IN LINKED LIST ARE");
        Node p = head;
        while (p.link != null) {
            System.out.println(p.data);
            p = p.link;
        }
        System.out.println(p.data);
    }
    void display(int data){
        if (head==null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        if (head.data==data){
            System.out.println("PREVIOUS TO THIS NODE IS NULL AND AFTER THE NODE VALUE IS "+head.link.data);
            System.out.println("IN LINKED LIST :"+"NULL "+head.data+" "+head.link.data);
            return;
        }
        Node p=head;
        Node prev=null;
        while (p!=null){
            prev=p;
            p=p.link;
            if(p.data==data){
                System.out.println("BEFORE NODE IS "+prev.data+" AFTER NODE IS "+p.link.data);
                break;
            }
        }
    }
}
public class LinkedListImplementation{
    public static void main(String[] Linkedlist){
        Scanner sc=new Scanner(System.in);
        Node list=new Node();
        System.out.println("[1]CREATE A LINK LIST BY ADDING ELEMENTS\n[2]INSERT AT BEGINNING\n[3]INSERT AT END\n" +
                "[4]INSERT AFTER A NODE\n[5]ENTER BEFORE A NODE\n[6]ENTER AT A PARTICULAR POSITION\n" +
                "[7]SORT THE LINKED LIST USING BUBBLE SORT\n[8]SELECTION SORT\n[9]DELETE THE NODE AT BEGINNING\n" +
                "[10]DELETE THE ONLY NODE\n[11]DELETE THE PARTICULAR DATA\n[12]SEARCH AN ELEMENT USING LINEAR SEARCH\n" +
                "[13]DELETE ALTERNATE NODE\n[14]DELETE NODE AT PARTICULAR POSITION\n[15]REVERSE THE LINKED LIST\n[16]ROTATE\n" +
                "[18]DISPLAY THE BEFORE AND AFTER OF A PARTICULAR NODE\n[19]DISPLAY\n[20]exit");
        linked:
        while (true){
            System.out.println("ENTER YOUR CHOICE :");
            int ch= sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("NUMBER OF NODES YOU WANT TO ENTER");
                    int n= sc.nextInt();
                    System.out.println("ENTER ELEMENTS IN LINKED LIST");
                    while(n-- >0){
                        int n0=sc.nextInt();
                        list.create(n0);}
                    break ;
                case 2:
                    System.out.println("ENTER THE ELEMENT TO BE INSERTED:");
                    int n1 = sc.nextInt();
                    list.insert_at_begin(n1);
                    break;
                case 3:
                    System.out.println("ENTER THE ELEMENT TO BE INSERTED:");
                    int n2=sc.nextInt();
                    list.insert_at_end(n2);
                    break;
                case 4:
                    System.out.println("ENTER THE ELEMENT TO BE INSERTED");
                    int n3=sc.nextInt();
                    System.out.println("THE DATA AFTER WHICH YOU WANT TO ENTER");
                    int n4= sc.nextInt();
                    list.insert_after_node(n3,n4);
                    break;
                case 5:
                    System.out.println("ENTER THE ELEMENT TO BE INSERTED");
                    int n5= sc.nextInt();
                    System.out.println("ENTER THE ELEMENT BEFORE WHICH YOU WANT TO ENTER");
                    int n6=sc.nextInt();
                    list.insert_before(n5,n6);
                    break ;
                case 6:
                    System.out.println("ENTER THE POSITION WHERE YOU WANT TO ENTER THE ELEMENT");
                    int n7=sc.nextInt();
                    System.out.println("ENTER THE ELEMENT YOU WANT TO ENTER");
                    int n8=sc.nextInt();
                    list.insert_at_particular_position(n7,n8);
                    break ;
                case 7:
                    System.out.println("LINKED LIST IS SORTED ");
                    list.bubblesort_linkedlist();
                    list.display();
                    break;
                case 8:
                    System.out.println("LINKED LIST IS SORTED ");
                    list.selection_sort();
                    list.display();
                    break ;
                case 9:
                    list.delete_from_beg();
                    break ;
                case 10:
                    list.delete_the_only_node();
                    System.out.println("THE ONLY NODE IS DELETED NOW LINKED LIST IS EMPTY");
                    break;
                case 11:
                    System.out.println("ENTER THE DATA YOU WANT TO DELETE");
                    int n9= sc.nextInt();
                    list.delete_from_end(n9);
                    break;
                case 12:
                    System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
                    int n10= sc.nextInt();
                    list.search(n10);
                    break ;
                case 13:
                    list.deleteAlternate();
                    break;
                case 14:
                    System.out.println("ENTER THE POSITION OF NODE YOU WANT TO DELETE");
                    int n12=sc.nextInt();
                    list.delete_at_particular_position(n12);
                    break;
                case 15:
                    System.out.println("LINKED LIST IS REVERSED");
                    list.reverse_linked_list();
                    list.display();
                    break ;
                case 16:
                    System.out.println("ENTER THE POSITION OF ELEMENT");
                    int N=sc.nextInt();
                    list.rotate(N);
                    list.display();
                    break;
                case 18:
                    System.out.println("ENTER VALUE OF NODE");
                    int val=sc.nextInt();
                    list.display(val);
                    break;
                case 19:list.display();
                    break;
                case 20:
                    break linked;
                default:
                    System.out.println("ENTER RIGHT CHOICE");
            }
        }
    }
}



