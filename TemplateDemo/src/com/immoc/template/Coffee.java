package com.immoc.template;

public class Coffee extends RefreshDrink{

	@Override
	protected void brew(){
		System.out.println("�÷�ˮ���ݿ���");
	}
	
	@Override
	protected void addCondiments(){
		System.out.println("�����Ǻ�ţ��");
	}
}
