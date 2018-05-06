package BitOperation;

public class Muti {

	//计算m*(2^n)
	public static int powerN(int m,int n){
		m = m << n;
		return m;
	}
	
	/*
	 * 判断一个数是否为2的次方
	 * 按位与计算，一个数n是为2的次方的二进制只有一位为1，n-1的二进制按位与之相反
	 */
	public static boolean isPower(int n){
		if(n<1) return false;
		int m = n&(n-1);
		return m==0;
	}
	
	/*
	 * 计算n二进制有多少个1
	 * 通过位移，每次与1想与，判断最低位是否为1
	 */
	public static int countOne(int n){
		int count = 0;
		while(n > 0){
			if((n&1)==1) //通过与1与判断最低位是否为1
				count++; 
			n >>= 1; //左移一位
		}
		return count;
	}
	
	/*
	 * 计算n二进制有多少个1
	 * n&(n-1)每次计算会让n少掉一个1，而且是最低位的1。
	 */
	public static int countOne2(int n){
		int count = 0;
		while(n > 0){
			n = n&(n-1);
			count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int n = 15;
		int i = countOne(n);
		System.out.println(i);
	}
}
