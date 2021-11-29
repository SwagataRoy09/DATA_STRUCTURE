package Stack;
import java.util.Scanner;
public class MultiStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] INSERT IN STACK A");
        System.out.println("[2] INSERT IN STACK B");
        System.out.println("[3] DELETE FROM STACK A");
        System.out.println("[4] DELETE FROM STACK B");
        System.out.println("[5] DISPLAY STACK A");
        System.out.println("[6] DISPLAY STACK B");
        System.out.println("[7] EXIT");
        multi st=new multi();
        while (true){
            System.out.println(" ENTER YOUR CHOICE ");
            int choice=sc.nextInt();
            switch (choice){
                case 1->{
                    System.out.println(" ENTER THE VALUE TO BE INSERTED ");
                    int n1=sc.nextInt();
                    st.insertAtStackA(n1);
                }
                case 2->{
                    System.out.println(" ENTER THE VALUE TO BE INSERTED ");
                    int n2= sc.nextInt();
                    st.insertAtStackB(n2);
                }
                case 3->st.popFromStackA();
                case 4->st.popFromStackB();
                case 5->st.displayStackA();
                case 6->st.displayStackB();
                case 7->System.exit(7);
                default->System.out.println("ENTER VALID CHOICE");
            }
        }
    }
}
class multi{
    int max=10000;
    int topA=-1;
    int topB=max;
    int[] stack=new int[max];
    void insertAtStackA(int data){
        if (topA==topB-1){
            System.out.println(" STACK OVERFLOW ");
            return;
        }
        topA++;
        System.out.println(" THE INSERTED ELEMENT IS : "+data);
        stack[topA]=data;
    }
    void popFromStackA(){
        if (topA==-1){
            System.out.println(" STACK UNDERFLOW ");
            return;
        }
        int data=stack[topA];
        System.out.println(" THE DELETED ITEM : "+data);
        topA--;
    }
    void insertAtStackB(int data){
        if (topB-1==topA){
            System.out.println(" STACK OVERFLOW ");
            return;
        }
        topB--;
        System.out.println(" THE INSERTED ELEMENT IS : "+data);
        stack[topB]=data;
    }
    void popFromStackB(){
        if (topB==max){
            System.out.println(" THE STACK IS EMPTY ");
            return;
        }
        int data = stack[topB];
        System.out.println(" THE DELETED ITEM IS : "+data);
        topB++;
    }
    void displayStackA(){
        if (topA==-1){
            System.out.println("THE STACK IS EMPTY");
            return;
        }
        System.out.println("THE ELEMENTS OF STACK A ARE");
        for (int i=topA;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    void displayStackB(){
        if (topB==max){
            System.out.println(" THE STACK IS EMPTY ");
            return;
        }
        System.out.println(" THE ELEMENTS OF STACK B ARE ");
        for (int i=topB;i<max;i++){
            System.out.println(stack[i]);
        }
    }
}

