import java.util.Scanner;
class Nude{
    int data;
    Nude next;
    public Nude(int data){
        this.data=data;
        this.next=null;
    }
}
public class StackLL {
    Nude top;
    public void push(int data){
        Nude newnude=new Nude(data);
        newnude.next=top;
        top=newnude;
        printStack();
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        top=top.next;
        printStack();
    }
    public int top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public  int size(){
        int count=0;
        Nude current=top;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public void printStack(){
        System.out.println("Stack:");
        Nude current=top;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StackLL stck1=new StackLL();
        while(true){
            System.out.println("/n choose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Check if stack is empty.");
            System.out.println("5. Get stack size");
            System.out.println("6. Exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter element to push");
                    int ele=sc.nextInt();
                    stck1.push(ele);
                    break;
                case 2:
                    stck1.pop();
                    break;
                case 3:
                    System.out.println("Top element:"+stck1.top());
                    break;
                case 4:
                    System.out.println(stck1.isEmpty());
                    break;
                case 5:
                    System.out.println("Stack size="+stck1.size());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
