package SEE;
import CIE.*;
import java.util.*;
public class externals extends CIE.student
{
 Scanner sc=new Scanner(System.in);
public int seem[]=new int[5];
public void accept()
{
for(int i=0;i<5;i++)
{
System.out.println("Enter SEE marks of subject"+(i+1));
 seem[i]=sc.nextInt();
}
}
}