package AboutArrays;
/**
 * 找最大和子数组
 * @author HYChan
 *
 */
public class MaxSubArrays {

	public static int maxSubArrays1(int[] arr){
		//暴力法
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
		 * 使用动态规划
		 * 每个数组arr[i]与arr[0,...,i]中最大子数组的关系：
		 * （1）最大子数组包含arr[i],即以arr[i]结尾
		 * （2）arr[n-1]单独构成最大子数组
		 * （3）最大子数组不包含arr[i]，所以arr[0,...,i]最大子数组为arr[0,...,i-1]的最大子数组
		 */
		int len = arr.length;
		int End[] = new int[len];//End[i]保存包括arr[0],...,arr[i]中包括arr[i]在内的最大的一段子数组和
		int All[] = new int[len];//All[i]保存arr[0],...,arr[i]最大的一段数组和
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
		 * 优化空间消耗后的动态规划
		 * 发现上述的关系式中只使用了End[i-1]以及All[i-1] 故用两个变量来保存其值
		 * 降低空间复杂度
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
		 * 要求确定最大子数组的起始位置和结束位置
		 * nEnd = Math.max(nEnd+arr[i], arr[i])可以改写成if-else语句，
		 * 当End[i-1]<0时，End[i]=arr[i],起始位置更新为i;
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
