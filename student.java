package CIE;
import java.util.*;
public class student
{
 Scanner sc= new Scanner (System.in);
public String usn,name;
public int sem;

public void accept()
{
 System.out.println("Enter usn:");
usn=sc.nextLine();
 System.out.println("Enter name:");
name=sc.nextLine();
System.out.println("Enter sem:");
sem=sc.nextInt();
}
public void display()
{
System.out.println("Name:"+name);
System.out.println("USN:"+usn);
System.out.println("Sem:"+sem);
}
}
