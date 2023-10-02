import java.util.*;

class Operations
{
    static int rear=-1;
    static int front=-1;
    static int size=5;
    static int queue[]=new int[size];
    public void enqueue(int element)
    {
        if(rear==size-1)
        {
            System.out.println("Overflow! Cannot add element");
        }
        else
        {
            if(front==-1 && rear==-1)
            {
                front=0;
                rear=0;
            }
            else
            {
                rear++;
            }
            queue[rear]=element;
        }
    }
    public void dequeue()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Underflow! Cannot remove element");
        }
        else
        {
            int element=queue[front];
            System.out.println(element+" is deleted");
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else
            {
                front++;
            }
        }
    }
    public void show()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty!");
        }
        else
        {
            System.out.println("Elmenets of Queue are: ");
            for(int i=0;i<size;i++)
            {
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
}

public class Queue_Using_Array
{
    public static void main(String[] args)
    {
        while(true)
        {
            Operations o1=new Operations();
            Scanner sc = new Scanner(System.in);
            System.out.print("1.Enqueue\n2.Dequeue\n3.Show\n4.Exit\n");
            System.out.println("Select an option 1-4");
            int option = sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("Enter element to be added");
                    int element=sc.nextInt();
                    o1.enqueue(element);
                    System.out.println();
                    break;
                case 2:
                    o1.dequeue();
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