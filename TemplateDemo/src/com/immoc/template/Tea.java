package com.immoc.template;
/**
 * �������࣬ʵ�ֲ�ľ���ʵ��
 * @author HYChan
 *
 */
public class Tea extends RefreshDrink {

	@Override
	protected void brew() {
		System.out.println("��80�ȵ���ˮ���ݲ�Ҷ5����");

	}

	@Override
	protected void addCondiments() {
		System.out.println("��������");

	}
	
	/*
	 * ����ͨ�����ǵ���ʽ��ѡ���Ӻ���
	 * @see com.immoc.template.RefreshDrink#isCustomerWantsCondiments()
	 */
	protected boolean isCustomerWantsCondiments(){
		return false;
	}

}
