import java.util.*;
class Area
{
    public void Circle(int radius)
    {
        double area;
        area=radius*radius*3.14;
        System.out.println("AREA OF CIRCLE IS "+area);
    }
}
public class AreaofCircle
{
    public static void main(String[] args)
    {
        int radius;
        System.out.println("ENTER RADIUS");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextInt();
        Area c1=new Area();
        c1.Circle(radius);
    }
}