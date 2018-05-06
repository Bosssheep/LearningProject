package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {

	/**
	 * Generates all combinations and output them.
	 * selecting n elements from data.
	 */
	public void combinations(List<Integer> selectedList,List<Integer> data,int n){
		
		if(n==0){
			//output all selected elements + empty list
			for(Integer i : selectedList){
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
			return;
		}
			
		if(data.isEmpty()){
			return;
		}
		
		selectedList.add(data.get(0));
		combinations(selectedList,data.subList(1, data.size()),n-1);
		
		selectedList.remove(selectedList.size()-1);
		combinations(selectedList,data.subList(1, data.size()),n);
	}
	
	public static void main(String[] args){
		Combination comb = new Combination();
		comb.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4,5),2);
	}
}
