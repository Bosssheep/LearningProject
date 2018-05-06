package AboutArrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * �����������ظ�������
 * @author HYChan
 *
 */
public class FindMostFrequentNum {

	public static int findMostFrequentNum(int[] arr){
		int result = 0;
		int len = arr.length;
		
		//��map�洢ÿ�������ֵĴ���
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i < len;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		
		//�ҳ����ִ��������Ǹ���
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
