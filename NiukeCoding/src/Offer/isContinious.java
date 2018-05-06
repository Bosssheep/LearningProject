package Offer;
/**
 * 扑克牌顺子
 * 判断是否为顺子，0可当任何数字
 * from：剑指Offer
 */
import java.util.Arrays;

public class isContinious {

	public boolean Continuous(int [] numbers) {

	    int ZeroNumbers = 0;
	    int TotalIntervalNumbers = 0;
	    int length = numbers.length;
	    
	    if(length == 0)
	    	return false;
	    
		Arrays.sort(numbers);
		
		for(int i = 0;i < length-1;i++){
			if(numbers[i]==0){
				ZeroNumbers++;
				continue;
			}
			else if(numbers[i]==numbers[i+1]){
				return false;
			}
			TotalIntervalNumbers = TotalIntervalNumbers+numbers[i+1]-numbers[i]-1;
		}
		
		if(ZeroNumbers>=TotalIntervalNumbers){
			return true;
		}
		
		return false;
    }
}
