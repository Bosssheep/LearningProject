package Offer;
/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 请找出数组中任意一个重复的数字。 
 * from：剑指offer
 * @author HYChan
 *
 */
public class DuplicateSum {

	// Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
	//例如：如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
	public static boolean duplicate(int numbers[],int length,int[] duplication){
		
		if(length==0){
			 duplication[0]=-1;
			 return false;
		}
			
		int[] map = new int[length];
		for(int i=0;i < 1024;i++){
			map[i] = 0;
		}
		for(int i = 0;i < length;i++){
			if( map[numbers[i]] == 0)
				map[numbers[i]]++;
			else{
				duplication[0] = numbers[i];
				return true;
			}
				
		}
		return false;
	}
	public static void main(String[] args) {
		

	}

}
