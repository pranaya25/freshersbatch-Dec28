package org.collection.app;
import java.util.Set;
import java.util.Collections;

import java.util.TreeMap;
import org.collection.app.TreeMapEx.gen;	
importjava.lang.org.collection app.TreeMap;
import java.util.Map;

public class TreeMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long,TreeMapEx> map = new TreeMap<Long,TreeMapEx>();
		TreeMapEx c1 = new TreeMapEx((long)99876768, "pranaya", "pranaya@gmail.com", gen.M);
		TreeMapEx c2 = new TreeMapEx((long)789857548, "bbbb", "bbb@gmail.com",gen.F);
		TreeMapEx c3 = new TreeMapEx((long)8967785767,"cccc", "manu@gmail.com",gen.F);
		TreeMapEx c4 = new TreeMapEx((long)65789045, "prannu", "prannu"@gmail.com",gen.F);
		TreeMapEx c5 = new TreeMapEx((long)64547839, "abc", "abc@gmail.com",gen.M);
		
		map.put((long)567575887, c1);
		map.put((long)89789685, c2);
		map.put((long)879869687, c3);
		map.put((long)2355776, c4);
		map.put((long)7686959, c5);
		
		
		Map<Long,TreeMapEx> sortedMapDesc = new TreeMap<>(
			Collections.reverseOrder());
			sortedMapDesc.putAll(map);
			for(Map.Entry<Long, Contact> entry1: sortedMapDesc.entrySet())
			{
				Long key = entry1.getKey();
				Contact c = entry1.getValue();
				System.out.println(key + " -->Phone Number in descending order");
				System.out.println(c.name+" "+c.email+" "+c.g +  " -->Other Details");
				System.out.println(c.phn + " "+ c.name+ " "+ c.email+ " "+ c.g + " -->Full Details");
				
			}
			
		}


	}


