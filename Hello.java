import java.util.Scanner;
class Hello
{
  public static void main(String args [])
  {
  Scanner sp = new Scanner(System.in);
  System.out.println("Input first number: ");
  int a = sp.nextINT();
  
  System.out.println("Input second number: ");

  int b = sp.nextINT();
  int c = a*b;
  
  System.out.println(a+"* "+b+"="+c);
  //System.out.println("Display name= "+name);
  }
}