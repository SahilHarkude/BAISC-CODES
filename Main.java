import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> StudentName=new ArrayList<>();
        System.out.print("Enter no of students: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter student "+(i+1)+" name");
            String name=sc.next();
            StudentName.add(name);
        }

        System.out.println("The ArrayList is shown below");
        for(int i=0;i<num;i++)
        {
            System.out.print(StudentName.get(i)+" ");
        }
    }
}