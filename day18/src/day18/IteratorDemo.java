package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		/*
		 * ������:	����ӿ�
		 */
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		/*
		 * ������,��ArrayList�е�Ԫ�ؽ��б���
		 */
		
		//1������iterator��ȡ��Iterator�ӿڵ�ʵ����
		Iterator<String> it = coll.iterator();
		//2���ӿ�ʵ������󣬵���hasNext()�жϼ����Ƿ���Ԫ��,����next()����ȡ�������е�Ԫ��		
		while(it.hasNext()){
			String s = it.next();
		}
	}
}