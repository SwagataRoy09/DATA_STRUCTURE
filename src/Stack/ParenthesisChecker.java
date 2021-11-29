package Stack;
import java.util.Scanner;
public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER THE EXPRESSION ");
        String str=sc.nextLine();
        boolean bool = false;
        parenthesis p = new parenthesis();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
                p.push(str.charAt(i));
            }
            if (str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']'){
                if (p.top==-1){
                    bool = true;
                }
                else {
                    char temp = p.pop();
                    if (str.charAt(i) == ')' && (temp == '{' || temp == '[')) {
                        bool = true;
                    } if (str.charAt(i) == '}' && (temp == '(' || temp == '[')) {
                        bool = true;
                    } if (str.charAt(i) == ']' && (temp == '(' || temp == '{')) {
                        bool = true;
                    }
                }
            }
        }
        if(p.top!=-1){
            bool=true;
        }
        if (bool==false){
            System.out.println(" VALID EXPRESSION ");
        }
        else
            System.out.println(" INVALID EXPRESSION ");
    }
}
class parenthesis{
    int max=1000,top=-1;
    char[] stack=new char[max];
    void push(char c){
        if (top==max-1){
            System.out.println(" STACK IS FULL ");
            return;
        }
        top++;
        stack[top]=c;
    }
    char pop(){
        if (top==-1){
            System.out.println(" THE STACK IS EMPTY ");
        }
        char c=stack[top];
        top--;
        return c;
    }
}

