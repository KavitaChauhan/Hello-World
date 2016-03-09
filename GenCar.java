package GenericIntro.com;
import java.util.*;
import java.io.*;

public class GenCar<T> extends CustomClass{
	public T t;

	 void setT(T t)
	{
		this.t = t;
	}
	 T getT()
	{
		return t;
	}
	 public void display()
	{
		List<String> lst1 = new ArrayList<String>();
		List<Integer> lst2 = new ArrayList<Integer>();
	System.out.println("List of type String............");
	addelement("Kavita Chauhan",lst1);
	addelement("Himani Rastogi",lst1);
	addelement("Ankit Chauhan",lst1);
	addelement("Arnav Singh Chauhan",lst1);
	addelement("Parul Tomar",lst1);
	Iterator itr = lst1.iterator();
	while(itr.hasNext())
	{		String element = (String)itr.next();
			System.out.println(element);
	}
	System.out.println();
	System.out.println();
	System.out.println("List of type Integer............");
	addelement(34,lst2);
	addelement(65,lst2);
	addelement(12,lst2);
	addelement(39,lst2);
	addelement(42,lst2);
	Iterator itr1 = lst2.iterator();
	while(itr1.hasNext())
		{		Object element =itr1.next();
				System.out.println(element);
		}
	}
}

