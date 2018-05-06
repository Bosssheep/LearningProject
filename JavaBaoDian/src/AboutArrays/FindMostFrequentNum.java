package AboutArrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 在数组中找重复最多的数
 * @author HYChan
 *
 */
public class FindMostFrequentNum {

	public static int findMostFrequentNum(int[] arr){
		int result = 0;
		int len = arr.length;
		
		//用map存储每个数出现的次数
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i < len;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		
		//找出出现次数最多的那个数
		int most = 0;
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) iter.next();
			int value = entry.getValue();
			if(value > most){
				most = value;
				result = entry.getKey();
			}
		}
		return result;
	}
}
