import java.util.*;
class student
{
  static String usn, name;
  static int n;
  static int credits[];
  static int marks[];
  static float sgpa;
  static void accept()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the USN: ");
    usn= sc.nextLine();
    System.out.println("Enter the name: ");
    name= sc.nextLine();
    System.out.println("Enter the number of subjects: ");
    n= sc.nextInt();
    credits=new int[n];
    marks=new int[n];
    System.out.println("Enter the credits:");
    for(int i = 0; i < n; i++)
    {
         System.out.print("Subject "+(i+1)+":");
         credits[i] = sc.nextInt();
    }
    System.out.println("Enter the marks out of 100:");
    for(int i = 0; i < n; i++)
    {
         System.out.print("Subject "+(i+1)+":");
         marks[i] = sc.nextInt();
    }
  }
  static void sgpacalc()
  {
    sgpa=0f;
    int sum=0;
    for(int i=0;i<n;i++)
    {
         int s=marks[i],c;
         if(s>=90)
           c=10;
         else if((s>=80)&&(s<=90))
           c=9;
         else if((s>=70)&&(s<=80))
           c=8;
         else if((s>=60)&&(s<=70))
           c=7;
         else if((s>=50)&&(s<=60))
           c=6;
         else if((s>=40)&&(s<=50))
           c=5;
         else
           c=0;
         sgpa=sgpa+(c*credits[i]);
         sum=sum+credits[i];
      }
      sgpa/=sum;    
  }
  static void display()
  {
     System.out.println("USN: "+usn);
     System.out.println("Name: "+name);
     System.out.println("Subjects\tCredits\tMarks");
     for(int i = 0; i < n; i++)
     {  
       System.out.println("   "+(i+1)+"    \t"+"   "+credits[i]+"   \t  "+marks[i]);
     }
     System.out.println("SGPA: "+sgpa);
  }  
   
  public static void main(String args[])
  {
    accept();
    sgpacalc();
    display();
  }
}

   