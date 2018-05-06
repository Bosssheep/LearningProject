package demo;

public class SplitDemo {
	public static void main(String[] args) {
		split_1();
	}
	
	public static void split_1(){
		String str = "12-25-36-98";
		String[] strArr = str.split("-");
		
		for(int i=0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
	}
}
