package com.immoc.template;

public class RefreshDrinkTest {

	public static void main(String[] args) {
		
		System.out.println("����Ҫһ������");
		
		RefreshDrink coffee = new Coffee();
		coffee.prepareDrinkTemplate();
		
		System.out.println("���ˣ����Ŀ��Ⱥ���~");
		
		System.out.println("------------------");
		
		System.out.println("�Ʊ�һ����");
		RefreshDrink tea = new Tea();
		tea.prepareDrinkTemplate();
		System.out.println("һ�����Ѻã�������");
	}
}
