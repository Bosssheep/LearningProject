package com.factory.project;
/**
 * ģ��ͻ���ʵ��
 * @author HYChan
 *
 */
public class FactoryTest {

	public static void main(String[] args) {
		
		//�޹���ģʽ
		HairInterface left = new LeftHari();
		left.draw();
		HairInterface right = new RightHari();
		right.draw();
		
		System.out.println("");
		
		//����ģʽ
		HariFactory factory = new HariFactory();
		HairInterface left2 = factory.getHari("left");
		left2.draw();
		HairInterface right2 = factory.getHari("right");
		right2.draw();
		
		System.out.println("");
		
		//����ģʽ+����
		HairInterface left3 = factory.getHairByClass("com.factory.project.LeftHari");
		left3.draw();
		
		System.out.println("");
		
		//����ģʽ+����+ӳ��
		HairInterface in = factory.getHairByClassKey("in");
		in.draw();
		
		
	}
}
