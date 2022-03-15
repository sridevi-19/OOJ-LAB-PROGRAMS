import CIE.*;
import SEE.*;
import java.util.*;
class totalmarks
{
public static void main(String args[])
{
 int i,j,n;
Scanner sc=new Scanner(System.in);
int total[]=new int[5];
System.out.println("Enter the number of students:");
n=sc.nextInt();
CIE.student s[]=new CIE.student[n];
CIE.internals ci[]=new CIE.internals[n];
SEE.externals se[]=new SEE.externals[n];
for(i=0;i<n;i++)
{
System.out.println("Enter student "+(i+1)+"details");
s[i]=new CIE.student();
s[i].accept();
ci[i]=new CIE.internals();
ci[i].accept();
se[i]=new SEE.externals();
se[i].accept();
}
for( i=0;i<n;i++)
{
System.out.println("details of student"+(i+1));
s[i].display();
for(j=0;j<5;j++)
{
total[j]=ci[i].ciem[j]+se[i].seem[j];
System.out.println("Total marks in subject"+(j+1)+":"+total[j]);
}
System.out.println();
}
}
}