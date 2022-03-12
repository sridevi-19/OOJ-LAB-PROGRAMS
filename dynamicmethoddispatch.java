import java.util.*;
class area1
{
int a,b;
area1(int x,int y)
{
  a=x;
  b=y;
}
double area()
{
 System.out.println("Area is not defined");
 return 0;

}
}
class rectangle extends area1
{
rectangle(int x,int y)
{
 super(x,y);
}
double area()
{
 double c1;
c1=a*b;
return c1;
}
}
class triangle extends area1
{
 triangle(int x,int y)
{
super(x,y);
}
double area()
{
 double t1;
t1=0.5*a*b;
return t1;
}
}
class dynamic
{
 public static void main(String args[])
{
  area1 a1=new area1(0,0);
  rectangle r1=new rectangle(15,30);
  triangle t=new triangle(10,20);
  area1 a;
a=a1;
System.out.println("Area of area1 is:"+a.area());
a=r1;
System.out.println("Area of rectangle is:"+a.area());
a=t;
System.out.println("Area of triangle is:"+a.area());
}
}


