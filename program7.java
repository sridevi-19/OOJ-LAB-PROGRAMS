import java.util.*;
     class fatherAgeException extends Exception
     {
    public String toString()
    {
        return ("father's age is less than 0");
    }
    }
    class sonAgeException extends Exception
    {
    int a;
    sonAgeException(int age)
    {
        a=age;
    }
    public String toString()
    {
        if(a<0)
        return("son's age is less than 0");
        else 
        return ("son's age is more than fathers age");
    }}
    class father 
    {
        public int age;
        Scanner scan=new Scanner(System.in);
        int age1;
        father()
        {
            System.out.println("enter fathers age ");
            age1=scan.nextInt();
            
        }
        void ex1() throws fatherAgeException
           {
            if(age1<0)
            throw new fatherAgeException();
            
        }
    }
    class son extends father
    {
        public int age2;
        son()
        {
            System.out.println("enter son's age");
             Scanner scan=new Scanner(System.in);
             age2=scan.nextInt();
             
        }
        void ex2() throws sonAgeException
        {
            if(age2<0||age2>super.age1)
            throw new sonAgeException(age2);
        }
    }
     public class main
    {
        public static void main(String args[])
        {
            son s=new son();
            try
            {
                s.ex1();
            }
            
            catch(fatherAgeException e)
            {
                System.out.println(e);
            }
            try
            {
                s.ex2();
                
            }
            catch(sonAgeException e)
            {
                System.out.println(e);
            }
        }
    }
