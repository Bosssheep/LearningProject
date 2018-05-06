package com.staticproxy.project;
/**
 * ��ʵ��ɫ����ʵֻ����һ������Ĳ���
 * ������ʵ��ɫ������ҵ���߼�����
 * @author HYChan
 *
 */
public class RealStar implements Star {

	private String starName;
	public RealStar(String name){
		starName = name;
	}
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }
    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }
    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }
    @Override
    public void sing() {
        System.out.println(starName+"����");//��ʵ��ɫ�Ĳ�����������ҵ���߼�
    }
    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }

}
