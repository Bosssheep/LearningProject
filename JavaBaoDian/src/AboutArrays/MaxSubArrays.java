package AboutArrays;
/**
 * ������������
 * @author HYChan
 *
 */
public class MaxSubArrays {

	public static int maxSubArrays1(int[] arr){
		//������
		int len = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<len; i++){
			int sum = 0;
			for(int j = i;j < len; j++){
				sum += arr[j];
				if(sum > max)
					max = sum;
			}
		}
		return max;
	}
	
	public static int maxSubArrays2(int[] arr){
		/*
		 * ʹ�ö�̬�滮
		 * ÿ������arr[i]��arr[0,...,i]�����������Ĺ�ϵ��
		 * ��1��������������arr[i],����arr[i]��β
		 * ��2��arr[n-1]�����������������
		 * ��3����������鲻����arr[i]������arr[0,...,i]���������Ϊarr[0,...,i-1]�����������
		 */
		int len = arr.length;
		int End[] = new int[len];//End[i]�������arr[0],...,arr[i]�а���arr[i]���ڵ�����һ���������
		int All[] = new int[len];//All[i]����arr[0],...,arr[i]����һ�������
		End[len-1] = arr[len-1];
		All[len-1] = arr[len-1];
		End[0] = arr[0];
		All[0] = arr[0];
		
		for(int i=1;i<len;i++){
			End[i] = Math.max(End[i-1]+arr[i], arr[i]);
			All[i] = Math.max(End[i], All[i-1]);
			System.out.println(" End["+i+"]="+End[i]+" All["+i+"]="+All[i]);
		}
		
		return All[len-1];
	}
	public static int maxSubArrays3(int[] arr){
		/*
		 * �Ż��ռ����ĺ�Ķ�̬�滮
		 * ���������Ĺ�ϵʽ��ֻʹ����End[i-1]�Լ�All[i-1] ��������������������ֵ
		 * ���Ϳռ临�Ӷ�
		 */
		int len = arr.length;
		int nAll = arr[0];
		int nEnd = arr[0];
		for(int i = 1;i < len;i++){
			nEnd = Math.max(nEnd+arr[i], arr[i]);
			nAll = Math.max(nAll, nEnd);
		}
		return nAll;
	}
	
	public static int begin = 0;
	public static int end = 0;
	public static int maxSubArrays4(int[] arr){
		/*
		 * Ҫ��ȷ��������������ʼλ�úͽ���λ��
		 * nEnd = Math.max(nEnd+arr[i], arr[i])���Ը�д��if-else��䣬
		 * ��End[i-1]<0ʱ��End[i]=arr[i],��ʼλ�ø���Ϊi;
		 */
		int len = arr.length;
		int nAll = arr[0];
		int nEnd = arr[0];
		
		
		int tmpstart = 0;
		for(int i = 1;i < len;i++){
			if(nEnd < 0){
				tmpstart = i;
				nEnd = arr[i];
			}else{
				nEnd += arr[i];
			}
			if(nEnd>nAll){
				nAll = nEnd;
				begin = tmpstart;
				end = i;
			}
		}
		return nAll;
	}
	public static void main(String[] args) {
		int[] arr = new int[]{3,-1,2,-8,-2,-4,5,12};
		int max = maxSubArrays3(arr);
		int max2 = maxSubArrays4(arr);
		System.out.println("max="+max);
		System.out.println("max2="+max);
		System.out.println("begin:"+begin+" end:"+end);
	}
}
