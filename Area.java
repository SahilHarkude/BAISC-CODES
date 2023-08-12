import java.util.*;
class area
{
    Scanner sc=new Scanner(System.in);
    public void Circle()
    {
        int radius;double area;
        System.out.println("Enter radius");
        radius=sc.nextInt();
        area=radius*radius*3.14;
        System.out.println("Area of circle is: "+area);
    }
    public void Square()
    {
        int side,area;
        System.out.println("Enter side");
        side=sc.nextInt();
        area=side*side;
        System.out.println("Area of square is: "+area);
    }
    public void Rectangle()
    {
        int length,breadth,area;
        System.out.println("Enter length");
        length=sc.nextInt();
        System.out.println("Enter breadth");
        breadth=sc.nextInt();
        area=length*breadth;
        System.out.println("Area of Rectangle is "+area);
    }
    public void Triangle()
    {
        int base,height;double area;
        System.out.println("Enter base");
        base=sc.nextInt();
        System.out.println("Enter height");
        height=sc.nextInt();
        area=((0.5)*base*height);
        System.out.println("Area of Triangle is "+area);
    }

}
public class Area
{
    public static void main(String[] args)
    {
        while(true) {
            area c1 = new area();
            int choice;
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Area Program");
            System.out.println();
            System.out.println("1.Circle");
            System.out.println("2.Square");
            System.out.println("3.Rectangle");
            System.out.println("4.Triangle");
            System.out.println("5.Exit");
            System.out.println("Select a Shape 1-5");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    c1.Circle();
                    System.out.println();
                    break;
                case 2:
                    c1.Square();
                    System.out.println();
                    break;
                case 3:
                    c1.Rectangle();
                    System.out.println();
                    break;
                case 4:
                    c1.Triangle();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Thank you for using the program!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter option between 1-5");
                    System.out.println();
                    break;
            }
        }
    }
}