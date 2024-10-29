import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Problem 1
    Scanner scan = new Scanner(System.in);
    
    int num1;
    int num2;

    System.out.println("please input 2 integers");
    num1 = scan.nextInt();
    num2 = scan.nextInt();

    double quotient;
    if (num2 != 0)
    {
      quotient = (double) num1/num2;
      System.out.println(quotient);
    }
    else
    {
      System.out.println("cannot print number");
    }
    // System.out.println("1: " + num1 + "\n2: " + num2);


    // TODO: Problem 2
    Scanner scan1 = new Scanner(System.in);

    int a;
    int b;


    System.out.println("please input 2 integers");

    a = scan.nextInt();
    b = scan.nextInt();
    
    if (b == 0)
    {
      System.out.println("error");
    }
    else 
    {
      if (a % b == 0)
      {
        System.out.println("is a factor");
      }
    }

    // TODO: Problem 3

  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    // implement solution here
    System.out.println("Rectangles are equal:");
    if (r1.getLength() == r2.getLength() && r1.getWidth() == r2.getWidth())
    {
      return true;
    }
    return false;
  }
}
