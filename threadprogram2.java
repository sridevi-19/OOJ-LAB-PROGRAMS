import java.util.*;
class NewThread implements Runnable
{
 int i;String name;
Thread t;
NewThread(String  threadname)
{
 name=threadname;
t=new Thread(this,name);
System.out.println("New thread:"+t);
t.start();
}
public void run()
{
try
{
 for( i=5;i>0;i--);
{
 System.out.println(name+":"+ i);
  Thread.sleep(10000);
}
}
catch(InterruptedException e)
{
System.out.println(name+"Interrupted");
}
System.out.println(name+"exiting");
}
}
class MultiThreadDemo
{
 public static void main(String args[])
{
 new NewThread("one");
new NewThread("two");
new NewThread("three");
 try{
Thread.sleep(10000);
}
catch(InterruptedException e)
{
System.out.println("Main thread Interrupted");
}
System.out.println("Main thread exiting");
}
}