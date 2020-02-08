package newyeargift;

import java.util.*;
public class Gift {

	static int total=0;
	public static void inputChocolates()
	{
		//System.out.println("AOWKW");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of chocolates:");
		int no_chocs=s.nextInt();
		total+=no_chocs;
		Chocolates c=new Chocolates(no_chocs);
		for(int i=0;i<no_chocs;i++)
		{
			System.out.print("Enter chocolate name:");
			c.insert(s.next());
		}
		
		System.out.print("Chocolate items in gift pack: ");
		c.print();
		System.out.println();
	}

	public static void inputSweets()
	{
		//System.out.println("BDFGFS;");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of sweets:");
		int no_sweets=s.nextInt();
		
		total+=no_sweets;
		Sweets m=new Sweets(no_sweets);
		for(int i=0;i<no_sweets;i++)
		{
			System.out.print("Enter sweet name:");
			m.insert(s.next());
		}
		System.out.print("Sweet items in gift pack: ");
		m.print();
		System.out.println();
		
	}
	public static void Totalitems()
	{
		System.out.print("Total no of Items in Gift pack: "+total);
		
	}
}
