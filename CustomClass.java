package GenericIntro.com;
import java.util.*;
import java.io.*;

public  class CustomClass {

	public <T> void addelement(T element, Collection<T> collection)
	{
		collection.add(element);
	}
}
