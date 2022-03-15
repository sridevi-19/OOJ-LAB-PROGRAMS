package CIE;
import java.util.*;
public class internals extends CIE.student
{
  Scanner sc=new Scanner(System.in);
public int ciem[]=new int[5];
public void accept()
{
for(int i=0;i<5;i++)
{
 System.out.println("Enter cie marks of subject"+(i+1));
ciem[i]=sc.nextInt();
}
}
}
