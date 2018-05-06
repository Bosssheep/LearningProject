package com.abstractfactory.project;
/**
 * 模拟客户端实现
 * @author HYChan
 *
 */
public class FactoryTest {

	public static void main(String[] args) {

		System.out.println("下面是虚拟工厂代理");
		System.out.println("");
		
		PersonFactory factory2 = new MCFactory();
		Girl girl = factory2.getGirl();
		girl.drawWomen();
		
		PersonFactory factory3 = new HNFactory();
		Boy boy = factory3.getBoy();
		boy.drawMan();
		
	}
}
