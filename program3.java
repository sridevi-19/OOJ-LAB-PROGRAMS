import java.util.*;


class Book
{
	String name, author;
	double price;
	int pages;
	
	/*Book(String name, String author, double price, int pages)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}*/
	
	void setValues()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter: \n\tTitle\n\tAuthor\n\tNumber of pages\n\tPrice");
		name = sc.next();
		author = sc.next();
		pages = sc.nextInt();
		price = sc.nextDouble();
	}
	
	void getValues()
	{
		System.out.println("*********Book Details**********");
		System.out.println("Title : "+name);
		System.out.println("Author : "+author);
		System.out.println("Number of pages : "+pages);
		System.out.println("Price : "+price);
		System.out.println("********************************");
	}
	public String toString()
	{
		return "Title : "+name+"\nAuthor : "+author+"\nPages : "+pages+"\nPrice : "+price;
	}
}

public class Books {

	public static void main(String args[])
	{
		int c = 0, i, ch;
		Book[] b = new Book[20];
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1:New Book\n2:Print Details \n3:Exit");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				b[c] = new Book();
				b[c].setValues();
				b[c].getValues();
				c++;
				break;
			case 2:
				System.out.println("Enter the index of the book\n");
				i = sc.nextInt();
				if(i<c && i>=0)
				{
					System.out.println(b[i].toString());
				}
				else {
					System.out.println("404  :  Book not found");
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.exit(0);
			}
		}
	}
}
