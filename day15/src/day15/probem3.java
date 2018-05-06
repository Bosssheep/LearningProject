package day15;

public class probem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String big = "Chy chy yutongchy";
		String small = "chy";
		int count = getCount(big,small);
		System.out.println(count);
	}

	public static int getCount(String big,String small){
		int count =0;
		int index = -1;
		
		while((index = big.indexOf(small) )!= -1){
			count++;
			big = big.substring(index+1);
		}
		
		return count;
	}
}
