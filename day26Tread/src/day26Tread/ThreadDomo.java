package day26Tread;
/*
 * ����������һ���߳�:
 * 		����Thread�������
 *      ���������÷���start()
 */
public class ThreadDomo {

	public static void main(String[] args) {
		SubThread st = new SubThread();
		st.start();
		
		for(int i = 0;i<50;i++){
			System.out.println("main..."+i);
		}
	}
}
