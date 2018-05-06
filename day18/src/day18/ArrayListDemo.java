package day18;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * arraylist´æ´¢int
		 */
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(11);
		array.add(22);
		
		for(int i=0;i<array.size();i++){
			System.out.println(array.get(i));
		}
	}
}
