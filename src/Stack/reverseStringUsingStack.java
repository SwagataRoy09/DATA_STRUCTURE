package Stack;
import java.util.Scanner;
public class reverseStringUsingStack {
    public static void main(String[] args) {
        reverse s = new reverse();
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER THE STRING HERE : ");
        String str = sc.nextLine();
        for (int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        char[] str1=new char[str.length()];
        for (int i=0;i<str.length();i++){
            str1[i]=s.pop();
        }
        System.out.println(" THE REVERSED STRING IS : ");
        System.out.println(str1);
    }
}
class reverse {
    int max = 10000;
    int top = -1;
    char[] stack = new char[max];
    void push(char c){
        if (top==max-1){
            System.out.println(" THE STACK IS FULL ");
            return;
        }
        top++;
        stack[top]=c;
    }
    char pop() {
        if (top == -1) {
            System.out.println(" THE STACK IS EMPTY ");
        }
        char c = stack[top];
        System.out.println(" DELETED CHARACTER IS : " + c);
        top--;
        return c;
    }
}