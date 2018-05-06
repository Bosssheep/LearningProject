package day23IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ��������ļ�
 * �����ֽڶ�ȡ������
 * ���룬��ȡһ���ֽ�
 * ���룬��ȡһ���ֽ�
 */

public class copy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream("d:\\a.txt");
			fos = new FileOutputStream("d:\\b.txt");
			int len;
			while((len=fis.read())!=-1){
				fos.write(len);
			}
		}catch(IOException ex){
			System.out.println(ex);
			throw new RuntimeException("copy error");
		}finally{
			try{
				if(fos!=null)
				    fos.close();
			}catch(IOException ex){
				throw new RuntimeException("close fos error");
			}finally{
				try{
					if(fis!=null)
						fis.close();
				}catch(IOException ex){
					throw new RuntimeException("close fis error");
				}
			}	
		}
	}

}
