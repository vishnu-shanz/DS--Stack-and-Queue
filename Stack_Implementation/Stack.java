package Stack_Implementation;

public class Stack {
    int a[]=new int[5];
    int top=-1;
    public void push(int data){
        if(top==a.length){
            System.out.println("Stack is full");
        }
        else{
            top++;
            a[top]=data;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            top--;
        }
    }
    public void peak(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element:"+a[top]);
        }
    }
    public void display(){
        System.out.println("Displaying elements:");
        for(int i=top;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}

