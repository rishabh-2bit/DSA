package Stack;
public class Stack {
    int n; // size of the stack
    int top; // index of topmost element in stack initially -1
    int[] arr; // array to stores element of stack

    Stack(int n){
        this.n = n;
        this.top = -1;
        this.arr = new int[n];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (n-1 == top);
    }

    public void push(int pushValue){
        if(!isFull()){
            top++;
            arr[top] = pushValue;
        } else {
            System.out.println("stack is full");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int popValue = top;
            top--;
            return arr[popValue];
        } else {
            return -1;
        }

    }

    public int peek(){
        if(!isEmpty()){
            return arr[top];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws Exception {
        Stack s = new Stack(101);
        
    }

    
    
}
