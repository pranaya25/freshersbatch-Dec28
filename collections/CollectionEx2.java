package org.collection.app;
import java .util.*;
public class CollectionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,6,8,5,9,6,9,2};
		ArrayList<Integer> a = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<>();
		for(int i : arr)
		{
			if(!hs.contains(i)) 
			{
				a.add(i);
				hs.add(i);
				
			}
		}
		for (int i : a)
		{
			System.out.print(i + " ");
		}
	}



	}


