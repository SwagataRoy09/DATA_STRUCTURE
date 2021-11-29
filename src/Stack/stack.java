package Stack;
import java.util.Scanner;
public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1]PUSH");
        System.out.println("[2]POP");
        System.out.println("[3]DISPLAY");
        System.out.println("[4]PEEK");
        System.out.println("[5]EXIT");
        stackusingArray st=new stackusingArray();
        stackss:
        while(true){
            System.out.println(" ENTER YOUR CHOICE ");
            int c= sc.nextInt();
            switch(c){
                case 1:
                    System.out.println(" ENTER THE ELEMENT TO BE PUSHED IN STACK ");
                    int n0=sc.nextInt();
                    st.push(n0);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    st.peek();
                    break;
                case 5:
                    break stackss;
            }
        }
    }
}
class stackusingArray{
    int top=-1;
    int max=10000;
    int[] stacks=new int[max];
    void push(int data){
        if (top == max - 1){
            System.out.println("STACK IS FULL");
            return;
        }
        top++;
        stacks[top]=data;
    }
    void pop(){
        if (top==-1){
            System.out.println("STACK IS EMPTY");
            return;
        }
        int x=stacks[top--];
        System.out.println("THE ELEMENT DELETED IS :"+" "+x);
    }
    void peek(){
        if (top==-1){
            System.out.println("STACK IS EMPTY");
            return;
        }
        int x=stacks[top];
        System.out.println("THE TOP ELEMENT IS : "+x);
    }
    void display(){
        if (top==-1){
            System.out.println("STACK IS EMPTY");
            return;
        }
        System.out.println("ELEMENTS IN STACK ARE : ");
        for (int i=top;i>-1;i--){
            System.out.println(stacks[i]+" ");
        }
    }
}



