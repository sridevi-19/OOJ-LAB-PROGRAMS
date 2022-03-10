// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class NewThread implements Runnable 
{
    String name;
    long time1;
    int x;
    Thread t;
    NewThread(String threadname,long time,int x1)
    {
        name=threadname;
        x=x1;
        time1=time;
        t=new Thread(this,name);
        t.start();
        
    }
    public void run()
    {
        try
        {
            for(int i=x;i>0;i--)
            {
                System.out.println(name);
                Thread.sleep(time1);
                
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(name+"Interrupted");
        }
    }
}
class week11Thread
{
    public static void main(String args[])
    {
        new NewThread("BMS COLLEGE OF ENGINEERING",10000,2);
        new NewThread("CSE",2000,10);
    }
}