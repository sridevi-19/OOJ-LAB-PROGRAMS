import java.util.*;
abstract class shape
{
double a,b;
abstract void printArea ();
}
 class rectangle extends shape
{
  void getdata (double x,double y)
{
 a=x;
b=y;
}
  void printArea()
{
System.out.println("area of rectangle="+(a*b));
}
}
class triangle extends shape
{
void getdata(double x,double y)
{
 a=x;
b=y;
}
void printArea()
{
  double area=0.5*a*b;
System.out.println("Area of triangle="+ area);
}
}
 class circle extends shape

{
   void getdata(double x)
{
 a=x;
}
void printArea()
{
 double area=3.14*a*a;
System.out.println("Area of circle ="+area);
}
}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ch;
shape si;
rectangle r=new rectangle();
triangle t=new triangle();
circle c=new circle();
System.out.println("\n 1.Rectangle \n 2.Triangle \n 3.circle \n enter your choice:");
ch=sc.nextInt();
switch(ch)
{
 case 1:System.out.println("enter the length and breadth:");
            double l=sc.nextDouble();
             double b=sc.nextDouble();
              r.getdata(l,b);
           r.printArea();
break;
case 2:
System.out.println("enter the base and  height");
 double b1=sc.nextDouble();
 double h=sc.nextDouble();
t.getdata(b1,h);
           t.printArea();
break;
case 3:
System.out.println("enter the radius of the circle");
 double r1=sc.nextDouble();
 c.getdata(r1);
           c.printArea();
break;
default: System.out.println("Inavlid Input");
}
}
}

