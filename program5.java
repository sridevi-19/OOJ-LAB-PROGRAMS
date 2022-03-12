import java.util.*;
import .lang.Math;
class bank
{
string name;
int acc_no;
float bal,si;

void accept()
{
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of account holder:");
name=sc.nextLine();
System.out.println("Enter the account number:");
acc_no=sc.nextInt();
System.out.println("Enter account balance:");
bal=sc.nextFloat();
}
void display()
{
System.out.println("details:");
System.out.println("Name:"+name+"\n Account number:"+acc_no +"\n balance"+bal);
}
void deposits()
{
System.out.println();
Scanner sc=new Scanner(System.in);
System.out.println("\n Do you want to deposit(1 for yes,2 for no):");
int d=sc.nextInt();
if(d==1)
{
System.out.println("Enter the amount to be deposited:");
int amt=sc.nextInt();
bal=bal+amt;
System.out.println("Available balance="+bal);
}
}
}
class current extends bank
{
float service_charge=100;
void cheque()
{
 System.out.println("\n cheque service available");
}
void withdrawal()
{
float amount;
Scanner sc=new Scanner(System.in);
System.out.println("minimum balance=rs.1000.00");
System.out.println("Enter the amount to be withdrawn");
amount=sc.nextFloat();
if(amount>bal)
System.out.println("Balance is insufficient");
else
{
bal=bal-amount;
if(bal<1000)
{
bal=bal-service_charge;
System.out.println("Service charge of Rs"+service_charge+"is added");
System.out.println("Available balance="+bal);

}
else
{
System.out.println(amount+"withdrawn");
System.out.println("Available balance="+bal);
}
}
}
}
class savings extends banks
{
 void cheque()
{
System.out.println('\n No cheque services");
}
void simple_interest()
{
 System.out.println();
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter rate of interest:");
int r=sc.nextInt();
System.out.println("Enter the time elapse:");
int t=sc.nextInt();
si=bal*(1+r/n);
System.out.println("simple interest=Rs"+(Math.pow(si,n*t)));
}
void withdrawal()
{
float amount;
Scanner sc=new Scanner(System.in);
System.out.println("No minimum balance required");
System.out.println("Enter the amount to be withdrawn:");
amount=sc.nextFloat();
if(amount>bal)
System.out.println("Balance insufficient");
else
{
bal=bal-amount;
System.out.println(amount+"withdrawn");
System.out.println("Available balance="+bal);
}
}
}
public class Main
{
 public static void (String args[])
{
savings obj1=new savings();
current obj2=new current();
System.out.println("1.Savings");
System.out.println("2.Current");
System.out.println("Enter your choice");
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();
switch(ch)
{
 case1:obj1=new savings();
obj1.accept();
obj1.display();
obj1.cheque();
obj1.deposits();
obj1.simple_interest();
obj1.withdrawal();
break;
case 2:obj2 =new current();
obj2.accept();
obj2.display();
obj2.cheque();
obj2.deposits();
obj2.withdrawal();
break;
default:
System.out.println("Invalid input");
}
}
}


