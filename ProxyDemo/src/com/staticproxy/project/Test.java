package com.staticproxy.project;

public class Test {

	public static void main(String[] args) {
		 Star real = new RealStar("ë����");
		 Star proxy = new ProxyStar(real);
		 proxy.confer();
		 proxy.signContract();
		 proxy.bookTicket();
		 proxy.sing();//��ʵ����Ĳ��������ǳ��裩
		 proxy.collectMoney();
	}
}
