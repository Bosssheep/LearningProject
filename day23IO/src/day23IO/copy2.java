package day23IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;;

/*
 * �ֽ��������ļ�
 * �������黺�����Ч��
 * ��ȡ�ֽ�����
 * ��ȡ�ֽ�����
 */
public class copy2 {

	public static void main(String[] args) {
		 FileInputStream fis = null;
		 FileOutputStream fos = null;
		 
		 try{
			 fis = new FileInputStream("d:\\adt-bundle-windows-x86_64-20140321.zip");
			 fos = new FileOutputStream("d:\\z.zip");
			 
			 byte[] bytes = new byte[1024];
			 int len = 0 ;
			 while((len = fis.read(bytes))!=-1){
				 fos.write(bytes,0,len);
			 }
		 }catch(IOException ex){
			    System.out.println(ex);
				throw new RuntimeException("copy error");
		 }finally{
			//����
			 try{
				  if(fos!=null) fos.close();
				}
			 catch(IOException ex){
					throw new RuntimeException("close fos error");
				}
			 finally{
					try{
						if(fis!=null)
							fis.close();
					}
					catch(IOException ex){
						throw new RuntimeException("close fis error");
					}
					 
		     }
         }
	}
}
