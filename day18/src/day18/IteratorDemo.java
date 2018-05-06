package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		/*
		 * 迭代器:	面向接口
		 */
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		/*
		 * 迭代器,对ArrayList中的元素进行遍历
		 */
		
		//1、调用iterator获取出Iterator接口的实现类
		Iterator<String> it = coll.iterator();
		//2、接口实现类对象，调用hasNext()判断集合是否有元素,调用next()方法取出集合中的元素		
		while(it.hasNext()){
			String s = it.next();
		}
	}
}
