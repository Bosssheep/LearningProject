package com.immoc.template;
/**
 * ������࣬Ϊ���������ṩһ���㷨���
 * @author HYChan
 *
 */
public abstract class RefreshDrink {

	/**
	 * �Ʊ����ϵ�ģ�巽��
	 * ��װ���������๲ͬ���㷨���
	 */
	public final void prepareDrinkTemplate(){
		//1.��ˮ���
		boilWater();
		//2.��������
		brew();
		//3.���뱭��
		pourInCup();
		
		if(isCustomerWantsCondiments()){
			//4.�����ζ��
			addCondiments();
		}
		
	}

	//������������ˮ���
	private void  boilWater(){
		System.out.println("��ˮ���");
		
	}

	//���������������ϵ��뱭��
	private void pourInCup() {
		System.out.println("���뱭��");
	}

	//���󷽷�����������
	protected abstract void brew() ;

	//���󷽷��������ζ��
	protected abstract void  addCondiments();
	
	//���Ӻ������ṩһ��Ĭ�ϻ�յ�ʵ��
	//���������������о����Ƿ�ҹ��Լ���ιҹ�
	//ѯ���û��Ƿ�������
	protected boolean isCustomerWantsCondiments(){
		return true;
	}
}
