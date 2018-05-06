package recursion;
/*
 * 汉诺塔递归法
 * time：2018-3-22
 */
public class Hanoi {

	public static void main(String[] args) {
		//Test
		int n = 3;
		char A = 'A',B = 'B',C = 'C';
		Hanoi.hanoi(n, A, B, C);

	}
	
	public static void hanoi(int n,char A,char B,char C){
		if(n == 1)
			Hanoi.move(1,A,C);
		else{
			hanoi(n-1,A,C,B);//递归，把A塔上编号1~n-1的圆盘移到B上，以C为辅助塔
			Hanoi.move(1,A,C);//把A塔上编号为n的圆盘移到C上
			hanoi(n-1,B,A,C);//递归，把B塔上编号1~n-1的圆盘移到C上，以A为辅助塔
		}
	}
	
	public static void move(int disks,char from,char to){
		System.out.println("把"+from+"移动到"+to+"上");
	}

}
