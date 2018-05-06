package com.dynamicproxy.project;
/**
 * ���ǵĴ�������
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
  
	private Star realStar;//��ʵ����
	
	//ͨ������������ʼ����ʵ��ɫ
    public StarHandler(Star realStar) {
        super();
        this.realStar = realStar;
    }
    
    /**
     * ���е����̿��ƶ���invoke������
     * proxy��������
     * method�����ڵ��õķ���
     * args�������Ĳ���
     */	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		System.out.println("��ʵ��ɫ����֮ǰ�Ĵ���.....");
		 if (method.getName().equals("sing")) {
	            object = method.invoke(realStar, args);//������õķ���
	        }
		 System.out.println("��ʵ��ɫ����֮��Ĵ���.....");
		return object;
	}

}
