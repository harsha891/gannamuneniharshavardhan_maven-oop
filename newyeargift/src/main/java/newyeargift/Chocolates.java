package newyeargift;

import java.util.*;
public class Chocolates {

	ArrayList<String> choco;
	Chocolates(int n){
		choco = new ArrayList<String>(n);
	}
	void insert(String choco_name)
	{
		choco.add(choco_name);
	}
	void print()
	{
		for(String i:choco)
		{
			System.out.print("\n\t"+i+" ");
		}
	}
}
