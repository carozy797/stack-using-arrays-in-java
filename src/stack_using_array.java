import java.util.Scanner;
// creating the stackArray class
class StackArray{
    // LIMIT is the length of the stack
    // we say top = -1 to mean there is nothing in the stack ... elements are stored from index 0 - LIMIT -1
    int LIMIT = 5;
    int[] stack_arr = new int[LIMIT];
    int top = -1;
    // check if stack is empty ... if top is still -1 then return true
    boolean isEmpty(){
        return (top == -1);
    }
    // check if stack is full
    boolean isFull(){
        return (top == LIMIT-1);
    }
    // the push function in stack
    boolean push(int numb){
        if(isFull()){
            System.out.println("stack overflow");
            return false;
        }
        else{
            top++;
            stack_arr[top] = numb;
            System.out.println("item pushed into stacked ... top is now " + top);
            return true;
        }
    }
    // the pop function .... this can be modified to return the pop item
    boolean pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return false;
        }
        else{
            top--;
            stack_arr[top+1] = 0;
            System.out.println("pop successful");
            return true;
        }
    }
    // examine the last element in the stack at any time
    boolean peek(){
        if(isEmpty()){
            System.out.println("no value in stack yet");
            return false;
        }
        else{
            int peek = stack_arr[top];
            System.out.println("the peek value is " + peek);
            return true;
        }
    }
    // print all the elements in the stack array
    void display(){
        System.out.println("displaying element in stack ........");

        for(int i : stack_arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

}

public class stack_using_array {
    public static void main (String[] args){
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("This program implements the stack using array");
        System.out.println("---------------------------------------------");

        StackArray stack = new StackArray();
        while (choice != 4){
            System.out.println("select the options below....");
            System.out.println(" 1 ----- push \n 2 ----- pop \n 3 ----- display \n 4 ----- quit \n 5 ----- peak value");
            System.out.print("input option: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: {
                    System.out.print("enter a number to push: ");
                    int number = sc.nextInt();
                    stack.push(number);
                    break;
                }
                case 2: {
                    stack.pop();
                    break;
                }
                case 3: {
                    stack.display();
                    break;
                }
                case 4: {
                    System.out.println("exiting .....");
                    System.exit(0);
                    break;
                }
                case 5: {
                    stack.peek();
                    break;
                }
                default: {
                    System.out.println("enter a valid number");
                }
            }

        }
    }
}
