import java.util.*;

class Operations
{
    static int top=-1;
    static int size=5;
    static int stack[]=new int[size];
    public void push(int element)
    {
          if(top==size-1)
          {
              System.out.println("Overflow!! Cannot add element");
          }
          else
          {
              top=top+1;
              stack[top]=element;
          }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Underflow!! Cannot remove element");
        }
        else
        {
            System.out.println("Element popped:"+stack[top]);
            top=top-1;
        }
    }
    public void show()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Elements of Stack are");
            for (int i = 0; i < size; i++) {
                System.out.print(stack[i] + " ");
            }
        }
    }
}

public class Stack_Using_Array
{
    public static void main(String[] args)
    {
        while(true)
        {
            Operations o1=new Operations();
            Scanner sc = new Scanner(System.in);
            System.out.print("1.Push\n2.Pop\n3.Show\n4.Exit\n");
            System.out.println("Select an option 1-4");
            int option = sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("Enter element to be added");
                    int element=sc.nextInt();
                    o1.push(element);
                    System.out.println();
                    break;
                case 2:
                    o1.pop();
                    System.out.println();
                    break;
                case 3:
                    o1.show();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Byee");
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}