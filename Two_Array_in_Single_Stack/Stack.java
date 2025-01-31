package Two_Array_in_Single_Stack;

public class Stack {
    int[] a = new int[10];

    int top = -1;
    int top2=10;
    public void push(int data) {
        if (top == a.length) {
            System.out.println("Stack is full");
        } else {
            top++;
            a[top] = data;
        }
    }

    public void push1(int data) {
        if(top2-1==top2){
            System.out.println("Stack is full");
        }
        else {
            top2--;
            a[top2] = data;
        }

    }

    public void display() {
        System.out.println("Displaying elements of Stack 1:");
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i]);
        }
        //System.out.println("Displaying elements of Stack 2:");
        for (int i = top2; i<10; i++) {
            System.out.println(a[i]);
        }
    }
}
