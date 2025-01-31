package Queueimplementation;

public class Queue {
    int a[]=new int[5];
    int front=-1;
    int rear=-1;
    public void enqueue(int data){
        if(front==-1 && rear==-1){
            front++;
            rear++;
            a[rear]=data;
        }
        else{
            rear++;
            a[rear]=data;
        }
    }
    public void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty");
        }
        else {
            front++;
        }
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(a[i]);
        }
    }
}
