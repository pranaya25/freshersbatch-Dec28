package org.generics.app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ExchangeEelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap1();
	}
	public static final <T> void swap (T[] a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
		}

		public static final <T> void swap (List<T> b, int i, int j) {
		Collections.<T>swap(b, i, j);
		}

		private static void swap1() {
		Integer [] a = {100, 99};
		swap(a, 0, 1);
		System.out.println("a:"+Arrays.toString(a));
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(a));
		swap(b, 0, 1);
		System.out.println("b:"+b);
		}

}
