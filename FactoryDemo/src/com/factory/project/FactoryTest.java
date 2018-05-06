package com.factory.project;
/**
 * 模拟客户端实现
 * @author HYChan
 *
 */
public class FactoryTest {

	public static void main(String[] args) {
		
		//无工厂模式
		HairInterface left = new LeftHari();
		left.draw();
		HairInterface right = new RightHari();
		right.draw();
		
		System.out.println("");
		
		//工厂模式
		HariFactory factory = new HariFactory();
		HairInterface left2 = factory.getHari("left");
		left2.draw();
		HairInterface right2 = factory.getHari("right");
		right2.draw();
		
		System.out.println("");
		
		//工厂模式+反射
		HairInterface left3 = factory.getHairByClass("com.factory.project.LeftHari");
		left3.draw();
		
		System.out.println("");
		
		//工厂模式+反射+映射
		HairInterface in = factory.getHairByClassKey("in");
		in.draw();
		
		
	}
}
