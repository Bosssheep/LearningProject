package BitOperation;

public class Muti {

	//����m*(2^n)
	public static int powerN(int m,int n){
		m = m << n;
		return m;
	}
	
	/*
	 * �ж�һ�����Ƿ�Ϊ2�Ĵη�
	 * ��λ����㣬һ����n��Ϊ2�Ĵη��Ķ�����ֻ��һλΪ1��n-1�Ķ����ư�λ��֮�෴
	 */
	public static boolean isPower(int n){
		if(n<1) return false;
		int m = n&(n-1);
		return m==0;
	}
	
	/*
	 * ����n�������ж��ٸ�1
	 * ͨ��λ�ƣ�ÿ����1���룬�ж����λ�Ƿ�Ϊ1
	 */
	public static int countOne(int n){
		int count = 0;
		while(n > 0){
			if((n&1)==1) //ͨ����1���ж����λ�Ƿ�Ϊ1
				count++; 
			n >>= 1; //����һλ
		}
		return count;
	}
	
	/*
	 * ����n�������ж��ٸ�1
	 * n&(n-1)ÿ�μ������n�ٵ�һ��1�����������λ��1��
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
