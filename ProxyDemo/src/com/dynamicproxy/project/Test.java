package com.dynamicproxy.project;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		//��ʵ������ ë����
		Star realStar = new RealStar("ë����");
		//ë���׵Ĵ�������
		 StarHandler handler = new StarHandler(realStar);
		 //�ṩ��sing���������� 
		 Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
	     //���ô�����ĳ��跽������ʵ���õ�����ʵ��ɫ�ĳ��跽��
		 proxy.sing();
	}
}
