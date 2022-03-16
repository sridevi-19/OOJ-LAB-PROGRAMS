import java.util.*;
class Stack
{
	int top=-1,s[],size;
	Stack(int size)
	{
		this.size = size;
		s = new int[size];
	}
	void insert(int item)
	{
		if(top==size-1)
		{
			System.out.println("Stack Overflow");
			return;
		}
		s[++top]=item;
	}
	void delete()
	{
		if(top==-1)
		{
			System.out.println("Stack empty");
			return;
		}
		System.out.println("Item deleted :"+ s[top--]);
	}
	void display()
	{
		for(int i = 0;i<=top;i++)
		{
			System.out.println(i+":"+s[i]);
		}
	}
}


public class stackOP {
	public static void main(String args[])
	{
		Stack s1 = new Stack(5);
		for(;;)
		{
			
			System.out.println("1:insert\n2:delete\n3:display\n4:exit\nEnter your choice");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the item");
				int item = sc.nextInt();
				s1.insert(item);
				break;
			case 2:
				s1.delete();
				break;
			case 3:
				s1.display();
				break;
			default:
				System.exit(0);
			}
		}
	}
}