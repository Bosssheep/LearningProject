package day22IO;

import java.io.File;
import java.io.IOException;

public class FileMethodDemo2{

	public static void main(String[] args) throws IOException {
		File file = new File("e:\\file.txt");
		
 
		// �����ļ�������ļ������ڣ�����,���� true������ļ����ڣ��򲻴������� false�� ���·������IOException��
		boolean iscreate = file.createNewFile();
		System.out.println("is create?:" + iscreate);
		
		//-----------ɾ���ļ�����-------ע�⣺��ȥ����վ������------
		boolean isdelete  = file.delete();
		System.out.println("is delete?:" + isdelete);
		
		//-----------��Ҫ�ж��ļ��Ƿ����------------
		boolean isexist = file.exists();
		System.out.println("is exists?:" + isexist);
		
		
		//-----------��Ŀ¼���� ������ɾ�����ж�------------
		boolean iscreatedir = file.mkdir();
		System.out.println(iscreatedir);
		
		
		
	}

}
