package DateLearn;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		//��ȡ��ǰ���ں���ֵ
		//long times = System.currentTimeMillis();
		
		Demo();
	}

	public static void Demo(){
		
		//�ղι��죬��ȡ����ǰ����ϵͳʱ��
		Date date = new Date();
		
		//���ι��죬����һ������ֵ�����ɶ�Ӧ�����ڶ���
		Date date1 = new Date(0);

		//Date���getTime()����,��ʱ��ת����һ������ֵ
		long time = date.getTime();
		
		//Date���setTime����������һ������ֵ��������ֵת����һ�����ڶ���
		date.setTime(0);
		
		//test
		System.out.println(date);
	}
}
