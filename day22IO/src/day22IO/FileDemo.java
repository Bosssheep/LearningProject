package day22IO;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		        //File���캯����ʾ
				String pathName = "e:\\java_code\\day22e\\hello.java";
				File f1 = new File(pathName);//��Test22�ļ���װ��File����ע�⣻�п��Է�װ�������ļ������ļ��У���ɶ���
				System.out.println(f1);
				
				File f2 = new File("e:\\java_code\\day22e","hello.java");
				System.out.println(f2);
				
				//��parent��װ��file����
				File dir = new File("e:\\java_code\\day22e");
				File f3 = new File(dir,"hello.java");
				System.out.println(f3);


	}

}
