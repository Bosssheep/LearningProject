package com.staticproxy.project;
/**
 * �����ɫ�д�������ʵ��ɫ����Ҫ�Ĳ��������裩
 * @author HYChan
 *
 */
public class ProxyStar implements Star {
	private Star star;////��ʵ��������ã����ǣ�

    public ProxyStar(Star star) {//ͨ������������ʵ��ɫ��ֵ
        this.star = star;
    }
    
    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }
    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }
    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }
    @Override
    public void sing() {
        star.sing();//��ʵ����Ĳ��������ǳ��裩
    }
    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }

}
