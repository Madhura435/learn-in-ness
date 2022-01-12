package junitnesstest;

import java.lang.System.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class Practice {
public static void main(String[] args)
{
	Map<Integer,Boolean> y=new LinkedHashMap<Integer,Boolean>();
	 y.put(1,true);
	 y.put(2,true);
	 y.put(3,true);
	 y.put(4,true);
	 y.put(5,true);
	 y.put(6,true);
	 y.put(7,true);
	 int a=5;
	 for(Map.Entry<Integer,Boolean> p:y.entrySet())
	 {
		 Boolean x=p.getValue();
		 System.out.println(p.getKey());
	 }
}
}