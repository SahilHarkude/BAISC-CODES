import java.util.*;
public class CALCULATOR {
    public static void main(String[] args) {
        int a;
        int b;
        while (true)
        {
            System.out.println("THIS IS A CALCULATOR");
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.MULTIPLICATION");
            System.out.println("4.DIVISION");
            System.out.println("5.EXIT");
            System.out.println("SELECT THE OPERATION TO BE PERFORMED");
            Scanner sc = new Scanner(System.in);
            int operator = sc.nextInt();

            switch (operator)
            {
                case 1:
                    System.out.println("ENTER FIRST NUMBER");
                    a = sc.nextInt();
                    System.out.println("ENTER SECOND NUMBER");
                    b = sc.nextInt();
                    System.out.println("SUM =" + a + b);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("ENTER FIRST NUMBER");
                    a = sc.nextInt();
                    System.out.println("ENTER SECOND NUMBER");
                    b = sc.nextInt();
                    System.out.println("DIFFERENCE =" + (a - b));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("ENTER FIRST NUMBER");
                    a = sc.nextInt();
                    System.out.println("ENTER SECOND NUMBER");
                    b = sc.nextInt();
                    System.out.println("PRODUCT =" + (a * b));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("ENTER FIRST NUMBER");
                    a = sc.nextInt();
                    System.out.println("ENTER SECOND NUMBER");
                    b = sc.nextInt();
                    System.out.println("QUOTIENT =" + (a / b));
                    System.out.println("REMAINDER ="+(a%b));
                    System.out.println();
                    break;
                case 5:
                    System.out.println("THANK YOU FOR USING THE CALCULATOR");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ENTER OPTION BETWEEN 1-5");
                    System.out.println();
                    break;
            }
        }
    }
}