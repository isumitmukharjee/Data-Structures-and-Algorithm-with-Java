// import java.ut/il.*;

public class arrayImplementationOfStack{

    static class stack{
        int size = 10; //can be of any amount but fixed
        int[] arr = new int[size];
        int top = -1;

        void push(int x){
            top++;
            arr[top] =x;
        }

        int pop(){
            int x = arr[top];
            top--;
            return x;
        }

        int size(){
            return top+1;
        }

        int top(){
            return arr[top];
        }

        void display(){
            if(top == -1){
                System.out.println("Empty Stack");
                return;
            }
            System.out.println("Stack Contents top to bottom ");
            for(int i=top;i>=0;i--){
                System.out.println("| "+arr[i]+" |");
            }
        }
    }
    public static void main(String[] args) {
        stack s = new stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        System.out.println("Top of stack before deleting any element "+s.top());
        System.out.println("Size of stack before deleting any element "+s.size());
        System.out.println("Deleted element is "+s.pop());
        System.out.println("Size of stack after deleting any element "+s.pop());
        System.out.println("Top of stack after element deletion "+s.top());
    }
}

