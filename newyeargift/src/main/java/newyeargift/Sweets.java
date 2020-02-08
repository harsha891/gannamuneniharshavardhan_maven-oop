package newyeargift;

import java.util.ArrayList;

public class Sweets {

	ArrayList<String> sweet;
	Sweets(int n){
		sweet =new ArrayList<String>(n);
	}
	void insert(String sweet_name)
	{
		sweet.add(sweet_name);
	}
	void print()
	{
		for(String i:sweet)
		{
			System.out.print(i+" ");
		}
	}
}
