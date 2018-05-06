package com.abstractfactory.project;
/**
 * ģ��ͻ���ʵ��
 * @author HYChan
 *
 */
public class FactoryTest {

	public static void main(String[] args) {

		System.out.println("���������⹤������");
		System.out.println("");
		
		PersonFactory factory2 = new MCFactory();
		Girl girl = factory2.getGirl();
		girl.drawWomen();
		
		PersonFactory factory3 = new HNFactory();
		Boy boy = factory3.getBoy();
		boy.drawMan();
		
	}
}
